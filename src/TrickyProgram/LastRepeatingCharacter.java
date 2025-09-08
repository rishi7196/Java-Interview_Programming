package TrickyProgram;

import java.util.HashSet;
import java.util.Set;

public class LastRepeatingCharacter {
	public static void main(String[] args) {
		
		String str="abcaebd";
		Set<Character> set= new HashSet<>();
		//traverse from end
		for(int i=str.length()-1;i>=0;i--)
		{
			
		      char ch=str.charAt(i);
			  if(!set.add(ch))
			  {
				  System.out.println("Last repeating caracter is "+ch);
				  return;
			  }
		}
		System.out.println("No repeating character found");
		
		
	}

}
