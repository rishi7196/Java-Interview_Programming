package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDecending {
    public static void main(String[] args) {
        
        Integer[] arr = {8, 5, 1, 9, 3};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Decending order is "+Arrays.toString(arr));
        
    }
    
}
