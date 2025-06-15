package TrickyProgram;

public class PrintTwiceEachCharacter {
	
	
	static String doubleCharacter(String str)
	{
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			sb.append(ch).append(ch);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		String str="rishi";
		System.out.println(doubleCharacter(str));
		
	}

}
