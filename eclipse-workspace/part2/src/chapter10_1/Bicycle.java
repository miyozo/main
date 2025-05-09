package chapter10_1;

public class Bicycle implements Versionable{
	private String owner;
	private String type;
	
	public Bicycle(String owner, String type) {
		this.owner = owner;
		this.type = type;
	}
	
	public Bicycle() {}

	@Override
	public String version() {
		return "1.25";
	}

}
