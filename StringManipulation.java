package com.qa.qacommunity;
public class StringManipulation {

	public static void main(String[] args) {
		
	//	StringManipulation mustafa = new StringManipulation();  	-- Initialising this String and then outputting it,
	//	System.out.println(mustafa);								-- will only output the memory location of this String on the CPU.
		
	//	String mustafa =  "My bloody name is Mustafa";				-- The difference between these two Strings:THIS one is INTERED in memory.
	//	String mustafa2 = new String("My bloody name is Mustafa");	-- & this one is stored a FRESH new Object.
		
	//	System.out.println(mustafa);
	//	System.out.println(mustafa2);								-- when printed, the two mustafa Strings print the same thing.
	
					// String Concatenation//
		
	//	String anisa = "Hi, I'm Anisa ";							
	//	String goodbye = " Bye guys.";	
	//		System.out.println(anisa  + goodbye);					-- This concatenates the two Strings (exactly how they are - no spaces)
			
	//		System.out.println(goodbye.toUpperCase());				-- This is an upper-case Method.
	//		System.out.println(anisa.toLowerCase());				-- This  is a lower-case Method.
		
			
		
														// EXERCISE //
		
	// 1a. Create two  Strings where one string has the value "yesterday it was raining" and the other String: "today it  is sunny"
		
		String yesterday = "Yesterday it was raining  ";
		String today = "Today it is sunny.";
	
	//	1b. Concatenate both values, CAPITALISE both Strings and output the results.
		
			System.out.println(yesterday.toUpperCase() + today.toUpperCase() );
	
	// 1c.  Use the substring method to print "TODAY  IT IS RAINING".
			
			String  subString1  = today.substring(0, 12);
			String 	subString2  = yesterday.substring(17, 24);
			
				System.out.println(subString1.toUpperCase() + subString2.toUpperCase());
				
	// 2. Implement 4 methods that manipulate  String objects. 

				// i. Method 1  - Count and return how many words there are in  that String.
				
					String test = "This test";
					System.out.println(test.length());
				
				// ii. Method 2 - Print out this String VERTICALLY.
				
	//				String[] test1 = { 								--  This was my attempt.
	//				   	 "This Test"
	//					};
	//					for (String str : test1) {
	//				 	   System.out.println(str);
	//				    toVerticalWords(str);						-- I had a problem with this line not being a method that is usable on this class.
	//				}
				
					// iii. Method 3 - Print the String Vertically, and in REVERSE.
					
	//				System.out.println(test.reverse());				-- Same error  as the Vertical method, maybe I dont know the correct methods
	//																-- OR maybe the answer is a lot more complex.
						
		
	}
	
}
