import java.util.Scanner;
 
public class AreaOfTriangle{
	public static void main(String[] args) {
		System.out.println("Enter value for base");
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		System.out.println("Enter value for height");
		double height = sc.nextDouble();
		double areaOfTriangle = 0.5* base* height;
		System.out.println("Area Of Triangle is " + areaOfTriangle);
		System.in("how are you")
	}
}