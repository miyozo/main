
public class practice1 {
	public static void main(String[] args) {
		double Area = calcTriangleArea(10.0,5.0);
		double Area2 = calcCircleArea(5.0);
		System.out.println(Area);
		System.out.println(Area2);
	}
	
	public static double calcTriangleArea(double bottom,double height) {
		double TriangleArea = bottom * bottom * height /2;
		return TriangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double CircleAre = radius * radius * 3.14;
		return CircleAre;
	}
}