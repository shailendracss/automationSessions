package day2.ClassesAndObjects.asmnt.pooja;

import java.util.Scanner;

public class Q7_Area {
       private int length;
       private int breadth;
       private Q7_Area(int l,int b){
    	   this.length=l;
    	   this.breadth=b;
       }
       private void returnArea(){
    	   int area=length*breadth;
    	   System.out.println("Area of Rectangle is:"+area);
       }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length");
		int a = s.nextInt();
		System.out.println("Enter the breadth");
		int b = s.nextInt();
		Q7_Area rect = new Q7_Area(a,b);
		rect.returnArea();
// vulnerability
	}

}
