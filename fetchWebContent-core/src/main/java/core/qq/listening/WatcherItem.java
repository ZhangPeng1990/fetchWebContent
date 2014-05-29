package core.qq.listening;

public enum WatcherItem {

	TALKS("说说",311,"http://m.qzone.qq.com/cgi-bin/new/get_msgb?uin=0&hostUin=QQNumber&start=0&s=0.461334258128419&g_tk=334924963&format=jsonp&num=10"),
	LEAVEMESSAGE("留言",334,"http://m.qzone.qq.com/cgi-bin/new/get_msgb?uin=0&hostUin=QQNumber&start=0&s=0.461334258128419&g_tk=334924963&format=jsonp&num=10");
	
	private String desc;
	private int code;
	private String originLink;
	
	private WatcherItem(String desc, int code, String originLink){
		this.desc = desc;
		this.code = code;
		this.originLink = originLink;
	}

	public String getDesc() {
		return desc;
	}

	public int getCode() {
		return code;
	}

	public String getOriginLink() {
		return originLink;
	}
}
