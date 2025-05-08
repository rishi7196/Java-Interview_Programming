package Program2;

public class ReverseStringItsPosition {
	public static void main(String[] args) {

		String input = " this is";

		// Split input into words
		String[] words = input.split(" ");
		String result = "";

		for (String word : words) {
			// Manually reverse each word
			String reversed = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversed += word.charAt(i);
			}
			result += reversed + " ";
		}

		// Trim the final result and print
		System.out.println(result.trim());
	}
}
