package Array_progrms;

import java.util.ArrayList;

public class FindEvenOddNumber {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,67,8,9};
        ArrayList<Integer> even= new ArrayList<>();
        ArrayList<Integer> odd= new ArrayList<>();
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                even.add(num[i]);
            }
            else
            {
                odd.add(num[i]);
            }
        }
        System.out.println("Even number is "+even);
        System.out.println("Odd number is "+odd);
    }
    
}
