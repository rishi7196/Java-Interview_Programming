package Program2;

import java.util.HashMap;
import java.util.Map;

public class DemoTest {
    public static void main(String[] args) {

        String str = "selenium";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        //non repeated
        for(char c: ch) {
            if (map.get(c) == 1) {
                System.out.println("First non repeated character is " + str + " is :" + c);
                break;
            }
        }
            for(char c: ch)
            {
                if(map.get(c)>1)
                {
                    System.out.println("First  repeated character is "+str+ " is :"+c);
                    break;
                }
        }

    }
}






