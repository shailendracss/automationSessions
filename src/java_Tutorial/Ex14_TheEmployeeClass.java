package java_Tutorial;

public class Ex14_TheEmployeeClass {

	private int id;
	private String firstname;
	private String Lastname;
	private int salary;

	// Constructor declaration of a class
	public Ex14_TheEmployeeClass(int id, String firstname, String Lastname, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.Lastname = Lastname;
		this.salary = salary;
	}

	public int getId() {
		return id;

	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percent) {
		return salary;
	}

	@Override
	public String toString() {
		//return "Employee[id="+id+", name="+firstname+" "+Lastname+", Salary="+salary+"]"
		return "Employee[id="+id+", name= "+firstname+" "+Lastname+" ,Salary="+salary+"]";
	}
}
