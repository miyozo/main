package chapter7_2_1;
public class Joining {
	
	private String str = "";			// 初期値は空文字
	private String delimiter = ",";		// 初期値はコンマ

	public String add(String s) {
		str += str.isEmpty() ?  s : delimiter + s;
		return str;
	}
	public String getStr() {
		return str;
	}
	public static void main(String[] args) {
		System.out.println("Hello!");
	}
}










