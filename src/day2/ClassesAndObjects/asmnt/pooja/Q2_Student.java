package day2.ClassesAndObjects.asmnt.pooja;

public class Q2_Student {
	private int rollno;
	private int phoneno;
	private String address;

	private Q2_Student(int r, int p, String a) {
		this.rollno = r;
		this.phoneno = p;
		this.address = a;
	}

	private void print() {
		System.out.println("rollno is  " + rollno + "phone no is  " + phoneno + "Address is " + address);
	}

	public static void main(String[] args) {
		Q2_Student sam = new Q2_Student(1, 876548999, "sam");

		Q2_Student john = new Q2_Student(2, 878774499, "john");
		sam.print();
		john.print();
	}

}
