package Program;

import java.util.HashSet;

public class FirstRepeatedCharString {

    public static void main(String[] args) {
        String str = "selenium";
       HashSet<Character>set= new HashSet<>();
       for(Character c:str.toCharArray())
       {
        if(!set.add(c))
        {
            System.out.println("Firts repeated character is :::"+c);
            return;
        }
       }

    }
    
}
