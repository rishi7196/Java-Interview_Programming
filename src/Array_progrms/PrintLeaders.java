package Array_progrms;

public class PrintLeaders {
	
	static void leader(int[] a) {
		
		int n=a.length;
		if(n==0)//if thre array is empty nothing to process
			return;
			int max=a[n-1];//Initialize max with the rightmost element,
			//which is always a leader because no elements exist to its right .
			System.out.println(max + " ");
			for(int i=n-2;i>=0;i--)//loop from the second last element(n-2)
			{
				if(a[i]>max)
					//Check if the current element a[i] is strictly greater than the current known maximum (max). 
					//If it is, then it is a new leader, since it surpasses all elements to its right.
				{
					max=a[i];//update max value to this leader
					  System.out.print(max + " ");
				}
			}
		
	}
	
	public static void main(String[] args) {
		 leader(new int[]{16,17,4,3,5,2}); // prints: 17 5 2
		
	}

}
