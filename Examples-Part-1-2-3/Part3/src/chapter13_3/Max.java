package chapter13_3;
import java.util.stream.IntStream;
public class Max {

	public static void main(String[] args) {
		
		var stream = IntStream.range(1, 11);
		var max = stream.max();
		System.out.println(max.getAsInt());
	}

}
