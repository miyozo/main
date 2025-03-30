package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteExample {
	public static void main(String[] args) {
		
		var path = Path.of("root/D2/E.txt");
		
		try {
			Files.delete(path);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}




























