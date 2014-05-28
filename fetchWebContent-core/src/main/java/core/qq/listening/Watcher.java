package core.qq.listening;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.util.Assert;


public class Watcher {

	private String originLink = "http://user.qzone.qq.com/QQNumber/WatcherItem";
	private String tagLink = null;
	
	public Watcher(String qqNumber, WatcherItem item){
		Assert.notNull(qqNumber);
		Assert.notNull(item);
		
		tagLink = originLink.replaceAll("QQNumber", qqNumber)
				.replaceAll("WatcherItem", String.valueOf(item.getCode()));
		
		parse(tagLink);
	}
	
	private void parse(String link){
		Document htmlDoc = null;
		
		Connection conn = Jsoup.connect(link);
		conn.header("Accept", "application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		conn.header("Accept-Encoding", "gzip, deflate");
		conn.header("Accept-Language", "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3");
		conn.header("Cache-Control", "max-age=0");
		conn.header("Connection", "keep-alive");
		conn.header("Host", "user.qzone.qq.com");
		conn.header("If-Modified-Since", "Wed, 28 May 2014 08:40:57 GMT");
		conn.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0)");
		
		try {
			htmlDoc = conn.get();
			System.out.println(htmlDoc.html());
		} catch (IOException e) {
			e.printStackTrace();
		}
//		Response res = conn.response();
		Response response = null;
		try {
			response = conn.ignoreContentType(true).method(Method.GET).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String r = response.body();
		System.out.println(r);
//		Document htmlDoc = Jsoup.
	}
	
	public String getTagLink() {
		return tagLink;
	}
}
