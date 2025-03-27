package chapter2_2;

public class Sample3 {

	public static void main(String[] args) {
		System.out.println("apple\npen\npnine");
		System.out.println("\"neko\"");
		
		String str = """
				おはよう
				こんにちは
				こんばんは
				""";
		System.out.println(str);
		
		int a = 20;
		int ans = a++;
		System.out.println(ans);
	}
}
