package TrickyProgram;


public class LowerUpperCase {
    public static String swapCase(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            sb.append(Character.isUpperCase(c)
                      ? Character.toLowerCase(c)
                      : Character.toUpperCase(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "HexAwarE";
        System.out.println(swapCase(input));  // → hEXaWARe
    }
}
