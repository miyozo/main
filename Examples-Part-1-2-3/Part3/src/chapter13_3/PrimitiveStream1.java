package chapter13_3;
import java.util.stream.IntStream;
public class PrimitiveStream1 {
	public static void main(String[] args) {
		
		IntStream.of(10, 15, 3)
				.forEach(e->System.out.print(e + " "));
		
	}

}
