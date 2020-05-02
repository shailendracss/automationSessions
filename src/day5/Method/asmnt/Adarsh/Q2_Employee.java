package day5.Method.asmnt.Adarsh;

/***
 * Create a class Employee to hold Employee details like name, salary, address
 * and company_name(static). Create 5 objects of the Employee class and print
 * their details
 * 
 * @author adarsh12345
 *
 */
public class Q2_Employee {

	/**
	 * @author Shailendra 27-Apr-2020
	 * Read the question properly
	 * 
	 * */

	//instance Variable
	private String name;
	private int salory;
	private String address;
	private String company_name;
	
	
	//Constructor declaration of a class
		public Q2_Employee (String name, int salory, String address,String company_name)
		{
			this.name= name;
			this.salory=salory;
			this.address= address;
			this.company_name= company_name;
	    }
	
		//Sample Method to print the object details
		public void printDetails() {
			System.out.println("Hi, name is " + this.name + ", Salory is " + this.salory + ", Address is "+ this.address+",Company name is"+this.company_name);
			
			}
		public static void main(String[] args) 
		{
			//creating a object
			Q2_Employee sam = new Q2_Employee ("Sam", 3282334, "mhow","CSS");
			Q2_Employee john = new Q2_Employee ("John", 735282, "Indore","CSS");
			Q2_Employee sammy = new Q2_Employee ("Sammy", 3282334, "mhow","CSS");
			Q2_Employee johnson = new Q2_Employee ("Johnson", 735282, "Indore","CSS");
			Q2_Employee sameer = new Q2_Employee ("Sameer", 3282334, "mhow","CSS");
			
			//calling method
			sam.printDetails();
			john.printDetails();
			sammy.printDetails();
			johnson.printDetails();
			sameer.printDetails();
		}
		
}

