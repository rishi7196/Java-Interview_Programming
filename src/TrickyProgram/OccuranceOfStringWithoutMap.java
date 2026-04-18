package TrickyProgram;

public class OccuranceOfStringWithoutMap {
	public static void main(String[] args) {

		String s = "aabcccda";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 0;

			if (s.indexOf(ch) != i)
				continue; // skip duplicates

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ch)
					count++;
			}

			System.out.print(ch + "=" + count + " ");
		}
	}
}


