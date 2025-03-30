package chapter18_2;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.apache.commons.io.file.PathUtils;

public class CopyDirectoryExample {
   public static void main(String[] args) {

    	Path source = Path.of("root/");
    	Path target = Path.of("sub/");
    	
        try {
        	PathUtils.copyDirectory(source,target,StandardCopyOption.REPLACE_EXISTING);
		} 
        catch (IOException e) {
			e.printStackTrace();
		}
    }
}


