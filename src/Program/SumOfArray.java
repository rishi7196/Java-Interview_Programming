package Program;


import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {

        int[]num=new int[5];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        for(int i=0;i<num.length;i++)
        {
             num[i] = sc.nextInt();
             sum=sum+num[i];
        }
        System.out.println("\n Sum of array "+sum);
    }
}
