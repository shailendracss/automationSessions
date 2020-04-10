package day2.ClassesAndObjects.asmnt.pooja;

import java.util.Scanner;
       
public class Q8_Average {
	int a1;
	int b1;
	int c1;
   private void setAvg(int x,int y,int z){
	   a1=x;
	   b1=y;
	   c1=z;
   }
   private int getAvg(){
	   return (a1+b1+c1)/3;
   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length");
		int a = s.nextInt();
		System.out.println("Enter the breadth");
		int b = s.nextInt();
		System.out.println("Enter the breadth");
		int c= s.nextInt();
		Q8_Average avg1=new Q8_Average();
		avg1.setAvg(a,b,c);
		System.out.println("Average is:"+avg1.getAvg());
	}

}
