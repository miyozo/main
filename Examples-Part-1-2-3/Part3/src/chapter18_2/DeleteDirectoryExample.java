package chapter18_2;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.io.file.PathUtils;

public class DeleteDirectoryExample {
   public static void main(String[] args) {

      	Path dir = Path.of("sub/");
    	
        try {
        	PathUtils.deleteDirectory(dir);
		} 
        catch (IOException e) {
			e.printStackTrace();
		}
    }
}


