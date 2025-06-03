package Genric_programs;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        return s1.length() == s2.length() &&
                Arrays.equals(s1.toLowerCase().chars().sorted().toArray(),
                        s2.toLowerCase().chars().sorted().toArray());
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent"));
        System.out.println(isAnagram("Race", "Care"));

    }
}
