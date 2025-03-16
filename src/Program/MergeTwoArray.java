package Program;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[]num1={1,2,3,4,5};
        int[]num2={2,3,4,6,8};
        //get the length
        int a1=num1.length;
        int a2=num2.length;
        //add the array
        int[]add= new int[a1+a2];

        System.arraycopy(num1,0,add,0,a1);
        System.arraycopy(num2,0,add,a1,a2);
        //Arrays.stream(add).sorted();
        System.out.println(Arrays.toString(add));


    }
}
