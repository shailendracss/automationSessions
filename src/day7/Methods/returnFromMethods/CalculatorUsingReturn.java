package day7.Methods.returnFromMethods;

public class CalculatorUsingReturn {
	public static void main(String[] args) {

		CalculatorUsingReturn c = new CalculatorUsingReturn();

		// First we try to add 2 numbers, so we create a new method
		c.add(1, 2);

		// Then we try to add 3 numbers, so we again create a new method
		c.add(1, 2, 3);

		// Then we try to add 4 numbers, so we again create a new method
		c.add(1, 2, 3, 4);

		// You can all a returning method like this also, but if you do not hold the
		// result in some variable then the result will be lost
		c.addReturn(3, 4);

		// This is the correct way to call a method which is returning some value
		int sum = c.addReturn(1, 2);
		System.out.println("sum "+sum);
		sum = c.addReturn(sum, 1);
		System.out.println("sum "+sum);
		sum = c.addReturn(sum, 1);
		System.out.println("sum "+sum);
		sum = c.addReturn(sum, 1);
		System.out.println("sum "+sum);
		sum = c.addReturn(sum, 1);
		System.out.println("sum "+sum);
		sum = c.addReturn(sum, 1);
		System.out.println("sum "+sum);
		
	}

	private int addReturn(int i, int j) {
		return i + j;
	}

	private void add(int i, int j, int k, int l) {
		System.out.println(i + j + k + l);
	}

	private void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	private void add(int i, int j) {
		System.out.println(i + j);
	}
}
