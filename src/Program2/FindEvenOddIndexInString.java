package Program2;

public class FindEvenOddIndexInString {
	public static void main(String[] args) {
	String s="selenium";
	for(int i=0;i<s.length();i++)
	{
	    //if(i%2!=0) return odd
		if(i%2==0)//even
		{
			System.out.println("Index "+i+" is "+s.charAt(i));
		}
	}
	}
}
