package core.qq.listening;

import java.util.Date;

public class LeaveMessage {

	private Date leaveTime;
	private String leaveContent;
	private String nickName;
	
	public Date getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}
	public String getLeaveContent() {
		return leaveContent;
	}
	public void setLeaveContent(String leaveContent) {
		this.leaveContent = leaveContent;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void outPutDetal(){
		System.out.println("留言人昵称：" + this.nickName);
		System.out.println("留言时间：" + this.leaveTime);
		System.out.println("留言内容：" + this.leaveContent);
	}
}
