package TrickyProgram;

public class PrintTwiceEachCharacter {
	public static void main(String[] args) {
		String str = "rishi";

		StringBuffer sb = new StringBuffer();
		for (char c : str.toCharArray()) {
			sb.append(c).append(c);
		}
		System.out.println(sb.toString());

	}

}
