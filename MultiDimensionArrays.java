package com.qa.qacommunity;

public class MultiDimensionArrays {

	public static void main (String[]args) {
		
		int [][] ageArray = { { 24, 32, 98 } , {56, 23, 84} , {8, 1, 3 } };		
		String[][] nameArray = new String [3] [4];
		nameArray[1][1] = "John";
		nameArray[2][1] = "Jordan";
		
		// FOR - EACH
		
		for (int[] a : ageArray) {
			for (int b : a) {
				System.out.println(b);
			}
		}
		
		// FOR Loop
		
		for (int i =0; i < ageArray.length; i++) {
			for  (int j=0; j < ageArray[i].length; j++) {
				System.out.print(ageArray[i][j]);
				
			}
		}
 	}
	
}
