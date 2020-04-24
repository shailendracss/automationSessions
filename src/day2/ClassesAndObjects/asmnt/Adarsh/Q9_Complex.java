package day2.ClassesAndObjects.asmnt.Adarsh;

import java.util.Scanner;

/***
 * Print the sum, difference and product of two complex numbers by creating a
 * class named 'Complex' with separate methods for each operation whose real and
 * imaginary parts are entered by user.
 * 
 * @author adarsh12345
 *
 */

public class Q9_Complex {

	/**
	 * What is a complex number real part >> double number imginary part >> double
	 * number also has i with it [sqrt(-1)]
	 * 
	 * sqrt(-1) * sqrt(-1) = (-1) pow 2*1/2 = -1
	 * 
	 * sqrt(-1) can also write as i
	 * 
	 * i * i = -1
	 * 
	 * How to add two complex numbers
	 * 
	 * number = real +/- imaginary part num1 = 2.5 + 3.5 i; num2 = -5.5 - 7.5 i;
	 * 
	 * addition = (2.5 + (-5.5)) + (3.5 + (-7.5)) i result = -3 - 4 i
	 * 
	 * How to to code num1 = x1 + y1 i; num2 = x2 + y2 i;
	 * 
	 * addition = (x1+x2) + (y1+y2) i
	 * 
	 * substraction = (x1-x2) + (y1-y2) i
	 * 
	 * multiplication = (x1 x2 - y1 y2) + (x1 y2 + x2 y1) i
	 * 
	 */

	public static void main(String[] args) {

		/**
		 * Provide real part of Num1 = Provide img part of Num1 = Provide real part of
		 * Num2 = Provide img part of Num2 =
		 * 
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Provide real part of Num1");
		double x1 = s.nextDouble();
		System.out.println("Provide img part of Num1");
		double y1 = s.nextDouble();
		System.out.println("Provide real part of Num2");
		double x2 = s.nextDouble();
		System.out.println("Provide img part of Num2");
		double y2 = s.nextDouble();

		// x1 = -2
		// y1 = 2
		// "num1 = x1=("+x1+") + y1=("+y1+") i"

		/*
		 * Sysout >> two parts 1 part = String >> enclosed with double quotes " 2 part =
		 * Some Variable
		 * 
		 * to join both parts we use +
		 * 
		 * Whatever message you want to print as it is on console just put it in ""
		 * 
		 * 
		 * 
		 * "num1 = x1=(" + x1 + ") + y1=(" + y1 + ") i"
		 */
		System.out.println(

				"num1 = x1=(" + x1 + ") + y1=(" + y1 + ") i"

		);

		System.out.println("num2 =x2=(" + x2 + ") + y2=(" + y2 + ") i");

		Q9_Complex q9 = new Q9_Complex();

		q9.performAddition(x1, y1, x2, y2);

		q9.performSubstration(x1, y1, x2, y2);

		q9.performMultiplication(x1, y1, x2, y2);

	}

	private void performMultiplication(double x1, double y1, double x2, double y2) {
		System.out.println("Multiplication is =" + (x1 * x2 - y1 * y2) + " +" + (x1 * y2 + x2 * y1) + " i ");
	}

	private void performSubstration(double x1, double y1, double x2, double y2) {
		System.out.println("Substaction is=" + (x1 - x2) + " + " + (y1 - y2) + " i");
	}

	void performAddition(double x1, double y1, double x2, double y2) {
		// "Addition is = "+(x1+x2)+" + "+(y1+y2)+" i"
		System.out.println("Addition is = " + (x1 + x2) + " + " + (y1 + y2) + " i");
	}

}
