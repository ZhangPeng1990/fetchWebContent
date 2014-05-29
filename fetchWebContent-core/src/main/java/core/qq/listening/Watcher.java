package core.qq.listening;

import java.util.Date;

import org.springframework.util.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.JavaScriptPage;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;



public class Watcher implements Runnable{

	private String tagLink = null;
	private WatcherItem item = null;
	private int totalLeaveMessNum;
	private LeaveMessage leaveMessages;
	
	public Watcher(String qqNumber, WatcherItem item){
		Assert.notNull(qqNumber);
		Assert.notNull(item);
		this.item = item;
		
		tagLink = item.getOriginLink().replaceAll("QQNumber", qqNumber)
				.replaceAll("WatcherItem", String.valueOf(item.getCode()));
		
	}
	
	/*
	 * 不能抓取到js执行之后的代码，考虑用HtmlUnit
	 * 
	 * */
	private void parse(String link){
		
		String sourceCode = null;
		String htmlCode = null;
		final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_24);
		try {
			final Page page = webClient.getPage(link);
			if(page.isHtmlPage()){
				HtmlPage htmlPage = (HtmlPage)page;
				sourceCode = htmlPage.asXml();
			}else{
				JavaScriptPage jsPage = (JavaScriptPage)page;
				sourceCode = jsPage.getContent();
			}
			
			if(item.equals(WatcherItem.LEAVEMESSAGE)){
				htmlCode = sourceCode.substring(10, sourceCode.length() - 2);
				this.analysisLeaveMessageJson(htmlCode);
			}else if(item.equals(WatcherItem.TALKS)){
				
			}
//			FetchUtil.writeToLocal(htmlCode, "D:\\html.txt");
					
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
	}
	
	private void analysisLeaveMessageJson(String jsonCode){
		JSONObject leaveMessAll = (JSONObject) JSON.parse(jsonCode);
		JSONObject leaveMess = (JSONObject) leaveMessAll.get("data");
		this.totalLeaveMessNum = Integer.parseInt(leaveMess.get("total").toString());
		JSONArray commentList = (JSONArray) leaveMess.get("commentList");
		if(!commentList.isEmpty()){
			JSONObject o = (JSONObject) commentList.get(0);
			if(o != null){
				LeaveMessage lm = new LeaveMessage();
				lm.setLeaveContent(o.get("htmlContent").toString());
				lm.setLeaveTime(o.getDate("pubtime"));
				lm.setNickName(o.get("nickname").toString());
				this.leaveMessages = lm;
			}
		}
	}
	
	public void inform(){
		parse(tagLink);
		System.out.println("---------------------------监测完毕-------------------------------");
		System.out.println("监测类型：" + this.item.getDesc());
		System.out.println(this.item.getDesc() + "总数：" + this.totalLeaveMessNum);
		System.out.println("----------------------------以下为最新一条留言的详细信息------------------------------");
		this.leaveMessages.outPutDetal();
		System.out.println("----------------------------打印时间：" + new Date() + "------------------------------");
	}
	
	public String getTagLink() {
		return tagLink;
	}

	public LeaveMessage getLeaveMessages() {
		return leaveMessages;
	}

	@Override
	public void run() {
		inform();
	}
}
