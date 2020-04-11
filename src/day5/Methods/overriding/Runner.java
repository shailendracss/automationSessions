package day5.Methods.overriding;

public class Runner {
	public static void main(String[] args) {
		
		// Creating Simple Objects
		Add_Int o1 = new Add_Int();
		
		o1.add(2, 4);
		
		// Creating Simple Objects
		Add_Double o2 = new Add_Double();
		
		o2.add(1, 2);
		
		o2.add(2.5, 3.4);
		
		// This is how overriding works
		// Creating objects which overrides the methods
		// Creating the Reference of Parent class
		// Instantiating it with Child Class
		Add_Int o3 = new Add_Double();
		
		o3.add(8, 9);
		// which add method will be called here?
		
		
		
	}
}
