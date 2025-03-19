package Program2;

public class StringTrasnform1 {
    public static void main(String[] args) {

        String input= "12ANCD23#$%%";
        String output = input.replaceAll("[^A-Za-z]", "")
               // + input.replaceAll("[^0-9]", "")
                .replaceFirst("(\\d+).*", "$1");
        System.out.println(output);
    }
}
