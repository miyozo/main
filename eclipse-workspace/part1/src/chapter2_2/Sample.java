package chapter2_2;

public class Sample {

	public static void main(String[] args) {
		int x;
		double data;
		char ch;
		String str;
		boolean result;
		
		x = 2;
		data  = 1.234;
		ch = 'a';
		str = "こんにちは";
		result = true;
			System.out.println(x);
			System.out.println(data);
			System.out.println(ch);
			System.out.println(str);
			System.out.println(result);
			
			int number = 0b0101_0110;
			System.out.println(number);
			
			String numberStr = Integer.toBinaryString(number);
			System.out.println(numberStr);
			
			String xStr = Integer.toBinaryString(x);
			System.out.println(xStr);
			
			int hex = 0x336ACF;
			System.out.println(hex);
			
			String hexStr = Integer.toHexString(hex);
			System.out.println(hexStr.toUpperCase());
	}

}
