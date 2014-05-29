package core.qq.listening;

public class StartWatch {

	public static void main(String[] args) {
		String qq = "65003427";
		WatcherItem item = WatcherItem.LEAVEMESSAGE;
		Watcher watcher = new Watcher(qq, item);
		Thread t = new Thread(watcher);
		startWather(t);
	}
	
	public static void startWather(Thread t){
		t.run();
		try {
			t.sleep(50000);
			startWather(t);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
