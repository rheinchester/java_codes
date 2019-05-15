import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.GridLayout;
class Ruuge1  {
	public static double x,y,k;
	public static final double H = 0.25;

	public static double kay(double x, double y){//k1 in book
		k  = y * Math.pow(x, 2) - y;
		return k;
	}
	public static double kay1(double x, double y, double h){//k2 in book
		k = kay(x, y);
		double x1 = x + (0.5 * H);
		double y1 = y + (0.5 * k * H);
		double k1 = kay(x1, y1);
		return k1;
	}
	public static double kay2(double x, double y, double h){//k3 in book
		double k1 = kay1(x, y, H);
		double x1 = x + (0.5 * H);
		double y1 = y + (0.5 * k1 * H);
		double k2 = kay(x1, y1);
		return k2;
	}
	public static double kay3(double x, double y, double h){//k4 in book
		double k2 = kay2(x, y, H);
		double x1 = x + H;
		double y1 = y +  (k2 * H);
		double k3 = kay(x1, y1);
		return k3;
	}
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Enter the value for x");
		String y = JOptionPane.showInputDialog("Enter the value for y");

		double numX = Double.parseDouble(x);//converts string to integer
		double numY = Double.parseDouble(y);//converts string to integer
		// System.out.println(kay1(numX, numY, H));
		JOptionPane.showMessageDialog(null, "<html>k1 is"+kay(numX, numY)+"<br> k2 is "+kay1(numX, numY, H)+"<br> k2 is "+kay2(numX, numY, H)+"<br> k2 is "+kay3(numX, numY, H)+"</html>", "The k value",JOptionPane.PLAIN_MESSAGE);

		// JFrame frame = new JFrame();
		// frame.setLayout(new GridLayout());
		// JLabel label = new JLabel("<html>First line<br>Second line</html>");
		// frame.add(label);
		// frame.pack();
		// frame.setVisible(true);
	}
}
