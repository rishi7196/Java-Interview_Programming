package TrickyProgram;

import java.util.HashMap;
import java.util.Map;

public class FindLastNonRepeatingCharacter {
	public static void main(String[] args) {
		String str="aabbccddeff";
		
		Map<Character, Integer> map= new HashMap<>();
		for(char c:str.toCharArray()) {
		    map.put(c, map.getOrDefault(c, 0)+1);
		}

		    for(int i=str.length()-1;i>=0;i--) {
		        if(map.get(str.charAt(i))==1) {
		            System.out.println("Last non repeating character :"+str.charAt(i));
		            return;
		        }
		    }
		
	}
}



