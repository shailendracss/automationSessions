package day8.Methods.toString;

public class WithUsingToString {

	private double radius;

	public WithUsingToString() {
		radius = 1.0;
	}
	
	public WithUsingToString(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public String toString() {
		return "Radius " + radius;
	}
	
	public static void main(String[] args) {
		WithUsingToString o1 = new WithUsingToString();
		
		// putting the object directly in sysout, this will print the gabage value on console
		System.out.println(o1);
		
	}
	

}
