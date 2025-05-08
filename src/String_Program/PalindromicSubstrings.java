package String_Program;

public class PalindromicSubstrings {
	public static void main(String[] args) {
        String str = "abba";
        int total = countPalindromicSubstrings(str);
        System.out.println("Total palindromic substrings: " + total);
    }
    static int countPalindromicSubstrings(String s) {
        int count = 0;
        int n = s.length();
        // Check for all possible centers
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            // Expand around the center
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}




