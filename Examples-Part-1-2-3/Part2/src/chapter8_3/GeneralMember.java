package chapter8_3;

public class GeneralMember {
	long id;
	String name;
	
	public GeneralMember(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int kai_hi() {
		return 1000;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
