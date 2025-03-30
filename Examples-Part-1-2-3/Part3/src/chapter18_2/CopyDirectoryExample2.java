package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyDirectoryExample2 {
   public static void main(String[] args) {

    	Path source = Path.of("root/");
    	Path target = Path.of("sub/");
    	
        try {
        	Files.copy(source,target);
		} 
        catch (IOException e) {
			e.printStackTrace();
		}
    }
}


