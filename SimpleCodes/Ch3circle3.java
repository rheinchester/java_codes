import java.text.*;
import  java.util.Scanner;
class Ch3circle3 {
	public static void main(String[] args) {
		final double PI = 3.142;
		final String NEWLINE = "\n";
		final String TAB = "\t";

		DecimalFormat df = new DecimalFormat("0.000");
		double radius, area, circumference;

		radius = 2.35;
		area = PI * radius* radius;
		circumference = 2 * PI * radius;

		System.out.println("Given radius:  "+  TAB + df.format(radius)+ NEWLINE +
							"Given area:  "+  TAB + df.format(area)+ NEWLINE +
							"Given circumference:  "+  TAB + df.format(circumference));

		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter two integers:  ");

		num1= sc.nextInt();
		num2= sc.nextInt();

		System.out.print("Num1 = "+ num1+" "+"Num2 = "+num2 ); 

	}
}