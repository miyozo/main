package chapter8_3;

public class B extends A {
	@Override
	int function (int n) {
		return n * 2; 
	}
	
	@Override
	public B factory() {
		return new B();
	}
}
