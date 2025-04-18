package Program2;

public class ReplaceCharInGivenString {
	public static void main(String[] args) {
        String s = "tomorrow";
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'o') {
                count++;
                if (count == 1) {
                    result.append('$');
                    continue;
                }
            }
            result.append(c);
        }

        System.out.println(result);  // Output: t$morrow
    }
}


