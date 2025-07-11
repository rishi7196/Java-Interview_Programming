package TrickyProgram;

public class StringPalindrome {
	
	static boolean isPalindrome(String s) {
	    int n = s.length();
	    for (int i = 0; i < n/2; i++)
	    	///Compares the character at position i with its counterpart from the end (n - 1 - i).
	    	//If they differ, it's not a palindrome → immediately return false.
	        if (s.charAt(i) != s.charAt(n - 1 - i))
	            return false;
	    return true;
	}
	
	public static void main(String[] args) {
		
		 String input = "RaceCar";
		 String str=input.toLowerCase();
		 System.out.println(str + (isPalindrome(str) ? " is " : " is not ") + "a palindrome");
	}

}
