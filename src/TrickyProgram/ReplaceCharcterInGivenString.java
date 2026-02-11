package TrickyProgram;

public class ReplaceCharcterInGivenString {
	
	public static void main(String[] args) {
		
		String str="Rishi";
		StringBuffer sb= new StringBuffer(str);
		sb.setCharAt(3, '*');
		System.out.println(sb);
	}

}
