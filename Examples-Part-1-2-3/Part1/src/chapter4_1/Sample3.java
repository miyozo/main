package chapter4_1;

//メソッドに複数の値を渡す
public class Sample3 {

	public static void main(String[] args) {
		calc(1.5, 2.5);
	}
	
	public static void calc(double x1, double x2) {
		System.out.println(Math.sqrt(x1+x2));
	}

}
