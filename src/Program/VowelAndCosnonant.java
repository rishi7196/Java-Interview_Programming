package Program;

import java.lang.invoke.VarHandle;

public class VowelAndCosnonant {
    public static void main(String[] args) {

        int vowel=0;
        int constant =0;
        String str="Rishi";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch));
            if(ch=='a' ||ch == 'e' || ch == 'i' || ch == 'o' ||ch == '0')
            vowel++;
            else
                constant++;
        }
        System.out.println("Number of vowels  ::"+vowel);
        System.out.println("Number of consonant  ::"+constant);

    }
}
