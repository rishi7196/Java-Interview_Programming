package String_Program;

public class ReverseWordsAsOdd {
    public static void main(String[] args) {

        String str = "Hi love India my Love";
        String[] ch = str.split("\\s");
        for (int i = 0; i < ch.length; i++) {

            if (i % 2 != 0){
                ch[i] = new StringBuilder(ch[i]).reverse().toString();
            }
        }
        System.out.println(String.join(" ", ch));
    }
}


