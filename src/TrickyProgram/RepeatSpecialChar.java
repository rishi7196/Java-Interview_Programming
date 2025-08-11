package TrickyProgram;

public class RepeatSpecialChar {
	
	public static void main(String[] args) {
		
		String str="rishi";
		StringBuffer sb= new StringBuffer();
		for(char c:str.toCharArray())
		{
			if (c == 's' || c == 'S') {
			    sb.append(c).append(c);
			} else {
			    sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
		
	}

}
