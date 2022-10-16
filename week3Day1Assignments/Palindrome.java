package week3Day1Assignments;

public class Palindrome 
{
	//Build a logic to find the given string is palindrome or not
     
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */
	public static void main(String[] args) 
	{

		 //* a) Declare A String value as"madam"
		
		String string = "madam"; 
		 
		 //* b) Declare another String rev value as ""
		String rev="";
		// * c) Iterate over the String in reverse order
		char ch[] =string.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			// * d) Add the char into rev
			rev=rev+ch[i];
		}
		
		// * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		if (string.equalsIgnoreCase(rev))
		{
			System.out.println("The given string "+string+" is palindrome");
		}
		 
		else
		{
			System.out.println("The given stting is not palindrome");
		}
		 //* Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		
	}

}


