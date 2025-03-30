package chapter7_3_2;

public final class Tax {
	private final Id id;
	private final int income;
	private final int deduction;
	
	public Tax(Id id, int income, int deduction) {
		this.id = id;
		this.income = income;
		this.deduction = deduction;
	}

	public int calculateTax() {
		double gaku = (income - deduction) * 0.1;
		return (int)gaku;
	}
	public Id getId() {
		return id;
	}
	public int getIncome() {
		return income;
	}
	public int getDeduction() {
		return deduction;
	}
	@Override
	public String toString() {
		return "Tax [id=" + id + ", income=" + income + ", deduction=" + deduction + "]";
	}
}



