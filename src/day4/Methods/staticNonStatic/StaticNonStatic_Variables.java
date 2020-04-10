package day4.Methods.staticNonStatic;

/**
 * 
 * Java always initialize the instance variables with the default values. 
 * int >> 0 
 * double >> 0.0 
 * boolean >> false 
 * String >> null
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

		StaticNonStatic_Variables o1 = new StaticNonStatic_Variables("Adarsh1");
		o1.printContent();

		
		StaticNonStatic_Variables.school = "CSS";
		o1.printContent();
		
		
		StaticNonStatic_Variables o2 = new StaticNonStatic_Variables("Adarsh2");
		o2.printContent();


		StaticNonStatic_Variables o3 = new StaticNonStatic_Variables("Adarsh3");
		o3.printContent();
		

		StaticNonStatic_Variables.school = "IPS";
		o3.printContent();
		o2.printContent();
		o1.printContent();

	}

}
