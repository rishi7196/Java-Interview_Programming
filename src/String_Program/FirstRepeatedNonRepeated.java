package String_Program;
import java.util.HashMap;
public class FirstRepeatedNonRepeated {
    public static void main(String[] args) {
        String str = "Rishi Kumar";
        char[] ch = str.toUpperCase().toCharArray();
        HashMap<Character,Integer>hash= new HashMap<>();
        // Count occurrences of each character (excluding spaces)
        for (char c : ch) {
            if (c != ' ') { // Ignore spaces
                hash.put(c, hash.getOrDefault(c, 0) + 1);
            }
        }
        // Find the first non-repeated character
        for (char c : ch) {
            if (hash.get(c) == 1) {
                System.out.println("First non-repeated character in \"" + str + "\" is: " + c);
                break;
            }
        }
        // Find the first repeated character
        for (char c : ch) {
            if (hash.get(c) > 1) {
                System.out.println("First repeated character in \"" + str + "\" is: " + c);
                break;

            }
        }
    }
}
