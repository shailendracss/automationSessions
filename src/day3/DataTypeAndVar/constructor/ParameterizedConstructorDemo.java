package day3.DataTypeAndVar.constructor;

public class ParameterizedConstructorDemo {
	
	public ParameterizedConstructorDemo(String name) {
		this.name = name;
	}
	
	private String name;
	
	private void print() {
		System.out.println("Name is "+ name);
	}
	
	public static void main(String[] args) {
		 
		// ParameterizedConstructorDemo normalObj = new ParameterizedConstructorDemo(); 
		 
		
		ParameterizedConstructorDemo paramObj = new ParameterizedConstructorDemo("Adarsh");
		
		paramObj.print();
		
			
		DefaultConstructorDemo def = new DefaultConstructorDemo();
		
		def.print();
				
	}
}
