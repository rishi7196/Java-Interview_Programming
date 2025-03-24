package Program;
import java.util.Arrays;

public class IntegerArrayRightToLeft {

    public static void shiftEvenOdd(int[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; ) {
            //If left is odd and right is even, we swap them.
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            } else {
                if (arr[left] % 2 == 0) left++;
                if (arr[right] % 2 != 0) right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 8, 2, 7, 4, 11};
        shiftEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
