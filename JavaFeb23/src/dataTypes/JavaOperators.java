package dataTypes;

public class JavaOperators {

	public static void main(String[] args) {
		/** There are 5 types of java operators
		 * 
		 * Arithmetic Operators
		 * Assignment 
		 * Comparison /Relational Operators
		 * Bitwise Operators
		 
		 
		
		 */
		
		//Learning Arithmetical Operators 
		//They are + - * / ++ --
		
		int a = 10;
		int b = 5;
		int  result;
		result = a +b; // addition 
		System.out.println("Addition result is " + result); //15
		result = a - b; // Subtraction 
		System.out.println("Subtraction result is " + result); //5
		result = a * b; // Multification
		System.out.println("Multification result is " + result); //50
		result = a / b; // Modules 
		System.out.println("Modules result is " + result); // 2
		result = a % b; // Division
		System.out.println("Division result is " + result);  // 0
		System.out.println("Incremental a is " +a++); // this will not work this way 
		System.out.println("Decremental a is " +a--); //  this will not work  this way 
	}

}
