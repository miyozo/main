package chapter19_2;
import jp.kwebs.lib.Tools;
public class SimpleVertualThread {
	
	public static void main(String[] args) {
		Thread.startVirtualThread(()->sometask(1.0));
		System.out.println("main-done");
	}
	public static void sometask(double seconds) {
		Tools.time_consuming_io_task(seconds);
	    System.out.println("task-done");
	}
}






