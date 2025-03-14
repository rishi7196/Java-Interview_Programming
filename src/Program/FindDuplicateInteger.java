package Program;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInteger {
    public static void main(String[] args) {

        int[]number = {10,10,20,4,9,5,7,4,6,5};
        Set<Integer> set= new HashSet<>();
        for(Integer i :number)
        {
            if(set.add(i)==false)
            {
                System.out.println(i);
            }
        }
    }
}
