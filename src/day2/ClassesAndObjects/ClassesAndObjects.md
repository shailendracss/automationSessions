
# CLASS

	A class is a *user defined blueprint* or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:
	
# *How class is created/ Components of a class* :-

	- Modifiers : A class can be public or has default access (Refer this for details).
	- class Keyword
	- Class name: The name should begin with a initial letter (capitalized by convention).
	- [Optional] Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
	- [Optional] Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
	- Body: The class body surrounded by braces, { }.


## *What class contains*

	# Constructors are used for initializing new objects. Constructor has same name as class. They do not have any return type 
	# Fields/Ivar are variables that provides the [state of the class](values stored) and its objects, and 
	# Methods are used to implement the [behavior of the class] and its objects.

	There are various types of classes that are used in real time applications such as nested classes, anonymous classes, lambda expressions.


# OBJECT

	It is a basic unit of Object Oriented Programming and represents the real life entities.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of :

	# State : It is represented by attributes[Ivars] of an object. It also reflects the properties of an object.
	# Behavior : It is represented by methods[Functions] of an object. 
	# Identity : It gives a unique name to an object and enables one object to interact with other objects.

	Example of an object : adarsh,any actual student

## PSEUDO CODES

pulic class Teacher extends Employee implement Intelligent,Mammel {
	
}

// Sample Class
[public/private/protected/blank] class Student [extends/implements SuperClass/Interface name] {
	
	// Default Constructor
	public Student(){
		print("object created using default constructor");
	}
	
	// Parameterized Constructor
	public Student(String name){
		print("object created using parameterized constructor");
	}



	// variables : State of the Class
	// Instance variable(Ivar) are created at class level
	// Instance Variable/they are written directly inside class
	// Access modifiers are given to instance variables only.
	[public/private/protected/blank] String name;
	[public/private/protected/blank] int standard;
	[public/private/protected/blank] int age;
	
	
	// Methods/Functions : Behavior of the Class/Object
	// Getter methods always return some value
	// Setter mthods always accept some value
	[public/private/protected/blank] [return type>> void/data type/Class/Array] attendLectures(){
		print("Goto Class and attend the lecture");
	} 
	
	
	
}  


	// How Object is created
public class Test {
	psvm(){
		
		Student o1 = new Student();

	}
}



## ACTUAL WORKING SAMPLE CODE
// Class Declaration 
public class Student 
{ 
	// Instance Variables 
	private String name; 
	private int standard; 
	private int age; 

	// Constructor Declaration of Class 
	public Student(String name, int standard, int age) 
	{ 
		this.name = name; 
		this.standard = standard; 
		this.age = age; 
	} 

	// A Sample method to print the object details
	public void printDetails() 
	{ 
		System.out.println("Hi, my name is " + this.name + ", My age is " + this.age + ", and I Study in "+ this.standard); 
	} 

	public static void main(String[] args) 
	{ 
		// Creating the Object 
		Student adarsh = new Student("Adarsh Kumar", 12, 18);
		Student subhana = new Student("Subhana Khan", 11, 17);
		
		// Calling methods
		adarsh.printDetails();
		subhana.printDetails();
		
	} 
} 


