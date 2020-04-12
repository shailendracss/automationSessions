package day2.ClassesAndObjects.asmnt.Adarsh;

/**
 * Write a program to print the area of two rectangles having sides (4,5) and
 * (5,8) respectively by creating a class named 'Rectangle' with a method named
 * 'Area' which returns the area and length and breadth passed as parameters to
 * its constructor.
 */

public class Q5_Rectangle {

//Instance variable
	private int a;
	private int b;

//Constructor Declaration Class
	private Q5_Rectangle(int a, int b) {

		this.a = a;
		this.b = b;

	}

	public void calculateArea() {
		{
			double area = a * b;
			System.out.println("Area of rectangle is " + area + " whose length is " + a + " and breadth is " + b);
			// Area of rectangle is 15.0 whose length is 3 and breadth is 5
			// "Area of rectangle is "+area+" whose length is "+a+" and breadth is "+b
		}
	}

	public static void main(String[] args) {

		// creating a object
		Q5_Rectangle rectangle1 = new Q5_Rectangle(3, 5);
		Q5_Rectangle rectangle2 = new Q5_Rectangle(6, 8);

		// calling a method for calculate area and parameter
		rectangle1.calculateArea();
		rectangle2.calculateArea();

	}
}
