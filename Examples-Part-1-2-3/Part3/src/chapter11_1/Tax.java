package chapter11_1;

public class Tax {
	private int id;
	private String name;
	private int income;
	private int deduction;
	private RateProvider r;
	
	public Tax(int id, String name, int income, int deduction, RateProvider r){
		this.id = id;
		this.name = name;
		this.income = income;
		this.deduction = deduction;
		this.r = r;
	}
	
	public int calculateTax() {
		double gaku = (income - deduction) * r.rate(income);
		return (int)gaku;
	}
}
