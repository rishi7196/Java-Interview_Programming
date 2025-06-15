package TrickyProgram;

public class StringUppar {
	
	public static void main(String[] args) {
		
		String str="rishi";
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			sb.append(i==2?Character.toUpperCase(str.charAt(i)):str.charAt(i));
		}
		System.out.println(sb);
	}

}
