package day2.ClassesAndObjects.asmnt.Adarsh;

import java.util.Scanner;

/***
 * Write a program to print the area of a rectangle by creating a class named
 * 'Area' having two methods. First method named as 'setDim' takes length and
 * breadth of rectangle as parameters and the second method named as 'getArea'
 * returns the area of the rectangle. Length and breadth of rectangle are
 * entered through keyboard.
 * 
 * @author adarsh12345
 *
 */
public class Q6_Area {

	// instance variable
	private int length;
	private int breadth;
	
	
// create a object of a class
	private void setDim(int l, int b) {
		length = l;
		breadth = b;
	}
//Create a 2nd obj of a class
	private int getArea() {
		return length * breadth;

	}

	//Creating a main method 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length");
		int a = s.nextInt();
		System.out.println("Enter the breadth");
		int b = s.nextInt();
		Q6_Area rect = new Q6_Area();
		rect.setDim(a, b);
		System.out.println("Area of Rectangle is:" + rect.getArea());

	}
}
