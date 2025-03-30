package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WalkExample3 {
	public static void main(String[] args) {

		var path = Path.of("root/");
		
		try (var ps = Files.walk(path)) {
			ps.filter(Files::isDirectory)
			  .map(Path::toAbsolutePath)
			  .forEach(System.out::println);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}














