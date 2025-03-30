package chapter18_1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BinaryWritingExample {

	public static void main(String[] args) {
		
		byte[] data = {0x1, 0x2, 0x3, 0x4, 0x5};
		var path = Path.of("data.bin");
		try {
			Files.write(path, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
