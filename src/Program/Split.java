package Program;

public class Split {
    public static void main(String[] args) {
        String str="Hi How are you";
        String[] s=str.split("\\s");
        int count=s.length;
        System.out.println(count);
    }
}
