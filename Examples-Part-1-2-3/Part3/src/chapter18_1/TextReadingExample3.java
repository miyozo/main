package chapter18_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReadingExample3 {
	public static void main(String[] args) {
		
		var path = Path.of("fruit.txt");
		try (var reader = Files.newBufferedReader(path)) {
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


