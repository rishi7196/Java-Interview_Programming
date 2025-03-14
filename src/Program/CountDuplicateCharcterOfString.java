package Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharcterOfString {
    public static void main(String[] args) {

        String str = "Rishi Kumar";
        char[] arr = str.toUpperCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : arr) {
            if (map.containsKey(c))
                map.put(c, map.get(c)+ 1);
            else {
                map.put(c, 1);
            }
        }
        Set<Map.Entry<Character,Integer>> entry= map.entrySet();
        for(Map.Entry<Character,Integer>Entry:entry)
        {
            if(Entry.getValue()>1)
            {
                System.out.println(Entry.getKey()+ " "+Entry.getValue());
            }
        }

    }
}
