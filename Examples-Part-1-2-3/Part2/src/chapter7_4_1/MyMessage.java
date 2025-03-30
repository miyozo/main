package chapter7_4_1;

// 内部クラス
public class MyMessage {
	
	private String option = "info";
	
	public void doPost(String msg) {
		MySender m = new MySender();
		m.send(msg);
	}
	// クラスメンバ
	class MySender {
		String url = "http://local/service" + option;
		void send(String msg) {
			// 送信処理
		}
	}
}
