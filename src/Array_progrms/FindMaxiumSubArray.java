package Array_progrms;

public class FindMaxiumSubArray {
    public static void main(String[] args) {
    	//kadens alogrithim
        int[] arr = {8, -1, 3, 4, -2, 2, 1, -5, 4};
        int maxSum=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {

            sum=Math.max(arr[i], sum+arr[i]);
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println("Maxium sum array is "+maxSum);
    }
}
        
       
    

