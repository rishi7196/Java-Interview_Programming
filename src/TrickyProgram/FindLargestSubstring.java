package TrickyProgram;

public class FindLargestSubstring {
	public static void main(String[] args) {

		String str = "abcdef", s2 = "zcdemf", result = "";
		for (int i = 0; i < str.length(); i++) { // outer loop
			for (int j = i + 1; j <= str.length(); j++) { //Ineer loop iterate j+1;
				
				//extract from the  substracting
				String sub = str.substring(i, j);
				// check two string
				if (s2.contains(sub) && sub.length() > result.length()) {
					result = sub;
				}
			}
		}
		System.out.println(result);
	}

}
