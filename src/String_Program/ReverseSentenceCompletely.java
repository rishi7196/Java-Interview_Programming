package String_Program;

public class ReverseSentenceCompletely {
	public static void main(String[] args) {
		
		String str=" my name is rishi";
		// System.out.println(new StringBuilder(str).reverse());
		char[]ch=str.toCharArray();
		char[]c= new char[ch.length];
		//firts loop 
		for(int i=0;i<ch.length;i++)
		{
			c[i]=ch[ch.length-1-i];
		}
		for(char cc:c)
		{
			System.out.print(cc);
		}
		
		
	}

}
