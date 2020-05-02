
# Methods
Summary >> Block of statements which contains the executable codes, Methods executes only when it is called by Its Name, from any other place. and after execution completes, methods always returns some value.

Return value of method depends on return type.

Below are some types 

1. Void >> Method will not return any value
2. Primitive Data Types >> Method will return a single value of defined data type, either by some variable/literal value
	* int
	* long
	* float
	* double
	* boolean
	* char


	*INTEGER AND LONG*
	Ex 1:
	// Returning value using a variable
	public int someMethod(){
		int temp = 0;
		
		return temp;
	}

	Ex 2:
	// Returning literal value
	public int someMethod(){
		return 0;
	}
	
	
	*CHARACTER*
	Ex 1:
	
	// Returning value using a variable
	/*
	American Standard Code for Information Interchange.
	ASCII is a code for representing English characters as numbers, each letter of english alphabets is assigned a number ranging from 0 to 127. For example, the ASCII code for uppercase P is 80. In Java programming, we have two ways to find ASCII value of a character 1) By assigning a character to the int variable 2) By type casting character value as int
	*/
	public char someMethod(){
		char temp = 0; // << This is valid, Char can also hold the integer values from range 0-127
		
		return temp;
	}
	
	Ex 2:
	// Returning value using a variable
	public char someMethod(){
		char temp = 'A'; // << This is valid, Char values should always enclosed in single quotes
		
		char temp2 = A; // << This is invalid, will give compile time error
		
		
		return temp;
	}

	Ex 3:
	// Returning literal value
	public char someMethod(){
		return 80;
	}
	
	Ex 4:
	// Returning literal value
	public char someMethod(){
		return 'A';
	}
	
	*DOUBLE AND FLOAT*
	Ex 1:
	// Returning value using a variable
	public double someMethod(){
		double temp = 0.0;
		
		return temp;
	}

	Ex 2:
	// Returning literal value
	public double someMethod(){
		return 0.0;
	}
	
	
	*BOOLEAN* >> Most Important
	In Selenium, we have many methods which checks various conditions of objects like.
	* visible or not
	* enable or not
	* clickable or not
	* checkbox is checked or not
	* hidden or not
	* removed or not
	
	and based on above conditions, methods returns a boolean value.
	
	Ex 1:
	// Returning value using a variable
	public boolean someMethod(){
		boolean temp = false;
		
		return temp;
	}

	Ex 2:
	// Returning literal value
	public boolean someMethod(){
		return false;
	}
	
	
	
3. 	Objects, below are some examples
	* String
	* Custom Classes >> Employee, Student etc
	
	
4. Array >> Method will return a multiple value of defined data type, either by some variable/literal value
	int array >> [1, 2, 3, 4, 5]
	long array >> [123, 22, 33, 34, 45]
	boolean array >> [false, true, true, false]
	char array >> ['a', 'c']
	float array >> [1.5, 1.8]
	double array >> [1.7, 1.9]
	String array >> ["val1", "val2", "val3"]
	Object(Custom Class) array >> [employee1, employee2, employee3]
	array of array >> [ [1,2] , [3,4] , [4,5] ] >> Matrix in Maths