package day5.Method.asmnt.Adarsh;

import java.util.Scanner;

public class Employee {
	
	//instance variable

	private int empid;
	private String name;
	private float salary;

	
	public void getInput() {
//creating a object
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the empid :: ");
		empid = s.nextInt();
		System.out.print("Enter the name :: ");
		name = s.next();
		System.out.print("Enter the salary :: ");
		salary = s.nextFloat();
	}

	public void display() {

		System.out.println("Employee id = " + empid);
		System.out.println("Employee name = " + name);
		System.out.println("Employee salary = " + salary);
	}

	
	//creating a method
	public static void main(String[] args) {

		Employee e[] = new Employee[5];

		for (int i = 0; i < 5; i++) {

			e[i] = new Employee();
			e[i].getInput();
		}

		System.out.println("**** Data Entered as below ****");

		for (int i = 0; i < 5; i++) {

			e[i].display();
		}
	}
}
