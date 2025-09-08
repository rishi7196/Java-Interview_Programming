package Array_progrms;

public class FindMaxiumSubArrays {

	public static void main(String[] args) {
		//kadens alogrith n(n)

		int num[] ={8, -1, 3, 4, -2, 2, 1, -5, 4};
		int maxSum=0;
		int cursum=0;
		for (int value : num) {
			//This adds the current array element to the ongoing subarray sum.
		    cursum += value;
		    if (cursum > maxSum) {
		        maxSum = cursum;
		    }
		    //Reset cursum if it goes negative:
		    if (cursum < 0) {
		        cursum = 0;
		    }
		}
		
		System.out.println(maxSum);

	}

}
