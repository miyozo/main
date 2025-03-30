package chapter19_1;
public class SimpleThreadExample {

	public static void main(String[] args) {
		var t = new Thread(()->System.out.println("another-thread"));
		t.start();
		System.out.println("main-end");
	}
}
