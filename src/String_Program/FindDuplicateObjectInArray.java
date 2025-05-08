package String_Program;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateObjectInArray {
    public static void main(String[] args) {

        String[] words = {"java", "python", "java"};
        Set<String> set = new HashSet<>();
        for (String c : words) {
            if (set.add(c) == false) {

                System.out.println(c);
            }
        }
    }
}
