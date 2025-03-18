package Program;

import java.util.HashSet;

public class FirstRepeatedCharString {

    public static void main(String[] args) {

        String str = "selenium";
        System.out.println(isFirstRepeatChar(str));

    }
    static  Character isFirstRepeatChar(String str) {
        HashSet<Character> set = new HashSet<>();
        for (Character c : str.toCharArray()) {
            if (!set.add(c)) return c;
        }
        return null;
    }

}


