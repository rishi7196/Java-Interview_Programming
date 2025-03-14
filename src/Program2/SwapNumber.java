package Program2;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {

        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of A");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the value of B");

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of A after swap"+a);
        System.out.println("Value of B after swap"+b);

    }
}
