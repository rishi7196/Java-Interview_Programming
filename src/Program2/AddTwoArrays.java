package Program2;

import java.util.Arrays;

public class AddTwoArrays {
    public static void main(String[] args) {

        int[]num={1,2,3,4,5};
        int[]num1={2,3,4,5,6};

        //get the length od array
        int a1=num.length;
        int a2=num.length;
        //add the array
        int[]add= new int[a1+a2];

        System.arraycopy(num,0,add,0,a1);
        System.arraycopy(num1,0,add,a1,a2);
        System.out.println(Arrays.toString(add));

    }
}
