package Array_progrms;

public class SumofDigitsEqualTo1Digit {
	
	public static void main(String[] args) {
		
		int num=12345;
		while(num>9)
		{
			int sum=0;
			while(num>0)
			{
				sum+=num%10;
				num/=10;
			}
			num=sum;
		}
		System.out.println("Find the sum of digit:"+num);
		
	}
}
		
	