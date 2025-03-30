package chapter18_1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class TextWritingExample3 {
	public static void main(String[] args) {
		
		var list = List.of("Apple", "Banana", "パイナップル");
		var stringPath = "fruit.txt";
		try(var writer = new PrintWriter(stringPath)) {
			for(String s : list) {
				writer.println(s);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
