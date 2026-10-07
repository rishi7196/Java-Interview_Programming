package String_Program;
public class VowelAndCosnonant {
    public static void main(String[] args) {

        int vowel=0;
        int constant =0;
        String str="Rishi";
        for(char ch:str.toCharArray())
        {
            if(Character.isLetter(ch));
            if(ch=='a' ||ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u')
            vowel++;
            else
                constant++;
        }
        System.out.println("Number of vowels  ::"+vowel);
        System.out.println("Number of consonant  ::"+constant);

    }
}
