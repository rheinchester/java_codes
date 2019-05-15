import java.util.*;
import java.text.*;

class SateliteVelocity {
	public static void main(String[] arg) {
		double radius;
		double velocity;
		final  double GRAV_CONSTANT =  6.67 * Math.pow(10,(-11)); 
		final double MASS_OF_EARTH = 5.98 * Math.pow(10,24);

		Scanner sc = new Scanner(System.in);
		System.out.print("What is the radius: ");
		radius = sc.nextDouble();

		DecimalFormat df = new DecimalFormat("0.00");
		velocity = Math.sqrt((GRAV_CONSTANT * MASS_OF_EARTH)/radius);

		System.out.print("Your velocity is: "+ df.format(velocity));


	}
}