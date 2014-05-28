package core.qq.listening;

public enum WatcherItem {

	TALKS("说说",311),
	LEAVEMESSAGE("留言",334);
	
	private String desc;
	private int code;
	
	private WatcherItem(String desc, int code){
		this.desc = desc;
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public int getCode() {
		return code;
	}
}
