package TrickyProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindFirstNonRepeatingChar {
	public static void main(String[] args) {
		
		String str="abcdefebhjeavcdg";
	
		HashMap<Character, Integer> map= new HashMap<>();
		for(char c:str.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		for(int i=0;i<str.length();i++)
		{
			if(map.get(str.charAt(i))==1)
			{
				System.out.println("Last repeating charachter is ::"+str.charAt(i));
				return;
				
			}
		}
		
		
	}

}
