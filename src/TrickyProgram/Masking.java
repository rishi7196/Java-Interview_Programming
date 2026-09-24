package TrickyProgram;

public class Masking {
	public static void main(String[] args) {
		
		String str="1234567898765432";
		StringBuffer sb= new StringBuffer(str);
		for(int i=0;i<sb.length()-4;i++)
		{
			sb.setCharAt(i, '*');
			
		}
		System.out.println(sb);
		
		 
		  
	}

}
