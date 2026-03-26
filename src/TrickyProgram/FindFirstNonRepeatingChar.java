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
		for(char c: str.toCharArray())
		{
			if(map.get(c)==1)
			{
				System.out.println("first non repeating charachter is ::"+c);
				break;
				
			}
		}
		
		
	}

}
