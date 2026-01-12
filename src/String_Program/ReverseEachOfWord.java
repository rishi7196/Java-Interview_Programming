package String_Program;

public class ReverseEachOfWord {
	public static void main(String[] args) {
		
		String str= "my name is rishi";
		String[]ch=str.split("\\s");
		StringBuilder sb= new StringBuilder();
		
		for(String word:ch)
		{
			char[]chars=word.toCharArray();
			for(int i=chars.length-1;i>=0;i--)
			{
				sb.append(chars[i]);
			}
			sb.append(" ");
		}
		System.out.println(sb);
		
	}

}
