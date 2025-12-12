package TrickyProgram;

public class FindMaxiumSubArray {
	public static void main(String[] args) {
		
		int[]arr= {2,3,-8,7,-1,2,3};
		int currentsum=arr[0];
		int overallMaxSum=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			currentsum=Math.max(arr[i], currentsum+arr[i]);
			overallMaxSum=Math.max(overallMaxSum, currentsum);
		}
		System.out.println("find maxsum of given array "+overallMaxSum);
	}

}
