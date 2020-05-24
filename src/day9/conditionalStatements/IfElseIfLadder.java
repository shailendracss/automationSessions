package day9.conditionalStatements;

import java_Tutorial.Ex11_Circle;
import java_Tutorial.Ex13_Rectangle;
import java_Tutorial.Shape;

public class IfElseIfLadder {
	public static void main(String[] args) {
		
		String whichShapeYouWant = "rectanglee";
		// circle, rectangle
		
		Shape shape = null; // Declared the Object which we are going to init in if-else ladder
		
		if(whichShapeYouWant.equals("circle")) {
			
			shape = new Ex11_Circle();
		
		}else if(whichShapeYouWant.equals("rectangle")) {

			shape = new Ex13_Rectangle(4, 5);
			
		} else {
			
			System.out.println("Incorrect shape name provided, so we are making the object of Circle");
			shape = new Ex11_Circle();
				
		}
		
		
		System.out.println("AFTER WHOLE LADDER, Always Run");
		
		
		System.out.println("AREA = " + shape.getArea());
		
	}
	
}
