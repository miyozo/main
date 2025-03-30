package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyExample {
	public static void main(String[] args) {

		var source = Path.of("root/D1/DD1/D.txt");
		var target = Path.of("root/D2/E.txt");
		
		try {
			Files.copy(source, target);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}









