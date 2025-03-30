package chapter13_3;
import java.util.stream.IntStream;
public class Count {

	public static void main(String[] args) {
		
		var stream = IntStream.range(1, 11);
		long cnt = stream.count();
		System.out.println(cnt);
	}

}
