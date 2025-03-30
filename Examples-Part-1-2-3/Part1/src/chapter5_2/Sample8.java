package chapter5_2;
import jp.kwebs.lib.Input;

public class Sample8 {
	public static void main(String[] args) {

		String str = Input.getString();
		
		if( str.equals("apple") ) {
			System.out.println("りんご");
			
		}else if( str.equals("orange") ) {
			System.out.println("みかん");
			
		}else if( str.equals("grape") ) {
			System.out.println("ぶどう");
			
		}else {
			System.out.println("辞書にありません");
		}
	}
}
