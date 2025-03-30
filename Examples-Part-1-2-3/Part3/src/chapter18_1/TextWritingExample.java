package chapter18_1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextWritingExample {
	public static void main(String[] args) {
		
		var list = List.of("Hello", "Buenas tardes", "こんにちは");
		var path = Path.of("greeting.txt");
		try {
			Files.write(path, list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
