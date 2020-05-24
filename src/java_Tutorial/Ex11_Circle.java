package java_Tutorial;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Ex11_Circle extends Shape { // Save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Ex11_Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}

	/** Constructs a Circle instance with the given radius and default color */
	public Ex11_Circle(double r) { // 2nd constructor
		radius = r;
		color = "red";
	}

	/** Returns the radius */
	public double getRadius() {
		return radius;
	}

	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public static void main(String[] args) {
		Ex11_Circle r= new Ex11_Circle(2.0);
		r.getRadius();
		double val= r.getRadius();
		System.out.println(val );
		
		
		Ex11_Circle a= new Ex11_Circle();
		a.getArea();
		double val1= a.getArea();
		System.out.println(val1);
	}
}
