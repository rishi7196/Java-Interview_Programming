package Program;

public class PallindromeNumber {
    static void isPallindromeNumber(int num) {
        int r = 0;
        int sum = 0;
        int t;
        t = num;
        while (num > 0) {
            r = num % 10;//get the raminder
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (t == sum) {
            System.out.println("Is pallindromer number");

        } else {
            System.out.println("Is pallindromer number");

        }

    }
    public static void main(String[] args) {

        isPallindromeNumber(121);

    }
}
