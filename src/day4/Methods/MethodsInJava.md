# Instance Variables

Stores the state/property of Object, Declared at Class level

1. Visibility/Access Modifier >> [private/public/protected/blank(default)] --MANDATORY

2. Data Type >> [primitive data type/ non primitive data type(Array, Class)] --MANDATORY

3. static keyword >> It is a special keyword of Java, which makes the variable accessible by Class Name that means [NOW THIS VARIABLE IS BELONG TO CLASS AND WILL BE SHARED BY ALL OBJECTS OF THIS CLASS] -- OPTIONAL
// Example of static keyword
public class Student{
	public static String schoolName = "CSS School";

	public static void study(){
		print("Student is Studying");
	}
}

public class Runner{
	main(){
		print(Student.schoolName)
	}
}

4. final keyword >> It is a special keyword of Java, which makes the variable value unchangeable, and it always written with static keyword -- OPTIONAL
final keyword is used for creating constants in JAVA, and the names of constants should be all CAPS, separated by under scores

// Example of final keyword
public class Area{
	
	public static final double PI = 3.14;

	public static void calc_Area_Circle(double rad){
		// PI = 3.15; 
		// This is not possible, java will give compile time error
		
		print("Area = "+ PI * rad *rad);
	}
}

public class Runner{
	main(){
		print(Area.calc_Area_Circle)
	}
}

5. Name >> Should be meaningful, it should give away what actions the method is going to perform, and should follow the naming conventions, Should always starts with alphabets/underscore, it can contains number,underscore,alphabets max length allowed is 255 char  


# Methods

Summary >> Block of statements which contains the executable codes, Methods executes only when it is called by Its Name, from any other place.

To Create a Method use this rule :- 

1. Visibility/Access Modifier >> [private/public/protected/blank(default)] --MANDATORY

2. Return Type >> [void/ primitive data type/ non primitive data type(Array, Class)] --MANDATORY

3. static keyword >> It is a special keyword of Java, which makes the method accessible by Class Name -- OPTIONAL
// Example of static method
public class Student{
	public static void study(){
		print("Student is Studying");
	}
}

public class Runner{
	main(){
		Student.study();
	}
}



4. Name >> Should be meaningful, it should give away what actions the method is going to perform, and should follow the naming conventions, Should always starts with alphabets/underscore, it can contains number,underscore,alphabets max length allowed is 255 char  -- MANDATORY

5. Parameters >> Comma separated [primitive/non primitive] types, These parameter are available only inside method body   -- OPTIONAL

6. Method body >> {   }  It contains the actual executable code which is also called as Statements, which when executes changes the state of program  -- MANDATORY




Method always written inside a class/Interface/Abstract Class/ENUMS
// ALLOWED
class SomeClass{
	void m2(){
	}
}


A method can not be written inside other methods or inside any control/decision statements
// NOT ALLOWED
if(){
	void m2(){
	}
}

// NOT ALLOWED
for (){
	void m2(){
	}
}

// NOT ALLOWED
void m1(){
	void m2(){
	}
}







# Pseudo code for Java Method

	[private/public/protected/blank(default)] [void/ primitive data type/ non primitive data type(Array, Class)] METHOD_NAME (  PARAMETERS[primitive/non primitive] ){
	
	// EXECUTABLE STATEMENTS
	
	}  
	
	
	
# Accessing Static and Non Static members






