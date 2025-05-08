package Array_progrms;

import java.util.Arrays;

public class findKthElement {
    public static void main(String[] args) {
        
        int[]number={3, 2, 1, 5, 6, 4};
        int k=2;
        Arrays.sort(number);
        System.err.println(number[k-1]);
        System.out.println(number[number.length-k]);

    }
    
}
