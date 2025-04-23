package ArrayPrograms;

import java.util.HashSet;

public class FindCommonElementInArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set= new HashSet<>();
        for(Integer num:arr1)set.add(num);
        for(Integer num:arr2) if(set.remove(num))System.out.println(num);
    }
    
}
