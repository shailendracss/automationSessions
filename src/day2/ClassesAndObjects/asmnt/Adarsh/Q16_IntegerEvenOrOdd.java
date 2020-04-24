package day2.ClassesAndObjects.asmnt.Adarsh;

import java.util.Scanner;

//Create a Method
public class Q16_IntegerEvenOrOdd {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		//Use scanner for editor
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		double a = s.nextDouble();

		//Write if ,else condition
		if (a % 2 == 0)
			System.out.println("Entered number is even");

		else
			System.out.println("Entered number is odd");
	}
}
