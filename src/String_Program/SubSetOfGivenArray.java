package String_Program;
public class SubSetOfGivenArray {

    // Returns true if there is a subset in 'arr' with sum equal to 'target'
    static boolean isSubSetSum(int[] arr, int target) {
        boolean[] b = new boolean[target + 1];
        /// base zero sum is always possible with empty subset
        b[0]=true;
        for(int num:arr)
        {
            // Traverse b array backwards to avoid using the same element multiple times
            for(int sum=target;sum>=num;sum--)
            {
                if(b[sum-num])
                {
                    b[sum]=true;
                }
            }
        }
        return b[target];
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 4, 3, 9, 6 };
        int target = 44;
        boolean exists = isSubSetSum(arr, target);
        if (exists) {
            System.out.println("subset with given sum is exis");
        } else {
            System.out.println("no subset with given arr of string");
        }
    }

}
