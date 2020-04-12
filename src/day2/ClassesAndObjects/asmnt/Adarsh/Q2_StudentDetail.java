package day2.ClassesAndObjects.asmnt.Adarsh;

//Declaration of a class
public class Q2_StudentDetail {

	
	
	//Instance variable
	private String name;
	private int phonenumber;
	private String address;
	
	//Constructor declaration of a class
	private Q2_StudentDetail (String name, int phonenumber, String address)
	{
		this.name= name;
		this.phonenumber=phonenumber;
		this.address= address;
    }
	

	//Sample Method to print the object details
	public void printDetails() {
		System.out.println("Hi, name is " + this.name + ", Phone number is " + this.phonenumber + ", Address is "+ this.address);
		
		}
	
	public static void main(String[] args) 
	{
		//creating a object
		Q2_StudentDetail sam = new Q2_StudentDetail ("Sam", 3282334, "mhow");
		Q2_StudentDetail john = new Q2_StudentDetail ("John", 735282, "Indore");
		
		//calling method
		sam.printDetails();
		john.printDetails();
	}
	
	
	
}
