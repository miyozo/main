package chapter7_4_3;

//静的内部クラス
public class MyMessage {
	
	private String option = "info";
	
	public void doPost(String msg) {
		MySender.send(msg);
	}
	// staticなメソッド
	static class MySender {
		String url = "http://local/service";
		static void send(String msg) {
			// 送信処理
		}
	}
}