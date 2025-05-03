package Program2;

import java.util.Arrays;

public class RemoveStrinArray {

    public static void main(String[] args) {
        
        String[] arr = {"apple", "banana", "apple", "orange", "banana"};
        arr=Arrays.stream(arr).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    }
    
}
