package day2.ClassesAndObjects.asmnt.pooja;

import java.lang.Math;

public class Q3_Triangle {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			int s = (a + b + c) / 2;
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.println("Area of triangle id :" + area);
		} else {
			System.out.println("Not a triangle");
		}
	}

}
