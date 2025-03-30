package chapter19_2;
import java.util.concurrent.StructuredTaskScope;
import jp.kwebs.lib.Tools;

public class VSTScope3 {
	public static void main(String[] args){
		try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
			var subtask1 = scope.fork(()->{
				String str1 = sometask(0.5);
				return str1;
			});
			var subtask2 = scope.fork(()->{
				String str2 = sometask(0.5);
				return str2;
			});
			scope.join();
			scope.throwIfFailed();
			System.out.println(subtask1.get() + ":" + subtask2.get());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static String sometask(double seconds) {
		Tools.time_consuming_io_task(seconds);
	    return "task-done";
	}
}















