package day2.ClassesAndObjects.asmnt.pooja;

import java.util.Scanner;

public class Q6_Area {

	int length;
	int breadth;

	private void setDim(int l, int bi) {
		length = l;
		breadth = bi;
	}

	private int getArea() {
		return length * breadth;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lenght");
		int a = s.nextInt();
		System.out.println("Enter the breadth");
		int b = s.nextInt();
		Q6_Area rect = new Q6_Area();
		rect.setDim(a, b);
		System.out.println("Area of Rectangle is:" + rect.getArea());
	}

}
