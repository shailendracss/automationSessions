package day2.ClassesAndObjects.asmnt.pooja;

public class Q5_Rectangle {
	private int length;
	private int breadth;

	private Q5_Rectangle(int l, int b) {
		this.length = l;
		this.breadth = b;

	}

	private void area() {
		int area1 = length * breadth;
		System.out.println("Area of Rectangle is:" + area1);
	}

	public static void main(String[] args) {
		Q5_Rectangle rect1 = new Q5_Rectangle(4, 5);
		Q5_Rectangle rect2 = new Q5_Rectangle(5, 8);
		rect1.area();
		rect2.area();

	}

}
