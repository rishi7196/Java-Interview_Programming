package Program;

import java.util.HashSet;
import java.util.Set;

public class FindArrayOfCharacters {
    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd', 'e'};
        char[] array2 = {'c', 'd', 'e', 'f', 'g'};

        Set<Character> set = new HashSet<>();
       // Set<Character> duplicates = new HashSet<>();

        for (char c : array1) set.add(c);
        for (char c : array2) if (set.remove(c)) System.out.print(c);

        //System.out.println("Duplicate characters: " + duplicates);

    }
}