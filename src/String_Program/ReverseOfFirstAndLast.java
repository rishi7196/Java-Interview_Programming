package String_Program;

import java.Main;

public class ReverseOfFirstAndLast {
	public static int swapFirstLast(int n) {
        if (n < 10) return n;
        
        //count digit using log10
        int digits = (int)Math.log10(n);// math.log(n)-gives digit-1;
        int place = (int)Math.pow(10, digits);//gives the place value of the first digit
        
        //extract first and last digit
        int first = n / place;
        int last = n % 10;
        
        //rebuild the number with swapped digit
        //last*price puts the last digit in the first place
        return last * place + (n % place) / 10 * 10 + first;
    }
    
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Original: " + n);
        System.out.println("Swapped : " + swapFirstLast(n));
    }
}