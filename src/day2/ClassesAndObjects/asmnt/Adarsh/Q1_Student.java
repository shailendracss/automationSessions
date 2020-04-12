package day2.ClassesAndObjects.asmnt.Adarsh;
public class Q1_Student {
	
	//Declaration a Class
	private String name; 
	private int rollnumber;
	
	//Constructor Declaration
	public Q1_Student(String name, int rollnumber) 
	{ 
		this.name = name; 
		this.rollnumber = rollnumber; 
		}
		
		
	//Method to print a object details
	public void printDetails() 
		{ 
			System.out.println("Name is " + this.name + ", Roll number is " + this.rollnumber ); 
		} 
	 
		public static void main(String[] args) 
		{ 
			
			// Creating the Object 
			Q1_Student adarsh = new Q1_Student("Adarsh Kumar", 2);
			
			
			// Calling methods
			adarsh.printDetails();
			
		} 
}
