package Program2;

import java.util.HashSet;

public class FirstRepeatedCharString {

    static char isFirstRepeated(char str[]) {

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            char ch = str[i];
            if (set.contains(ch))
                return ch;
            else {
                set.add(ch);
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        String s="Rishi Kumar";
        char[] ch=s.toCharArray();
        System.out.println(isFirstRepeated(ch));
    }
}
