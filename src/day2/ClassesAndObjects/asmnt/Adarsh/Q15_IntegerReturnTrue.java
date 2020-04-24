package day2.ClassesAndObjects.asmnt.Adarsh;

import java.util.Scanner;

/**
 * Write a Java program to calculate the sum of two integers and return true if
 * the sum is equal to a third integer. Go to the editor
 * 
 * @author adarsh12345
 *
 */
public class Q15_IntegerReturnTrue {
	
	
//create a method
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//using scanner and create object
		Scanner s =new Scanner(System.in);
		System.out.println("Enter 1st number");
		double a= s.nextDouble();
		System.out.println("Enter 2nd number");
		double b = s.nextDouble();
		System.out.print("Input the third number : ");
        Double c = s.nextDouble(); 
        System.out.print("The result is: "+ sumoftwo (a, b, c));
		System.out.print("\n");
	}

	//create a boolean method
	private static boolean sumoftwo(double a, double b, double c) {
		return ((a + b) == c);
	}
}
