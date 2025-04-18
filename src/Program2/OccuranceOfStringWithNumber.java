package Program2;

import java.util.HashMap;

public class OccuranceOfStringWithNumber {
public static void main(String[] args) {
	
	String str="abbabbcddaa";
	HashMap<Character, Integer> map= new HashMap<>();
	for(Character c: str.toCharArray())
	{
		map.put(c, map.getOrDefault(c, 0)+1);
	}
	
	map.forEach((k,v)->System.out.print(k+""+v));
}
}
