package day5.Method.asmnt.Adarsh;

import java.util.Scanner;

/***
 * Create a class Calculator which should be able to calculate the addition of
 * 2, 3, and 4 numbers of both int and double type
 * 
 * @author adarsh12345
 *
 */
public class Q4_Calculator {
	

	/**
	 * @author Shailendra 27-Apr-2020
	 * Read the question properly
	 * 
	 * */

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter three numbers: ");

		// nextDouble() reads the next double from the keyboard
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		double third = reader.nextDouble();

		System.out.print("Enter an operator (+): ");
		char operator = reader.next().charAt(0);

		double result;

		switch (operator) {
		case '+':
			result = first + second + third;
			break;

		/*
		 * case '-': result = first - second; break;
		 * 
		 * case '*': result = first * second; break;
		 * 
		 * case '/': result = first / second; break;
		 */

		// operator doesn't match any case constant (+, -, *, /)
		default:
			System.out.printf("Error! operator is not correct");
			return;
		}

		System.out.printf("%.4f %c %.1f %c %.1f = %.1f", first, operator, second,operator,third, result);
	}
}
