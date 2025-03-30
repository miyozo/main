package chapter4_1;
// 値を返すメソッド
public class Sample4 {
	
	public static void main(String[] args) {
		double ans = calc(10.5, 2.35);
		System.out.println(ans);
	}
	
	public static double calc(double x1, double x2) {
		double x = Math.sqrt(x1+x2);
		return x;
	}

}
