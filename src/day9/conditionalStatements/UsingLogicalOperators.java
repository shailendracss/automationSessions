package day9.conditionalStatements;

/**
 * This class wil demo, the use of Logical Operators in solving a practical
 * problem
 * 
 * @author Shailendra 23-May-2020
 */
public class UsingLogicalOperators {
	/*
	 * PROBLEM STATEMTENT: 
	 * If you are a female of age greater than 18 then you will
	 * get a free coffee 
	 * If you are a male of age less than 18 then you will get a
	 * free coffee and a free toast
	 */
	
	
	public static void main(String[] args) {
		
		
		boolean gender = false; // false = Female, and true = Male
		int age = 19;
		
		if(age<18 && gender){ // FOR MALE
			System.out.println("FOR MALE = COFFEE + TOAST");
		} else if (age>18 && !gender){ // FOR FEMALE
			System.out.println("FOR FEMALE = COFFEE");
		}else {
			System.out.println("Sorry no free treats for you!");
		}
		
		
	}
	
}
