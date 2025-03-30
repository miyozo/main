package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MoveDirectoryExample {
	public static void main(String[] args){

		var source = Path.of("root/D1/DD3");
		var target = Path.of("root/D2/DD3");

		try {
			Files.move(source, target);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}























