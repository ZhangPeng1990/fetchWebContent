package core.qq.listening;

public class TestLis {

	public static void main(String[] args) {
		String qq = "65003427";
		WatcherItem item = WatcherItem.LEAVEMESSAGE;
		
		Watcher watcher = new Watcher(qq, item);
	}
}
