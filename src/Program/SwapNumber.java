package Program;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the value of b");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap the number of A "+a);
        System.out.println("After Swap the number of B "+b);
    }
}
