package TrickyProgram;


public class LowerUpperCase {
	public static void main(String[] args) {		
		String s="HexAwarE";
		StringBuffer sb= new StringBuffer();
		for(char c:s.toCharArray())
		{
			sb.append(Character.isUpperCase(c)
		    ? Character.toLowerCase(c)//using ternery operator
		    : Character.toUpperCase(c));
		}
		System.out.println(sb.toString());
	}
}
