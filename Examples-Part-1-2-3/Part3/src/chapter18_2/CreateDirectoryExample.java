package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectoryExample {
	public static void main(String[] args){
		
		var newdir = Path.of("root/D3/DD3");
		
		try {
			Files.createDirectories(newdir);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}










