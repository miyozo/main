package chapter7_4_2;

//静的内部クラス
public class MyMessage {
	
	private String option = "info";
	
	public void doPost(String msg) {
		MySender m = new MySender();
		m.send(msg);
	}
	// スタティックメンバにだけアクセスできる
	static class MySender {
		String url = "http://local/service";
		void send(String msg) {
			// 送信処理
		}
	}
}
