import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args) {
	System.out.println("Enter value for radius: " );		
	Scanner input = new Scanner(System.in);
	double radius = input.nextDouble();
	double area =3.142 * radius* radius;
	System.out.println("Area = " + area); 
	int a = sum(1.7);
	System.out.println(a);		


	}
}