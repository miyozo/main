package chapter18_1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReadingExample {
	public static void main(String[] args) {
		
		var path = Path.of("greeting.txt");
		try {
			var lines = Files.readAllLines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


