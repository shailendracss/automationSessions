package day2.ClassesAndObjects.asmnt.pooja;

class Q1_Student {
	private String name;
	private int rollno;

	public Q1_Student(String s, int i) {
		this.name = s;
		this.rollno = i;
	}

	public void display() {
		System.out.println("name is   " + name + "   rollno is   " + rollno);
	}

	public static void main(String[] args) {
		Q1_Student stud = new Q1_Student("pooja", 12);
		stud.display();
	}

}
