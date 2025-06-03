package Array_progrms;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] number = {1, 3, 5, 7, 9, 10};
        
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}