package chapter14_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintStackTrace {

	public static void main(String[] args) {
		Path p = Path.of("fruite.txt");
		try {
			var list = Files.readAllLines(p);
			list.forEach(System.out::println);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
