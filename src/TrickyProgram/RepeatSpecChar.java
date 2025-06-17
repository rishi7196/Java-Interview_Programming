package TrickyProgram;

public class RepeatSpecChar {
	public static void main(String[] args) {

		String str = "rishi";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'h' ||ch=='s') {
				sb.append(ch).append(ch);
			}
			else 
			{
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}

}
