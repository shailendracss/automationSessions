
package day2.ClassesAndObjects.asmnt.Adarsh;


//	Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.

public class Q4_Triangle {

	// instance variable
	private int a;
	private int b;
	private int c;

	// Constructor declaration of class
	private Q4_Triangle(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	private boolean isValid() {

		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			return true;
		} else {
			System.out.println("Area of Triangle not exit");
			return false;
		}
	}
	
	public void calculateArea() {
		if (isValid()) {
			int s = (a + b + c) / 2;
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.println("Area of Triangle is: " + area);

		}
	}

	public void calculatePerameter() {

		if (isValid()) {
			System.out.println("Perimeter of triangle : " + (a + b + c));

		} 
	}

	public static void main(String[] args) {
		
		// creating a object
		Q4_Triangle triangle1 = new Q4_Triangle (3, 4, 5);
		Q4_Triangle triangle2 = new Q4_Triangle (6, 7, 8);
		
		//calling a method for calculate area and parameter
		triangle1.calculateArea();
		triangle1.calculatePerameter();
		
		
		triangle2.calculateArea();
		triangle2.calculatePerameter();


	}
	
	
	
}
