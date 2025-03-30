package chapter14_1;
import java.io.IOException;
import jp.kwebs.lib.Webtool;

public class ExceptionExample2 {
	public static void main(String[] args) {
		
		try {
			String pageData = Webtool.getPage("https://google.com");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
