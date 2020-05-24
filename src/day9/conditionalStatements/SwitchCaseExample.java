package day9.conditionalStatements;

import java_Tutorial.Ex11_Circle;
import java_Tutorial.Ex13_Rectangle;
import java_Tutorial.Shape;

public class SwitchCaseExample {
	public static void main(String[] args) {
		
		String whichShapeYouWant = "qwerectangle"; //circle, rectangle
		
		Shape sh = null;
		
		switch(whichShapeYouWant) {
		
		case "circle" :
			sh = new Ex11_Circle();
			break;
			
		case "rectangle" :
			sh = new Ex13_Rectangle(5, 6);
			break;
		
		default :
			System.out.println("Incorrect choice, creating circle");
			sh = new Ex11_Circle();
		}
		
		
		System.out.println("AREA "+sh.getArea());
	}
	
}
