package day7.Methods.returnFromMethods;

public class IntegerLongReturn {
	public static void main(String[] args) {
		IntegerLongReturn obj = new IntegerLongReturn();
		
		int val = obj.returnByUsingVariable();
		System.out.println(val);
	
		val = obj.returnByUsingLiteral();
		System.out.println(val);
	}

	private int returnByUsingLiteral() {
		return 100;
	}

	private int returnByUsingVariable() {
		int temp = 200;
		return temp;
	}
}
