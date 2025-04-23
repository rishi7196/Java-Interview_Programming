package Program;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveCharacterInString {

    public static void main(String[] args) {
        String str="java";

        Set<Character> set= new LinkedHashSet<>();
        for(int i=0;i<str.length();i++) {
            set.add(str.charAt(i));
        }

        for(Character c:set)
        {
            System.out.print(c);
        }
    }
}
