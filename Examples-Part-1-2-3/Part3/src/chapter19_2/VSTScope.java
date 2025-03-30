package chapter19_2;
import java.util.concurrent.StructuredTaskScope;
import jp.kwebs.lib.Tools;

public class VSTScope {

	public static void main(String[] args){
		try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
			scope.fork(() -> {
				sometask(1.0);
				return null;
			});
		
			System.out.println("main");

			scope.join();
			scope.throwIfFailed();	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void sometask(double seconds) {
		Tools.time_consuming_io_task(seconds);
	    System.out.println("task-done");
	}

}