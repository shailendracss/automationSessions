package day2.ClassesAndObjects.asmnt.Adarsh;

import java.util.Scanner;

public class Q3_Triangle {

	public static void main(String args[]) 
    {   
       
         int a= 3;
 
          int b= 4;
 
         int c= 5;
       
         // Checking validity of triangle
         if((a+b)>c && (a+c)>b && (b+c)>a)
          {
            int s=(a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
             System.out.println("Area of Triangle is: " + area);    
             System.out.println("Perimeter of triangle : " + (a+b+c));
           }
         else  
           System.out.println("Area of Triangle not exit");
   }
}
