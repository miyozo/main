package chapter10_1;

public class Student implements Versionable{
	private int number;
	private String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Student() {}

	@Override
	public String version() {
		return "2.15";
	}

}
