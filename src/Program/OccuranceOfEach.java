package Program;

import java.util.HashMap;

public class OccuranceOfEach {
    public static void main(String[] args) {

        String str = "Selenium";

        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : ch) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);

            else
            {
                map.put(c,1);
            }

        }
        System.out.println(map);
    }
}