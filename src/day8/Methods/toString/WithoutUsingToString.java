package day8.Methods.toString;

public class WithoutUsingToString {
	
	private double radius;

	public WithoutUsingToString() {
		radius = 1.0;
	}
	
	public WithoutUsingToString(double radius) {
		this.radius = radius;
	}
	
	
	public static void main(String[] args) {
		WithoutUsingToString o1 = new WithoutUsingToString();
		
		// putting the object directly in sysout, this will print the gabage value on console
		System.out.println(o1);
		
	}
	
	
}
