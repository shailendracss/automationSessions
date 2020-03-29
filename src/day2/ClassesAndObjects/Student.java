package day2.ClassesAndObjects;

//Class Declaration 
public class Student 
{ 
	// Instance Variables 
	private String name; 
	private int standard; 
	private int age; 

	// Constructor Declaration of Class 
	public Student(String name, int standard, int age) 
	{ 
		this.name = name; 
		this.standard = standard; 
		this.age = age; 
	} 

	// A Sample method to print the object details
	public void printDetails() 
	{ 
		System.out.println("Hi, my name is " + this.name + ", My age is " + this.age + ", and I Study in "+ this.standard); 
	} 

	public static void main(String[] args) 
	{ 
		// Creating the Object 
		Student adarsh = new Student("Adarsh Kumar", 12, 18);
		Student subhana = new Student("Subhana Khan", 11, 17);
		
		// Calling methods
		adarsh.printDetails();
		subhana.printDetails();
		
	} 
} 