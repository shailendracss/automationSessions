package day1;

public class CodingStandards {
	
	// Naming Conventions
 
/**
  * 1. Class Name >> Should be meaningful, First Letter Caps then all small, then use camel case, You can also give numbers, _ , max length = 255 chars
  * 
  * DataReader
  * 
  * double [data type] != Double [Class]
  * 
  * 
  * 2. Method, Object, Variables name >> Should be meaningful, Start with small caps, Camel Casing, You can also give numbers, _ , max length = 255 chars
  * 
  * 
  * 
  * */
	
	
	// Variables Declaration
	double d1 = 10.2; // Correct
	
	Double d2 = 10.2; // Not Recommended

	String name_student = ""; // Correct
	
	String nameStudent = ""; // Correct
	
	String name1 = ""; // Correct
	
	String a = ""; // Not Rec
	
	String n1 = ""; // Not Rec


	// Indentation

	private void withoutIndentation() {
	int i = 10;
	if (i <= 18) {
	System.out.println("Teen");
	} else if (i > 18 && i <= 30) {
	System.out.println("Audult");
	} else if (i > 30 && i <= 60) {
	System.out.println("Middle Age");
	} else if (i > 60 && i <= 120) {
	System.out.println("Sr Citizen");
	} else {
	System.out.println("Come on man DIE!");
	}
	}

	
	private void withIndentation() {
		
		int i = 10;
		
		if (i <= 18) {
			System.out.println("Teen");
		} else if (i > 18 && i <= 30) {
			System.out.println("Audult");
		} else if (i > 30 && i <= 60) {
			System.out.println("Middle Age");
		} else if (i > 60 && i <= 120) {
			System.out.println("Sr Citizen");
		} else {
			System.out.println("Come on man DIE!");
		}
		
		
	}
	
	
}