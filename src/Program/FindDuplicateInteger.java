package Program;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInteger {
    public static void main(String[] args) {

        int[]number = {5,6,7,3,3,7,5};
        Set<Integer> set= new HashSet<>();
        for(Integer i :number)
        {
            if(set.add(i)==false)
            {
                System.out.print(i);
            }
        }
    }
}
