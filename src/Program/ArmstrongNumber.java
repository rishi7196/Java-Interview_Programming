package Program;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int number =153;
        int num1=number;
        int sum = 0;
        int r;
        while(number>0)
        {
            r=number%10;
            sum = sum+(r*r*r);
            number=number/10;
        }

        if(num1==sum)
        {
            System.out.println("it is armstrong number");
        }
        else
            System.out.println("it is not armstrong number");
    }
}
