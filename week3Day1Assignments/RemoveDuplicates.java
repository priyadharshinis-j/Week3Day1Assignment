package week3Day1Assignments;

import java.util.Arrays;

public class RemoveDuplicates {
	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
public static void main(String[] args) 
{
	// a) Use the declared String text as input
	//String text = "We learn java basics as part of java sessions in java week1";	
	
	String text = "We learn java basics part of java sessions in java week1";
	String repText="";
	
	//* b) Initialize an integer variable as count	
	
	int count;
	
	//* c) Split the String into array and iterate over it 
	 String[] splitText = text.split(" ");
	 System.out.println("The String array after spliting---> "+Arrays.toString(splitText));
	
	
	  for(int i=0;i<splitText.length;i++) {
	   count=1;
		   	  
	  //* d) Initialize another loop to check whether the word is there in the array   
		  for(int j=i+1;j<splitText.length;j++) 
		  { 
			  //* e) if it is available the increase and count by 1. 
			  if(splitText[i].equals(splitText[j]))
			  { 
				  count++; 
				  
				  
			 
	  //* f)if the count > 1 then replace the word as ""
			  if(count>1)
			  {
	 			repText=text.replaceAll(splitText[j],"");
			  }
			  }
		  }
	  } 
	//* g) Displaying the String without duplicate words
	  System.out.println(repText);
	
}
}



