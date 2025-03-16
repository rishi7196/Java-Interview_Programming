package Program;

import java.util.HashSet;

public class FirstRepeatedCharString {

    static char isFirstRepeated(String str)
    {
        HashSet<Character> set= new HashSet<>();
        for(char ch:str.toCharArray())
        {
            if(ch!=' '&&set.contains(ch))
            {
                return ch;
            }
            set.add(ch);

        }
        return 0;
    }
    public static void main(String[] args) {
        String s="Rishi Kumar";
        char result=isFirstRepeated(s);
        System.out.println(result);
    }
}

