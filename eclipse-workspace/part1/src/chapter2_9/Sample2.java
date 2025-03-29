package chapter2_9;

public class Sample2 {

	public static void main(String[] args) {
		
		String msg = """
				こんにちは%sさん！
				あなたの成績は%d点でした。
				これからも頑張ってください。
				""";
		
		String str = msg.formatted("田中博",90);
		
		System.out.println(str);
	}

}
