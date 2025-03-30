package chapter19_2;
import java.util.concurrent.StructuredTaskScope;
import jp.kwebs.lib.Tools;

public class VSTScope2 {
	public static void main(String[] args){

		try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
			scope.fork(() -> {
				String str1 = sometask(0.5);
				System.out.println(str1);
				String str2 = sometask(0.5);
				System.out.println(str2);
				return null;
			});
			System.out.println("main");
			
			scope.join();
			scope.throwIfFailed();	
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static String sometask(double seconds) {
		Tools.time_consuming_io_task(seconds);
		return "task-done";
	}
}




















