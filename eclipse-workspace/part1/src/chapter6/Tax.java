package chapter6;

public class Tax {
	private int id;
	private String name;
	private int income;
	private int deduction;
	
	public Tax(int id, String name, int income, int deduction) {
		this.id = id;
		this.name = name;
		this.income = income;
		this.deduction = deduction;
	}
	
	public int calculateTax() {
		double gaku = (income - deduction) * 0.1;
		return (int)gaku;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getIncome() {
		return income;
	}

	public int getDeduction() {
		return deduction;
	}
	

	
	
	
	

}
