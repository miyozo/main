package chapter2_10;
public class Sample10 {

	public static void main(String[] args) {

		String msg = """
				こんにちは%sさん！
				あなたの成績は%d点でした。
				これからも頑張ってください。
				""";
		
		String str = msg.formatted("田中宏", 90);
		System.out.println(str);
	}
}
