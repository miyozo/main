package chapter13_3;
import java.util.stream.IntStream;
public class PrimitiveStream2 {
	public static void main(String[] args) {
		
		IntStream.range(1, 10)
				.forEach(e->System.out.print(e + " "));
	}

}
