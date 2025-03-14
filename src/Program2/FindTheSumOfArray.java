package Program2;

import java.util.Scanner;

public class FindTheSumOfArray {
    public static void main(String[] args) {

        int[]number= new int[5];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
       for(int i=0;i<number.length;i++)
       {
           number[i]=sc.nextInt();
           sum=number[i]+sum;
       }
       System.out.println("\n Array of elements"+sum);


    }
}
