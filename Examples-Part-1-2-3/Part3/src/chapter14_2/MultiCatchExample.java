package chapter14_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class MultiCatchExample {
	public static void main(String[] args) {
		
		try {
			printFileContents("fruit.txt");
		} 
		catch (NoSuchFileException e) {
			System.out.println("ファイルが見つからない");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("ファイルを読み込めない");
			e.printStackTrace();
		}
	}
	
	public static void printFileContents(String fileName) throws IOException {
		var p = Path.of(fileName);
		var list = Files.readAllLines(p);
		list.forEach(System.out::println);
	}
}
