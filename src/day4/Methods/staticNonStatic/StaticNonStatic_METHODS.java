package day4.Methods.staticNonStatic;


/**
 * 
 * This example explains how the static keyword affects the method calling
 * 
 * static members can not call the non static members directly
 * 
 * but
 * 
 * non static members can call static and non static members directly
 * 
 * */
public class StaticNonStatic_METHODS {

	// non static
	private String name;

	// non static
	public StaticNonStatic_METHODS(String name) {
		this.name = name;
	}

	// non static
	private void printContent() {
		System.out.println(name);
	}

	// non static
	private void someNonStaticCalling_NonStatic() {
		// Can I call the printContent method directly here? 
		// Yes, It is ALLOWED
		printContent();

		/**
		 * 
		 * Non Static members can call each other directly, without creating or
		 * referring to the object
		 * 
		 */

	}

	// static
	private static void someStaticCalling_NonStaticMember() {

		/**
		 * java always loads the static content before objects(non static members) in
		 * Memory, so compiler is not aware of the non static member before hand
		 * 
		 */

		// NOT ALLOWED
		// printContent();

		
		// ALLOWED
		/**
		 * If you want to use a non static member inside a static block
		 */
		StaticNonStatic_METHODS o1 = new StaticNonStatic_METHODS("someStaticCalling_NonStaticMember");

		// method is called by using the Object
		o1.printContent();

	}

	// non static
	private void someNonStaticCalling_Static() {
		
		// Calling a static method
		// ALLOWED
		someStaticCalling_NonStaticMember();
	}

	// static
	public static void main(String[] args) {

		StaticNonStatic_METHODS o1 = new StaticNonStatic_METHODS("Adarsh");

		// method is called by using the Object
		o1.printContent();

		o1.someNonStaticCalling_NonStatic();
		
		o1.someNonStaticCalling_Static();
		
		o1.someStaticCalling_NonStaticMember();

		StaticNonStatic_METHODS.someStaticCalling_NonStaticMember();

	}
}
