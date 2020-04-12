package day2.ClassesAndObjects.asmnt.Adarsh;

import java.util.Scanner;

public class Q7_Area {

	// Instance variable
	private int lenght;
	private int breadth;

	// Constructor declaration class
	private Q7_Area(int lenght, int breadth) {

		this.lenght = lenght;
		this.breadth = breadth;

	}

	private void returnArea() {
		int area = lenght * breadth;
		System.out.println("Area of rectangle" + area);

	}

	//Create a main method of class
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lenght of a rectangle");
		int a = s.nextInt();
		System.out.println("Enter the breadth of a rectangle");
		int b = s.nextInt();

		Q7_Area rect = new Q7_Area(a, b);
		rect.returnArea();
	}

}
