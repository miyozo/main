package chapter14_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadExample {

	public static void main(String[] args) {
		Path p = Path.of("fruit.txt");
		try (var in = Files.newBufferedReader(p)) {
			System.out.println(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
