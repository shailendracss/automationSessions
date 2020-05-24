package day9.conditionalStatements;

public class NestedIfExample {
	public static void main(String[] args) {
		
		int age = 19;
		boolean gender = false; // true for male
		
		if(age<18){ // level 1
			
			if(gender){ // level 2
				System.out.println("A MALE LESS THAN 18 = Free Coffee and Free Toast");
			}
			

			System.out.println("B AFTER AGE IF");
		}
		
		System.out.println("C AFTER NESTED IF, ALWAYS RUN");
	}
}
