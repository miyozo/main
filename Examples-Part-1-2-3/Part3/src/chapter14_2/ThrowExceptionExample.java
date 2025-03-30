package chapter14_2;

public class ThrowExceptionExample {

	public static void main(String[] args) {
		try {
			doSomething(-10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void doSomething(int n) throws Exception {
		if(n<0) {
			throw new Exception("不正な値:" + n);
		}
		// 何かの処理
	}
}
