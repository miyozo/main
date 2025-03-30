package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample {
	public static void main(String[] args) {

		var path = Path.of("root/NEW.txt");
		
		try {
			Files.createFile(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











































