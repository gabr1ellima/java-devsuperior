package entities;

public class Rectangle {
	
	public static double area(double width, double height) {
		return width * height;
	}
	
	public static double perimeter(double width, double height) {
		return 2 * (width + height);
	}
	
	public static double diagonal(double width, double height) {
		return Math.sqrt((height * height) + (width * width));
	}
}
