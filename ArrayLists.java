package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.Collections;  	//  This is needed to prevent the new List from giving us an error.
import java.util.List;

public class ArrayLists {
	
	public static void main(String[]args) {
		
	//	List<String> names = new ArrayList<>(); 	// This is the line that actually CREATES the new list.
	
	// The following are objects within the list.
		
	//	names.add("Mustafa"); 
	//	names.add("Anisa");
	//	names.add("Moon");
	//	names.add("Helen");
	//	names.add("El Hadji");
	
	//	System.out.println(names); 				// This prints out all names.
	//	System.out.println(names.get(3));		// This prints out a specific name at a particular index.
	
	//	names.set(4, "Mo H");					// This is a quick way to plug in a name at the index of your desire.
	// 	names.remove(3);						// This removes a particular list item.
	
	
	//	Collections.sort(names);				// This method assorts the items in the list into alphabetical order.
	//	System.out.println(names.size());		// This method will shows you the size of the list you have created.
	//	System.out.println(names);
	
	//	for (String name: names) {				// This is how you execute an Enhanced/For-Each Loop on an Array List.
	//		System.out.println(name);
	//		}
		
		
		
																	//EXERCISE//
		
		
		
		List <String> shopping = new ArrayList<>(); 	// 1. Create a new ArrayList.
		
			shopping.add("Milk");						// 2. add() several elements.
			shopping.add("Eggs");
			shopping.add("Bread");
			shopping.add("Jam");
			shopping.add("Butter");
		
	//		System.out.println(shopping);				// 3. print out the ArrayList
			
	//		for (String food=0; food<shopping.size; food++) {	// 4a. iterate through the ArrayList and print out each  element in a FOR Loop.
	//					System.out.println((shopping[food]));	//		This is my attempt based on how to do this on a int variable.
	//			}
			
	//		for (String food: shopping) {				// 4b. iterate through the ArrayList and print out each  element in an Enhanced FOR loop.
	//			System.out.println(food);
			
	//		shopping.get(1);							// 5. use the get() method.
			
	//		shopping.set(1, "Oranges");					// 6. use the set() method.
	//		shopping.remove(2);							// 7. use the remove() method.
			
	//		Collections.sort(shopping);					// 8. use the sort() method.
		
				System.out.print(shopping);
			
			}
		
	}


