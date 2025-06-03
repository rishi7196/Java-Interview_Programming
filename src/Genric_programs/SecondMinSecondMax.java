package Genric_programs;

public class SecondMinSecondMax {
    public static void main(String[] args) {

        int[] num = {5, 2, 9, 1, 7};
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int n : num) {
            if (n < min) {
                secondMin = min;
                min = n;
            } else if (n > min && n < secondMin) {
                secondMin = n;
            }

            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n < max && n > secondMax) {
                secondMax = n;
            }
        }

        System.out.println("2nd Smallest: " + secondMin);
        System.out.println("2nd Largest: " + secondMax);
    }
}
        
    