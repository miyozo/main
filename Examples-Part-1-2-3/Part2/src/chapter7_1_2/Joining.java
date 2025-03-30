package chapter7_1_2;

public class Joining {
	private String str;
	private String delimiter;

	public Joining(String str, String delimiter) {
		this.str = str;
		this.delimiter = delimiter;
	}
	
	public Joining(String delimiter) {
		this.str = "";
		this.delimiter = delimiter;
	}
	
	public Joining() {
		this.str = "";
		this.delimiter = ",";
	}
	public String add(String s) {
		str += str.isEmpty() ?  s : delimiter + s;
		return str;
	}

	public String getStr() {
		return str;
	}
}
