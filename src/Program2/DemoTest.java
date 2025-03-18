package Program2;

import java.util.HashSet;
import java.util.Set;


public class DemoTest {

    public static void main(String[] args) {
        String str = "selenium";
        System.out.println(isFirstRepeatedChar(str));
    }

    static Character isFirstRepeatedChar(String str)
    {
        Set<Character> set= new HashSet<>();
        for(Character c: str.toCharArray())
        {
            if(!set.add(c)) return c;
        }
        return null;
    }
}

