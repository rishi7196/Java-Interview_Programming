package TrickyProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LastRepeatingCharacter {
	public static void main(String[] args) {
		
		String str="abcaebd";
//		Set<Character> set= new HashSet<>();
//		//traverse from end
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			
//		      char ch=str.charAt(i);
//			  if(!set.add(ch))
//			  {
//				  System.out.println("Last repeating caracter is "+ch);
//				  return;
//			  }
//		}
//		System.out.println("No repeating character found");
		HashMap<Character, Integer> map= new HashMap<>();
		for(char c:str.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		for(int i=str.length()-1;i>=0;i--)
		{
			if(map.get(str.charAt(i))>1)
			{
				System.out.println("Last repeating charachter is ::"+str.charAt(i));
				return;
				
			}
		}
		
		
	}

}
