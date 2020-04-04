package day3.DataTypeAndVar.constructor;

public class DefaultConstructorDemo {
	/**
	 * Java has added default constructor by itself
	 * */
	
	public DefaultConstructorDemo() {
		this.name = "Automation Session";
	}
	
	private String name;
	
	public void print() {
		System.out.println("Name is "+name);
	}
	
	public static void main(String[] args) {
		
		System.out.println("FIRST LINE OF MAIN METHOD");
		
		DefaultConstructorDemo normalObj = new DefaultConstructorDemo();
	
		normalObj.print();
	}
	
}
