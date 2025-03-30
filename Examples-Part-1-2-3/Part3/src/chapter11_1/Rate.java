package chapter11_1;

public class Rate implements RateProvider {

	@Override
	public double rate(int income) {
		return income > 100 ? 0.2 : 0.1;
	}

}
