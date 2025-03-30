package chapter13_3;
import java.util.stream.IntStream;
public class Sum {

	public static void main(String[] args) {
		
		var stream = IntStream.range(1, 11);
		var average = stream.average();
		System.out.println(average.getAsDouble());
	}

}
