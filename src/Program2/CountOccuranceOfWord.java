package Program2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccuranceOfWord {
	public static void main(String[] args) {
		
		String str="Hey i am going to test file feature file";
		String[] word=str.split("\\s");
		Map<String,Integer>map= new HashMap<>();
		for(String c:word)
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"=== "+entry.getValue());
		}
	}

}
