package day2.ClassesAndObjects.asmnt.Adarsh;

import java.util.Scanner;

/*
 * Add two distances in inch-feet by creating a class named 'AddDistance'.
 */

//This code is the best example for top-down design
public class Q11_AddDistance {

	// Instance variable
	int inch;
	int feet;

//create a method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Provide feet x1");
		int x1 = s.nextInt();
		System.out.println("Provide inch y1");
		int y1 = s.nextInt();
		System.out.println("Provide a feet x2");
		int x2 = s.nextInt();
		System.out.println("Provide inch y2");
		int y2 = s.nextInt();

		System.out.println(

				"num1 = x1=(" + x1 + ") + y1=(" + y1 + ") i"

		);

		//calling a method
		Q11_AddDistance q11 = new Q11_AddDistance();
		q11.addDistance(x1, y1, x2, y2);
	}

	//add calling method
	private void addDistance(int x1, int y1, int x2, int y2) {
		int feetsum = x1 + x2;
		int inchsum = y1 + y2;
		
		int tempFeet = 0;
		int tempInch = inchsum;
		if (inchsum >= 12)
		{
			// convert the inch into feet
			 tempFeet = (inchsum / 12);
			 tempInch = (inchsum % 12);
		}
		
		// adding the converted feet value to prev feet value
		feetsum = feetsum + tempFeet;
		inchsum = tempInch;
		
		System.out.println(feetsum);
		System.out.println(inchsum);
		
	}
}
