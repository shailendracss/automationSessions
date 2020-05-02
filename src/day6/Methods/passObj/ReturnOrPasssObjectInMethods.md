


# Why should we pass/return objects from methods
	- It reduces the chances of human error for user+coder
	- We can restrict the user to comply(pass only correct details and in specified format only)
	- It encourages the use of OOPS Concepts
	- Increases the Readability
	- Increases the understandability of the code

## COMPLEX ADDITION PROBLEM W/O USING CLASS AND OBJECTS

	public class Q9_Complex{ 
	
		main(){
			double x1 = 1;
			double y1 = 2;
			double x2 = 3;
			double y2 = 4;
	
			Q9_Complex q9 = new Q9_Complex(); 
			q9.performAddition(x1, y1, x2, y2);  
		}
		
		void performAddition(double x1, double y1, double x2, double y2) {
		// "Addition is = "+(x1+x2)+" + "+(y1+y2)+" i"
		System.out.println("Addition is = " + (x1 + x2) + " + " + (y1 + y2) + " i");
		}

	}
	

## COMPLEX ADDITION PROBLEM W/ USING CLASS AND OBJECTS

	Class >> provides blueprint to create objects

	Object >> Real time entity which has state and can perform some actions

	
	public class Q9_Complex{ 
		private double real;
		private double img;
		
		Q9_Complex(double real, double img){
			this.real=real;
			this.img=img;
		}
		
		main(){
		
			// *Creation of Object
			Q9_Complex o1 = new Q9_Complex(1,2);
			
			Q9_Complex o2 = new Q9_Complex(3,4);
	
	
			// Using the TOP DOWN APPROACH
			// *Passing the object
			Q9_Complex.performAddition(o1,o2);
		
			o1.performAddition(o2);
		
		}
	
		/* 
		Static Method, which will be called by CLASS, by passing two objects
		passed object will be referred by local variable(placeholders) obj1 and obj2

		catching the passed object in local placeholders obj1 and obj2
		*/
		public static void performAddition(Q9_Complex obj1, Q9_Complex obj2) {
		
			/*
				System.out.println("Addition is = " + (x1 + x2) + " + " + (y1 + y2) + " i");
				
				System.out.println("Addition is = " + (real1 + real2) + " + " + (img1 + img2) + " i");
				
			*/
		
			System.out.println("Addition is = " + (obj1.real + obj2.real) + " + " + (obj1.img + obj2.img) + " i");
			
		
		}
	


		/* 
		Non Static/Dynamic Method, which will be called by some object, by passing some object
		So Calling object will be referred by this keyword
		and passed object will be referred by local variable(placeholder) obj2
		*/
		public void performAddition(Q9_Complex obj2) {
			
				/*
					System.out.println("Addition is = " + (x1 + x2) + " + " + (y1 + y2) + " i");
					
					System.out.println("Addition is = " + (real1 + real2) + " + " + (img1 + img2) + " i");
					
					When you call a method using a object, so this keyword is used to point the calling object
					
				*/
			
				System.out.println("Addition is = " + (this.real + obj2.real) + " + " + (this.img + obj2.img) + " i");
				
			
			}


	
	}





	
	
