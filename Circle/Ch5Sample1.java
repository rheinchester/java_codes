import java.util.*;
class Ch5Sample1 {
	public static void main(String[] args) {
		double radius, circumference, area;
		Circle circle;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = scanner.nextDouble();
		circle = new Circle(radius);
		circumference = circle.getCircumference();
		area = circle.getArea();
		System.out.println("Input radius: " + radius);
		System.out.println("Circumference: " + circumference);
		System.out.println("Area: " + area);
	}
}