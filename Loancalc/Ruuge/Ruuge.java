import java.util.*;
import java.lang.*;
class Ruuge  {
	public static double x,y,h;

	public static double kay(double x, double y){
		return  (y * Math.pow(x,2)) - y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x");
		x = sc.nextDouble();

		System.out.println("Enter the value for y");
		y = sc.nextDouble();

		System.out.println("Value for k1 is "+kay(x,y));
	}
}
