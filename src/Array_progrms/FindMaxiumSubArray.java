package Array_progrms;

public class FindMaxiumSubArray {
    public static void main(String[] args) {
        int[] arr = {8, -1, 3, 4, -2, 2, 1, -5, 4};
        int maxSum=arr[0];
        int maxEnd=arr[0];
        for(int i=1;i<arr.length;i++)
        {

            maxEnd=Math.max(arr[i], maxEnd+arr[i]);
            maxSum=Math.max(maxSum,maxEnd);
        }
        System.out.println("Maxium sum array is "+maxSum);
    }
}
        
       
    

