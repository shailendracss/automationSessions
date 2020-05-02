package day7.Methods.returnFromMethods;

public class ObjectReturn_String {
	public static void main(String[] args) {
		
		ObjectReturn_String obj = new ObjectReturn_String();
		
		String val = obj.returnStringObject_Variable("Adarsh");
		System.out.println(val);
		

		val = obj.returnStringObject_Literal("Gourav");
		System.out.println(val);
		
	}

	private String returnStringObject_Literal(String name) {
		return "Hello " + name +"!";
	}

	private String returnStringObject_Variable(String name) {
		String temp = null; // Valid
		//String temp = ""; // Valid 
		
		// Now our method is doing some processing
		temp = "Hello " + name +"!";
		
		return temp;
	}
}
