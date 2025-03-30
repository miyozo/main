package chapter7_3_2;

public class Id {
	private int number;
	private String name;
	
	public Id(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Id [number=" + number + ", name=" + name + "]";
	}
}










