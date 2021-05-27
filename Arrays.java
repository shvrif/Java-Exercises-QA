package com.qa.qacommunity;

public class Arrays {
	
	public int[] ageArray; //this is basic Array without any data in it.
	
	public int[] ageArray1 = {24,15, 188}; //this Array has 3  integer values it.
	
	public int[] ageArray2 = new int[5]; //this means you can store 5 different values in this Array.
	
	
	
		
		// ARRAYS //
	
	//	int [] ageArray3 = { 1, 2, 3, 4, 5, 6 };
	//	String[] nameArray = { "John", "Emma", "Alex", "Rachel", "Sean" };
		
		// For loop //
	
	//	for (int i=0; i<ageArray3.length; i++) {
	//		System.out.println((ageArray3[i]));
	//	}
		
		// FOR - EACH loop  (ENHANCED for loop)		- In Arrays, this type of Loop is probably the easiest to use.
	//	for (String name: nameArray) {
	//		System.out.println(name);
	//	}
	//
	//}
	
	
										//EXERCISES//
	
	// 1. Create an array that will hold 10 integer value, populate the array with values, then call and output each element.
	
				// public static int[] num = new int[10]; 
		
			// public static void main (String[]args) {
		
				// num[3] = 6;
			
	// 2a. Create a FOR LOOP that populates an integer array with values, outputting them at each iteration.
		
				public static int[] num = new int[10];
				
			public static void main  (String[]args) {
				
				for ( int i : num ) {
					System.out.println( "Number: " + i );
				}
	// 2b. Then, create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting each time.
	
		}
	}
	
