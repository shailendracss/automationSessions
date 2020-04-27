package day5.Method.asmnt.Adarsh;

import java.util.Scanner;

public class Q1_Average {

	
	/**
	 * @author Shailendra 27-Apr-2020
	 * Read the question properly
	 * 
	 * */

	//Create a Method
		 public static void main(String[] args)
		    {
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        double num1 = scan.nextInt();
		        System.out.print("Enter the second number: ");
		        double num2 = scan.nextDouble();
		        System.out.print("Enter the third number: ");
		        double num3 = scan.nextDouble();
		        scan.close();
		        System.out.print("The average of entered numbers is:" + avr((int) num1, num2, num3) );
		    }

		  public static double avr(int a, double b, double c)
		    {
		        return (a + b + c) / 3;
		    }
		  
		  
		}
	
	
