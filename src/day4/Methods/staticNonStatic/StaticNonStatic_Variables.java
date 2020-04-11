package day4.Methods.staticNonStatic;

/**
 * 
 * Java always initialize the instance variables with the default values. 
 * int >> 0 
 * double >> 0.0 
 * boolean >> false 
 * String >> null
 * Object >> null
 * 
 * java does not initialize local variables, you have to give the values at the
 * time of declaration
 * 
 */
public class StaticNonStatic_Variables {

	// non static
	private String name;

	// static
	private static String school;

	// non static
	public StaticNonStatic_Variables(String name) {
		this.name = name;
	}

	// non static
	private void printContent() {
		
		System.out.println(name + " & " + school);
	}

	public static void main(String[] args) {

		// Creating First Student Object
		StaticNonStatic_Variables o1 = new StaticNonStatic_Variables("Adarsh1");
		// Calling the dynamic method, using the 1st student object
		System.out.println(1);
		o1.printContent();
		
		//TODO Calling the static variable and assigning some value
		StaticNonStatic_Variables.school = "CSS";
		// Calling the dynamic method, using the 1st student object
		System.out.println(2);
		o1.printContent();
		
		
		// Creating Second Student Object
		StaticNonStatic_Variables o2 = new StaticNonStatic_Variables("Adarsh2");
		// Calling the dynamic method, using the 2nd student object
		System.out.println(3);
		o2.printContent();

		// Creating Third Student Object
		StaticNonStatic_Variables o3 = new StaticNonStatic_Variables("Adarsh3");
		// Calling the dynamic method, using the 3rd student object
		System.out.println(4);
		o3.printContent();
		
		//TODO Calling the static variable and assigning some value
		StaticNonStatic_Variables.school = "IPS";
		
		// Calling the dynamic method, using the 1st, 2nd and 3rd student object
		System.out.println(5);
		o3.printContent();
		System.out.println(6);
		o2.printContent();
		System.out.println(7);
		o1.printContent();

	}

}
