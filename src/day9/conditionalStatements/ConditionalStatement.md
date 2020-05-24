# Decision Making in Java (if, if-else, switch, break, continue, jump)

### SOURCE : https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/

	if()
	else if()
	switch()

 Some examples: 
 
	1. User will give us two numbers,we have to find out which one is larger

	if(*CONDITION* WHICH SHOULD RESULT A BOOLEAN(true/false) VALUE){
	
	}else{
	
	}


*CONDITION* >> 

1. Relational Operators
	
	All these symbols are applied on Primitive data types(int, double, float, long, char, boolean) and variable which hold primitive values
	They are not applicable on Objects(String, Array, Class(Object))
	- < less than
		(12 < 12) >> RESULT >> false 
			In English
				Q:  Is 12 less than 12? 
				A: false
		(12 < 11) >> RESULT >> false 
			In English
				Q:  Is 12 less than 11? 
				A: false
		(11 < 12) >> RESULT >> true 
			In English
				Q:  Is 11 less than 12? 
				A: true
		
	- > greater than
		(12 > 12) >> RESULT >> false 
			In English
				Q:  Is 12 greater than 12? 
				A: false
		(12 > 11) >> RESULT >> true 
			In English
				Q:  Is 12 greater than 11? 
				A: true
		(11 > 12) >> RESULT >> false 
			In English
				Q:  Is 11 greater than 12? 
				A: false
		
	- <= less than equal to
		(12 <= 12) >> RESULT >> true 
			In English
				Q:  Is 12 less than or equal to 12? 
				A: true
		(12 <= 11) >> RESULT >> false 
			In English
				Q:  Is 12 less than or equal to 11? 
				A: false
		(11 <= 12) >> RESULT >> true
			In English
				Q:  Is 11 less than or equal to 12? 
				A: true
		
	- >= greater than equal tov
		(12 >= 12) >> RESULT >> true
			In English
				Q:  Is 12 greater than or equal to 12? 
				A: true
		(12 >= 11) >> RESULT >> true
			In English
				Q:  Is 12 greater than or equal to 11? 
				A: true
		(11 >= 12) >> RESULT >> false
			In English
				Q:  Is 11 greater than or equal to 12? 
				A: false
		
	- == equal to
		(12 == 12) >> RESULT >> true
		(12 == 16) >> RESULT >> false
		(12 = 16) >> *ERROR*:- NOT A VALID CONDITIONAL STATEMENT, because single = is assignment operator
		
	- != not equal to
		(12 != 12) => RESULT => false
		(12 != 13) => RESULT => true
	
	 
		PSEUDO CODE 1: 
			if(12<15){ // => true
				print("Hello");
			}
			print("Hi");
			
		OUTPUT:
			Hello
			Hi
			
		PSEUDO CODE 2: 
			if( 18<15 ){ // => false
				print("Hello");
			}
			print("Hi");
			
		OUTPUT:
			Hi			
			
			
2. By Calling a method which returns a boolean value

	PSEUDO CODE:3
	main(){	
		if( obj.methodName() ){ 
			// Remember method return type should be boolean and 
			// method should perform some actions to decide the result
			
			print("Yes its true");
		}
		print("I am outside If, I will always run");
	}

	boolean methodName(){
		boolean bool = false;
		// whatever code you want to write
		bool = true;
		//
		return bool;
	}
	
3. Logical Operators [&&(AND), ||(OR), !(NOT)]

	Example : 
	Requirement>>
	If you are a female of age greater than 18 then you will get a free coffee
	If you are a male of age less than 18 then you will get a free coffee and a free toast
		
	we are discussing 2 parameters here
	1. age : int
	2. gender : boolean
	
	3. Result :
		- Free Coffee
		- Free Toast
		
	|	age	|	gender	|	Free Coffee	|	Free Toast	|
	|	17	|	male		|	YES		|	YES		|
	|	18	|	male		|	No		|	No		|
	|	19	|	male		|	No		|	No		|
	|	17	|	Female	|	No		|	No		|
	|	18	|	Female	|	No		|	No		|
	|	19	|	Female	|	YES		|	No		|


	*PSEUDO CODE*: 
	boolean gender = false; // false = Female, and true = Male
	int age = 19;
	
	if(age<18 && gender){ // FOR MALE
		print("FOR MALE = COFFEE + TOAST");
	} else if (age>18 && !gender){ // FOR FEMALE
		print("FOR FEMALE = COFFEE");
	}else {
		print("Sorry no free treats for you!");
	}

	_____________________________________________________	
	LeftCond >> age > 18
	RightCond >> gender
	
	&& >> It is called AND operator
	Result 1 and Result 2 are boolean only
	|	LeftCond	|	RightCond	|	O/P	|
	|	T		|	T		|	T	|
	|	T		|	F		|	F	|
	|	F		|	T		|	F	|
	|	F		|	F		|	F	|
	
	|| >> It is called OR operator
	Result 1 and Result 2 are boolean only
	|	LeftCond	|	RightCond	|	O/P	|
	|	T		|	T		|	T	|
	|	T		|	F		|	T	|
	|	F		|	T		|	T	|
	|	F		|	F		|	F	|
	
	! >> It is called NOT operator
	Result 1 is boolean only
	|	LeftCond	|	O/P	|
	|	T		|	F	|
	|	F		|	T	|
	
	 
	
	*************************************************************************************
	Suppose you are Testing JIRA Issue Advance Search func using Selenium Java Automation
	
	PSEUDO CODE:
	
	@Test
	someTestMethod(){
		
		JIRA_Search search = new JIRA_Search(); 
		search.selectProject("HCM");
		search.selectType("Bug");
		search.selectStatus("Fixed");
		
		search.selectFirstIssue();
		
		String project = com.getText("xpath of HCM Project");
		String issueType = com.getText("xpath of BUG issue Type");
		String status = com.getText("xpath of Status");
		
		// if( project == "HCM" ) // This is incorrect, becoz relational op are not applied on objects
		if( project.equals("HCM") && issueType.eqauls("Bug - Change issue type") &&  status.equals("Fixed")){
			report("PASS", "Project, Status and Issue Type filter is working fine");
		}else{
			report("FAIL", "Project, Status and Issue Type filter is NOT working");
		}
		
	}

	
	
## Understanding the if and if-else
	
### Normal If:-
	If(CONDITION){
		// BODY
	}
	
	
	First Way
	if(age>18){
		print("age is more than 18");
		// It can have multiple statements inside if
	}
	
	Second Way
	if(age>18)
		print("age is more than 18"); // It can have single statement inside if
	
	
### Nested If:-
	
	Note :- Nesting creates maintenance problems, try to avoid too much nesting, upto 3 level is fine.
	
	/*
	if(age<18 && gender){ // FOR MALE
		print("FOR MALE = COFFEE + TOAST");
	*/
	
	if(age<18){ // level 1
		if(gender){ // level 2
			print("MALE LESS THAN 18 = Free Coffee and Free Toast");
		}
	}
	
	
	
### if else ladder
	One example where if else ladder can be applied, is when user has to choose one thing aamong many options.
	
	When our test cases are executing, we can decide a browser
	
	String browser = "CHROME"; //FF, IE 
	
	WebDriver driver = new ChromeDriver(); // Open chrome browser
	WebDriver driver = new FirefoxDriver(); // Open Firefox browser
	WebDriver driver = new InternetExplorerDriver(); // Open IE browser

	SYNTAX:-
	if(CONDITION1){
		// STATEMENTS
	} else if(CONDITION2){
		// STATEMENTS
	} else if(CONDITION3){
		// STATEMENTS
	} else if(CONDITION4){
		// STATEMENTS
	} else if(CONDITION5){
		// STATEMENTS
	} else {
		// STATEMENT, which will execute when all coditions fails
	}
	
	Pseudo Code:
		
	String browser = "CHROME";
	
	if(browser.equals("CHROME")){
		WebDriver driver = new ChromeDriver(); // Open chrome browser
	}else if(browser.equals("FF")){
		 WebDriver driver = new FirefoxDriver(); // Open Firefox browser
	}else if(browser.equals("IE")){
		 WebDriver driver = new InternetExplorerDriver(); // Open IE browser
	} else {
		print("Incorrect browser is provided, running the tests on chrome browser");
		 WebDriver driver = new ChromeDriver(); // Open chrome browser	
	}	
	
	driver.get("desired url") // COMPILE TIME ERROR, driver variable/object not defined
	
	// SOLUTION : is to declare the variable outside the conditional statements 
	
	
### Switch Case
	
	Pro: It is more readable, and executes faster than If Else ladder
	Cons: It matches Single condition only,  It always check for equality.
	
	Syntax:
	
	switch(KEY) { // key could be String, int, boolean 
	
		case  value1 :
			// Statements
		break;
		
		case  value2 :
			// Statements
		break;
		
		case  value3 :
			// Statements
		break;
		
		default : 
		 	// statements
	}
	
	Pseudo Code:
	
	String browser = "CHROME"; // FF, IE
	
	WebDriver driver = null;
	
	switch(browser) {
		
		case "CHROME" : 
			driver = new ChromeDriver();
		break;
		
		case "FF" : 
			driver = new FirefoxDriver();
		break;
		
		case "IE" : 
			driver = new InternetExplorerDriver();
		break;
	
		default :
			print("Incorrect browser is provided, running the tests on chrome browser");
		 	driver = new ChromeDriver(); // Open chrome browser
	}
	
	driver.get("desired URL");
	

### Jump Statements (continue, break, return)	