package chapter14_1;

public class HowExceptionsWork {
	public static void main(String[] args) {
		A();
		System.out.println("main-正常終了");
	}
	public static void A() {
		try {
			B();
		} catch (Exception e) {
			System.err.println(e + "Aで例外対策を実行した");
		}
		System.out.println("A-正常終了");
	}
	public static void B() {
		C();
		System.out.println("B-正常終了");
	}
	public static void C() {
		throw new RuntimeException();
	}
}
