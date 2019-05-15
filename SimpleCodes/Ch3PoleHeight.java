import java.util.*;
import java.text.*;
class Ch3PoleHeight {
	public static void main(String[] args) {
		double height; 		//height of the pole
		double distance; 	//distance between points A and B
		double alpha;		//angle measured at point A
		double beta;		//angle measured at point B
		double alphaRad;	//angle alpha in radians
		double betaRad;		//angle beta in radians

		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));

		System.out.print("Alpha: ");
		alpha =  sc.nextDouble(); 

		System.out.print("Beta: ");
		beta = sc.nextDouble();

		System.out.print("Distance: ");
		distance = sc.nextDouble();

		alphaRad = Math.toRadians(alpha);
		betaRad = Math.toRadians(beta);

		height = (distance * Math.sin(alphaRad) * Math.sin(betaRad) )/
					Math.sqrt( Math.sin(alphaRad + betaRad) *
					Math.sin(alphaRad - betaRad));
		DecimalFormat df = new DecimalFormat("0.000");

		System.out.println("lnln Estimating the height of the pole"
							+ "\n \n"
							+ "Angle at point A (deg): " + df.format(alpha) + "\n"
							+ "Angle at point B (deg): " + df.format(beta) + "\n"
							+ "Distance between A and B (ft): " + df.format(distance)+ "\n"
							+ "Estimated height (ft): " + df.format(height));
	}
}