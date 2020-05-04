package day5.Methods.overriding;

public class Add_Double extends Add_Int{
	
	//Overriding the parent class method, and enhancing its functionality
	public void add(int a, int b){
		System.out.println("OUTPUT= "+(a+b));
		
	}
	
	public void add(double a, double b){
		System.out.println("OUTPUT= "+(a+b));
	}
	
}
