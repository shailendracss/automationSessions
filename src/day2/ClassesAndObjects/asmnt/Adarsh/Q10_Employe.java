package day2.ClassesAndObjects.asmnt.Adarsh;

/**
 * 10. Write a program that would print the information (name, year of joining,
 * salary, address) of three employees by creating a class named 'Employee'. The
 * output should be as follows:
 * 
 * @author adarsh12345
 *
 */

public class Q10_Employe {

	// Instance variable
	private String name;
	private int yearOfJoining;
	private double salory;
	private String address;

	// Constructor declaration of a class
	private Q10_Employe(String name, int yearOfJoining, double salory, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salory = salory;
		this.address = address;
	}

	// Sample Method to print the object details
	public void printDetails() {

		System.out.println(this.name + "\t\t" + this.salory + "\t\t\t" + this.address);

	}

	public static void main(String[] args) {
		// creating a object
		Q10_Employe robert = new Q10_Employe("Robert", 1994, 1000, "64C- WallsStreat");
		Q10_Employe sam = new Q10_Employe("Sam", 1996, 6800, "68- WallsStreat");
		Q10_Employe john = new Q10_Employe("John", 1998, 16000, "26B- WallsStreat");

		System.out.println("Name\t\tYear of joining\t\tAddress");
		// calling method
		robert.printDetails();
		sam.printDetails();
		john.printDetails();

	}

}
