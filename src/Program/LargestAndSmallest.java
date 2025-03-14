package Program;

public class LargestAndSmallest {
    public static void main(String[] args) {

        int[] number = {10, -10, 20, 40};
        int largest = number[0];
        int smallest = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
            if (number[i] < smallest) {
                smallest = number[i];

            }
        }
       System.out.println("Print the largest Elment "+largest);
        System.out.println("Print the smallest Elment "+smallest);
    }
}


