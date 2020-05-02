package day7.Methods.returnFromMethods;

import day5.Method.asmnt.Adarsh.Q2_Employee;

public class ObjectReturn_Q2_Employee {
	public static void main(String[] args) {

		ObjectReturn_Q2_Employee obj = new ObjectReturn_Q2_Employee();

		Q2_Employee val = obj.returnEmployeeObject_Variable("Shailendra", 100, "Mhow", "CSS");
		System.out.println(val); // This will not work, unless your Custom Class has toString method
		val.printDetails();

		val = obj.returnEmployeeObject_Literal("Adarsh", 1000, "Mhow", "CSS");
		val.printDetails();

	}

	private Q2_Employee returnEmployeeObject_Literal(String name, int salary, String add, String company) {
		return new Q2_Employee(name, salary, add, company);
	}

	private Q2_Employee returnEmployeeObject_Variable(String name, int salary, String add, String company) {

		Q2_Employee temp = null;

		temp = new Q2_Employee(name, salary, add, company);

		return temp;
	}
}
