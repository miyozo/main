package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RnameExample {
	public static void main(String[] args){
		
		var source = Path.of("root/NEW.txt");
		var target = Path.of("root/D.txt");
		
		try {
			Files.move(source, target);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}


























