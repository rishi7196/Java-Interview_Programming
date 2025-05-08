package String_Program;

import java.util.HashSet;

public class RemoveDuplicateCharacterInString {
    public static void main(String[] args) {
        String str="rishi";
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        for(char c:set)
        {
            System.out.println(c);
        }
        
    }
    
}
