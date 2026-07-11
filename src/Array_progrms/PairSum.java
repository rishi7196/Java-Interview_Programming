package Array_progrms;

public class PairSum {

	public static void main(String[] args) {
		
		int[]arr= {2,4,3,5,7,8,9};		
		int target=10;
		
		//// Outer loop picks the first element of the pair
		for(int i=0;i<arr.length;i++)
		{
			//This avoids comparing an element with itself
			for(int j=i+1;j<arr.length;j++)
			{
	// Check whether the sum of the current pair equals the target
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
			
		}
	}
}
