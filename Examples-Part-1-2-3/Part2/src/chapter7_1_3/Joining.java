package chapter7_1_3;

public class Joining {
	private String str;
	private String delimiter;

	public Joining(String str, String delimiter) {
		this.str = str;
		this.delimiter = delimiter;
	}
	
	public Joining(String delimiter) {
		this("", delimiter);
	}
	
	public Joining() {
		this("", ",");
	}
	public String add(String s) {
		str += str.isEmpty() ?  s : delimiter + s;
		return str;
	}

	public String getStr() {
		return str;
	}
}
