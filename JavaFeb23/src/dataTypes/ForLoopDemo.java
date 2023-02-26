package dataTypes;

public class ForLoopDemo {

	public static void main(String[] args) {
		/**
		 * for(initialization / start point,how far/end point,how ill it increase or decrease)
		 * {
		 * code to be executed
		 * }
		 */
		
		//write "I Love You" 10 times using for loop
	/*	System.out.println("Starts");
		for(int i =1; i<=10; i++) {
			System.out.println(i +". I love You");
			
		}
		System.out.println("Ends !!");
		
		System.out.println("Starts");
		for(int i =1; i<=3; i++) {
			System.out.println(i +". I live in Staten island");
			
		}
		System.out.println("Ends !!");

*/

 /**
  * Syntax for while loop
  * initialization
  * while(Condition) {
  * 
  * //statement
  * increment/decrement
  * }
  * 
  * Syntax for do while loop
  * initialization;
  * do{
  *  //statement
  *  increment/decrement
  *  } while (condition)
  *  
  *  
  *  type i am from +variable 3 times using
  *  for, while and do while loop
  *  use String variable for referring to 
  *  your place 
  
		
		int i = 1;
		while (i<=3) {
			System.out.println("I am from Staten Island");
			i++;
		}
		
		
		int i = 1;
		do {
			System.out.println("I am from Staten Island");
			i++;
	
		
		}while (i<=3);
		
		*/
	
		/** System.out.println("Using While Loop");
	
	String location = "staten Island";
	int i = 1;
	while (i<=3) {
		System.out.println(i+". I am from " + location);
		i++;
	}
	
	
	System.out.println("Using Do While Loop");
	
	String location = "Staten Island";
	int i = 1;
	do {
		System.out.println(i+". I am from " + location);
		i++;
	}while (i<=3);
	
	
	*/
		
	  System.out.println("Using for loop");
	   String location = "Staten Island";
	   for(int i =1; i<=3; i++) {
		System.out.println(i+ "."+" I am from " +location);
	}
	
	
	
	
	}
}
