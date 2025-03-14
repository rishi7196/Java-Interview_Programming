package Program2;

public class CountEvenOdd {

    public static void main(String[] args) {

        int num=12345;
        int even_count=0;
        int odd_count=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                even_count++;
            }
            else {
                odd_count++;
            }
            num=num/10;//eleminate the last digit number
        }
        System.out.println("Count the number of even "+even_count);
        System.out.println("Count the number of odd "+odd_count);
    }
}
