package TrickyProgram;

public class FirstLetterUpparString {
	public static void main(String[] args) {
		
		String str=" i love india";
		str=str.trim();
		String res=str.substring(0, 1).toUpperCase()+str.substring(1);
		System.out.println(res);
	}

}
