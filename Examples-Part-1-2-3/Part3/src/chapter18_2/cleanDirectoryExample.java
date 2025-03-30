package chapter18_2;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.io.file.PathUtils;

public class cleanDirectoryExample {
   public static void main(String[] args) {

    	Path target = Path.of("root/");
    	
        try {
        	PathUtils.cleanDirectory(target);
		} 
        catch (IOException e) {
			e.printStackTrace();
		}
    }
}


