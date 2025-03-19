package Program;

import java.util.HashSet;
import java.util.Set;

public class FindArrayOfCharacters {
    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd', 'e'};
        char[] array2 = {'c', 'd', 'e', 'f', 'g'};

        Set<Character> set1 = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : array1) set1.add(c);
        for (char c : array2) if (set1.contains(c)) duplicates.add(c);

        System.out.println("Duplicate characters: " + duplicates);

    }
}