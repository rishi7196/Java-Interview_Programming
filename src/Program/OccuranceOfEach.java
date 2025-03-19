package Program;

import java.util.HashMap;

public class OccuranceOfEach {
    public static void main(String[] args) {
        String str = "Selenium";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : ch)
        {
            if(c!=' ')
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        System.out.println(map);
    }
}