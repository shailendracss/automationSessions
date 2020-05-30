# LOOPs

	They repeat the same block again and again until the condition fails.
	
	Three types of loops are available in JAVA
	1. while
	2. do while
	3. for
		a. for each loop
	
	
	*Loop pseudo code*
	
	loop_name(CONDITION){ 		// until codition is true, repeat the below statements
		// Statements
	}
	
### Infinite loop
	When the condition never becomes false
	It can crash the system. (never do this)
	
	
	
### While

	while loop always check the condition first then execute the body
	-First we have to initialize a variable, 
	-then we have to check the condition, 
	-then increment the variable
	
	SYNTAX:
	
	while(condition){
		// Statements
	}

	condition can be >> relational(<,>,==,!= etc), method call(which returns boolean), using logical operators(&&, ||, !)
	
	
	Example to print the counting from 1 to 10;
	
	WITHOUT using loop
	
		main(){
			print(1);
			print(2);
			print(3);
			print(4);
			print(5);
			print(6);
			print(7);
			print(8);
			print(9);
			print(10);			
		}
		
	
	WITH using loop
	
		main(){
			
			int i = 1;
			
			while(i<=10){
				print(i);
				i++; // if you miss this line, i will always have 1 value in it, and loop will be infinite loop.
			}
		
		}	
	

	
	
### Do While
	Do while loop first execute the body then checks the condition,
	-First we have to initialize a variable,
	-Execute the body 
	-then increment the variable
	-then we have to check the condition 

	SYNTAX:
	do{
		// statements
	}while(condition); // when the condition is true, execute the loop body

	condition can be >> relational(<,>,==,!= etc), method call(which returns boolean), using logical operators(&&, ||, !)
	
	
	
	
### for 
	
	SYNTAX:
	for(initialize;condition;increment){ // when the condition is true, execute the loop body
		// statements
	}

	condition can be >> relational(<,>,==,!= etc), method call(which returns boolean), using logical operators(&&, ||, !)
	
	Pseudo code:
	
	Printing counting till 10 using for loop
	
		main(){
			for(int i=1; i<=10; i++){
				print(i);
			}
		} 
	
	
#### for each loop / enhanced for loop
	
	SYNTAX: 
		for(DATA_TYPE temp_var : COLLECTION_OBJECT){
			// STATEMENTS
		}

	It is applied only on collections(Map, List) and Arrays
	
	collection = When you want to store multiple Objects(Employees, String), you can use List, 
		List is dynamic in size.
	array = When you want to store multiple Objects(Employees, String)/primitive data types, you can use array, 
		Array is of Fixed size, 
		but it is faster
	
	pseudo code:
		main(){
			
			String[] colors = {"RED", "BLACK", "BLUE"} // this is an array
			
			for(String temp_var : colors){
				print(temp_var);
			}
				
		}
	
	
	
	
	
	
	
	