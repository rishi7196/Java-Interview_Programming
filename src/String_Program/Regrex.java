package String_Program;

public class Regrex {
    public static void main(String[] args) {
        String input= "12ANCD23#$%%";
        String output = input.replaceAll("[^A-Z]", "")
              //  + input.replaceAll("[^0-9]", "");
                .replaceFirst("(\\d+).*", "$1");
        System.out.println(output);
    }
    
}
