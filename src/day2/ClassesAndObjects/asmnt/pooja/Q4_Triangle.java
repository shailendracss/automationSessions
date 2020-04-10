package day2.ClassesAndObjects.asmnt.pooja;

public class Q4_Triangle {
	private int a;
	private int b;
	private int c;
	private double area;

	private Q4_Triangle(int x, int y, int z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}
	private void print(){
		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			int s = (a + b + c) / 2;
			area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.println("Area of triangle is :" + area);
		} else {
			System.out.println("Not a triangle");
		}
	}

	public static void main(String[] args) {
		Q4_Triangle tri = new Q4_Triangle(3, 4, 5);
		tri.print();

	}

}
