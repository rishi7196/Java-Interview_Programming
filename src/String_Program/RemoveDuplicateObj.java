package String_Program;

import java.util.Arrays;

public class RemoveDuplicateObj {
    public static void main(String[] args) {
        
         String[] arr = {"apple", "banana", "apple", "orange", "banana"};
        arr=Arrays.stream(arr).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
    
}
