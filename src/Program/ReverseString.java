package Program;

public class ReverseString {
    public static void main(String[] args) {

        String s="Rishi Kumar";
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            temp= ch+temp;
        }
        System.out.println(temp);
    }
}
