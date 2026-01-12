package Array_progrms;

public class SumofDigitsEqualTo1Digit {
	
	public static void main(String[] args) {
		
		int num=12345;
		while(num>9)// check weather num has more the 1 digit
		{
			int sum=0;
			while(num>0)//inner loop 
			{
				sum+=num%10;// this will return last digit of num and add to the sum
				num/=10; // removes the last digit from num 12345/10=1234
			}
			num=sum;
		}
		System.out.println("Find the sum of digit:"+num);
		
	}
}
		
	