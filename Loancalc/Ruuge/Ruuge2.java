import java.util.*;
import java.lang.*;
class Ruuge2  {
	public static double x,y,k;
	public static int step;
	public static final double H = 0.25;

	public static double kay(double x, double y, int step){//k1 in book
		if (step == 0) {
			k  = (y * Math.pow(x, 2)) - y;
			return k;			
		}else{
			k = kay(x, y, step-1);
			double x1 = x + (0.5 * H);
			double y1 = y + (0.5 * k * H);
			double k1 = kay(x1, y1, step - 1);
			return k1;
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x");
		x = sc.nextDouble();

		System.out.println("Enter the value for y");
		y = sc.nextDouble();

		System.out.println("Enter the value for step");
		step = sc.nextInt();

		System.out.println("Value for k1 is "+kay(x, y, step));
	}
}
