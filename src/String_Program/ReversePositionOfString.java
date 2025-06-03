package String_Program;
public class ReversePositionOfString {
            public static void main(String[] args)
    {
       
        String str=" Hi shubham singh";
        String[]ch=str.split("\\s");
        String result="";
        for(String word:ch)
        {
            String reverse="";
            for(int i=word.length()-1;i>=0;i--)
            {
                reverse+=word.charAt(i);
            }
            result +=reverse+" ";
        }
        System.out.println(result.trim());

    }
}
