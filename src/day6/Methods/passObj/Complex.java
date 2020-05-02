package day6.Methods.passObj;

public class Complex {
	private double real;
	private double img;
	
	public Complex(double real,double img) {
		this.real = real;
		this.img = img;
	}
	
	public static void main(String[] args) {
		Complex o1 = new Complex(1, 2);
		Complex o2 = new Complex(3, 4);
		
		Complex.performAddition(o1,o2);

		Complex.performAddition(o1,o1);
		
		o1.performAddition(o2);

		o1.performAddition(o1);
	}

	private void performAddition(Complex obj) {
		System.out.println("Addition is = " + (this.real + obj.real) + " + " + (this.img + obj.img) + " i");
	}

	private static void performAddition(Complex o1, Complex o2) {
		System.out.println("Addition is = " + (o1.real + o2.real) + " + " + (o1.img + o2.img) + " i");
	}
}
