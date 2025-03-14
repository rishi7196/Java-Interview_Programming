package Program2;

import java.util.HashSet;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[]number = {10,0,5,80,60,5};
        HashSet<Integer> hash= new HashSet<>();
        for(Integer i:number)
        {
            if(hash.add(i)==false)
            {
                System.out.println(i);
            }
        }
    }
}
