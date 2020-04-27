package day2.ClassesAndObjects.asmnt.Adarsh;

/***
 * 	1.
	Write a Java program to calculate the modules of two numbers. Go to the editor
	Sample Output:
	
	Input the first number : 19                                            
	Input the second number: 7                                             
	5
 * 
 */

import java.util.Scanner;

public class Q12_Module {
	

	/**
	 * @author Shailendra 27-Apr-2020
	 * Logic is correct but this was not asked in the question
	 * 
	 * */
	
	//create a method.
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = s.nextInt();  
		System.out.print("Input the second number: ");
		int b = s.nextInt(); 
		int divided = a / b;
		int result = a - (divided * b);
		System.out.println(result); 
	}
}
