package TrickyProgram;

public class FirstLetterUpparString {
	public static void main(String[] args) {
		
		String str=" i love india";
		str=str.trim();
		String[]ch=str.split("\\s");
		for(String c:ch)
		{
			String res=c.substring(0, 1).toUpperCase()+c.substring(1);
			System.out.print(res+" ");
		}
		
	}

}
