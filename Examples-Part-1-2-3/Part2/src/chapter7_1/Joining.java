package chapter7_1;

public class Joining {
	private String str;
	private String delimiter;

	public Joining(String str, String delimiter) {
		this.str = str;
		this.delimiter = delimiter;
	}
	public String add(String s) {
		str += str.isEmpty() ?  s : delimiter + s;
		return str;
	}
	public String getStr() {
		return str;
	}
}
