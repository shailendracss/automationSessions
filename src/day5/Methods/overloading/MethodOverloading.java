package day5.Methods.overloading;

public class MethodOverloading {

	public void add(int a, int b){
		System.out.println("M1 "+(a+b));
	}
	
	public void add(int a, int b, int c){
		System.out.println("M2 "+(a+b+c));
	}
	
	public void add(double a, double b){
		System.out.println("M3 "+(a+b));
	}
	
	public void add(double a, double b, double c){
		System.out.println("M4 "+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		// Abstraction >> USER will not know, which method was actually executed to get the result
		// So this provides us one feature of Object Oriented programming
		MethodOverloading o = new MethodOverloading();
		
		o.add(1, 2);
		
		o.add(1.2, 2.5);
		
		o.add(1, 2, 3);
		
		o.add(1.2, 2.5, 3.8);
		
		
	}
	
}
