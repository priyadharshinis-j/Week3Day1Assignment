package week3Day1Assignments;

import java.util.Arrays;

public class Anagram {
	
		
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */


	public static void main(String[] args) {
		
		// *Declare a String String text1 = "stops";
		String text1 = "stops";
		// * Declare another String String text2 = "potss";
		String text2 = "potss";
		// a) Check length of the strings are same then (Use A Condition)
		if(text1.length()==text2.length())
		{
			//b) Convert both Strings in to characters
			
			char[] text1Char = text1.toCharArray();
			char[] text2Char = text2.toCharArray();
			
			// c) Sort Both the arrays
			
			Arrays.sort(text1Char);
			Arrays.sort(text2Char);
			
			// d) Check both the arrays has same value
			
			if(Arrays.equals(text1Char, text2Char))
			{
				System.out.println(Arrays.toString(text1Char) +" and "+Arrays.toString(text2Char)  +" are anagram");
			}
			 
			else
			{
				System.out.println(Arrays.toString(text1Char) +" and "+ Arrays.toString(text2Char) +" are not anagram");
			}
			
		}
		else
		{
			System.out.println(" The length of the Strings are different so these strings are not anagram");
		}
		
	
		

	}

}
