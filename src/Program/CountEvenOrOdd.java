package Program;

public class CountEvenOrOdd {
    public static void main(String[] args) {

        int num=123456;
        int even_count=0;
        int odd_count=0;
        int rem=0;

        while(num > 0)
        {
             rem = num % 10;
            if(rem % 2==0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("Count Even number "+even_count);
        System.out.println("Count odd number "+odd_count);
    }

}
