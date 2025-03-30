package chapter18_1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BinaryReadingExample {
	public static void main(String[] args) {
		
		var path = Path.of("data.bin");
		try {
			byte[] data = Files.readAllBytes(path);
			for(byte b : data) {
				System.out.printf("%02x ", b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
