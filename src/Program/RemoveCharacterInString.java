package Program;

import java.util.HashSet;
import java.util.Set;

public class RemoveCharacterInString {

    public static void main(String[] args) {
        String str="Rishi";

        Set<Character> set= new HashSet<>();
        for(int i=0;i<str.length();i++) {
            set.add(str.charAt(i));
        }

        for(Character c:set)
        {
            System.out.print(c);
        }
    }
}
