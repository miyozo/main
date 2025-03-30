package chapter2_5;
public class Sample1 {
	public static void main(String[] args) {

		int bin = 0b0101_0110;
		System.out.println(bin);
		
		String binStr = Integer.toBinaryString(bin);
		System.out.println(binStr);
	}
}
