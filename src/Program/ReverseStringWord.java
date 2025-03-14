package Program;

public class ReverseStringWord {
    public static void main(String[] args) {

        String str="I love India";
        String result="";
        String[]ch= str.split("\\s");
        for(int i=ch.length-1;i>=0;i--)
        {
             result=result+ch[i]+ " ";
        }
        System.out.println(result);
    }
}
