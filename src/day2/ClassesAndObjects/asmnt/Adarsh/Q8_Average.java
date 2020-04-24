package day2.ClassesAndObjects.asmnt.Adarsh;

/**
 * 8.Print the average of three numbers entered by user by creating a class named 
 * 'Average' having a method to calculate and print the average.
 **/

import java.util.Scanner;

public class Q8_Average {
	
		
	
	
	//Creating a main method.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input the first number: ");
		double x = s.nextDouble();
		System.out.print("Input the second number: ");
		double y = s.nextDouble();
		System.out.print("Input the third number: ");
		double z = s.nextDouble();
		System.out.print("The average value is " + average(x, y, z) + "\n");
	}

	public static double average(double x, double y, double z) {
		return (x + y + z) / 3;
	}
}
