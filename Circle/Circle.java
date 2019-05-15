import java.math.*;
class Circle{
	public static final int INVALID_DIMENSION = -1;
	private double radius;

	public Circle(double r){
		setRadius(r);
	}

	public double getArea(){
		double result = INVALID_DIMENSION;
		if (isRadiusValid()) {
			result = Math.PI * radius * radius; 
		}
		return result;
	}
	public double getCircumference(){
		double result = INVALID_DIMENSION;
		if (isRadiusValid()) {
			result = Math.PI * radius * 2.0;
		}
		return result;
	}
	public double getDiameter(){
		double diameter = INVALID_DIMENSION;
		if (isRadiusValid()) {
			diameter = radius * 2.0;
		}
		return diameter;
	}
	public double getRadius(){
		return radius;
	}

	public void setRadius(double r){
		if (r > 0) {
			radius = r; 
		}else {
			radius = INVALID_DIMENSION;
		}
	}
	public void setDiameter(double d){
		if (d > 0) {
			setRadius(d/2.0);
		}else {
			setRadius(INVALID_DIMENSION);
		}
	}
	public boolean isRadiusValid(){
		return radius != INVALID_DIMENSION;
	}
}