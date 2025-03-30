package chapter18_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WalkExample2 {
	public static void main(String[] args) {

		var path = Path.of("root/");
		
		try (var ps = Files.walk(path)) {
			ps.filter(Files::isRegularFile)
			  .map(Path::getFileName)
			  .forEach(System.out::println);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
















