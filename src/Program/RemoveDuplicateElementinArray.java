package Program;

import java.util.Arrays;

public class RemoveDuplicateElementinArray {
    public static void main(String[] args) {

        int[]number = {5,6,7,3,3,7,5};
         int[] arr=Arrays.stream(number).distinct().toArray();
         System.out.println("Remove duplicate "+Arrays.toString(arr));
    }
}
