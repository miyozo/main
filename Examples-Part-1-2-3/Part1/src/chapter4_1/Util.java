package chapter4_1;
/**
 * ユーティリティクラス
 * <p>
 * 便利なメソッドを集めたクラス<br>
 * これからもいろいろなメソッドを追加する予定です。
 */
public class Util {
	/**
	 * 底辺と高さから三角形の面積を計算する
	 * @param h 高さ（単位：センチメートル）
	 * @param w 底辺（単位：センチメートル）
	 * @return 計算された三角形の面積（単位：平方センチメートル）
	 */
	public static double menseki(double h, double w) { 
		return h * w / 2; 
	}
	/**
	 * 三辺の長さから三角形の面積を計算する
	 * @param a 辺aの長さ（単位：センチメートル）
	 * @param b 辺bの長さ（単位：センチメートル） 
	 * @param c 辺cの長さ（単位：センチメートル） 
	 * @return 計算された三角形の面積（単位：平方センチメートル）　
	 */
	public static double menseki(double a, double b, double c) { 
		double s = (a + b + c) / 2; 
		double ss = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
		return ss; 
	} 

}
