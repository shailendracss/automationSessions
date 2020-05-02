package day7.Methods.returnFromMethods;

public class BooleanReturn {
	
	public static void main(String[] args) {
		
		BooleanReturn b = new BooleanReturn();
		
		boolean bool = b.returnByUsingVariable();
		System.out.println(bool);
		
		bool = b.returnByUsingLiteral();
		System.out.println(bool);
		
	}

	private boolean returnByUsingLiteral() {
		return false;
	}

	private boolean returnByUsingVariable() {
		boolean flag = false;
		
		// some code, which changes the value of flag to true
		
		return flag;
	}
}
