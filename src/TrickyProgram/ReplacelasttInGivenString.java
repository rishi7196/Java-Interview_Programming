package TrickyProgram;

public class ReplacelasttInGivenString {
	
	public static void main(String[] args) {
		
		String str = "rishi";
		char[]ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			if(ch[i]=='i')
			{
				ch[i]='$';
				break;
			}
		}
		System.out.println(new String(ch));
		
		
	}

}
