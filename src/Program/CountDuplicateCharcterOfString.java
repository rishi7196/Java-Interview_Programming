package Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharcterOfString {
    public static void main(String[] args) {

        String str = "Rishi Kumar";
        char[] arr = str.toUpperCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c: arr)
        {
            if(c!=' ')
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer>entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+ " "+entry.getValue());
            }
        }



    }
}