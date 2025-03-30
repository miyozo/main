package chapter10_2;

public class Rate2 implements RateProvider {

	@Override
	public double rate(int income) {
		return income > 100 ? 0.3 : 0.15;
	}

}
