package TrickyProgram;

import java.util.HashMap;

public class LongestString {
	
	public static void main(String[] args) {	
		
		String str="i love you";
		String[]ch=str.split("\\s");
		String longest="";
		for(String c:ch)
		{
			if(c.length()>longest.length())
			{
				longest=c;
			}
			
		}
		System.out.println(longest);
		
	
		
	}

    

}
