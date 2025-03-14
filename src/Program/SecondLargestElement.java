package Program;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] number = {10, 20, 49, 8998, 87};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        //for loop
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            }
            if (number[i] < largest && number[i] > secondLargest) {
                secondLargest = number[i];
            }
        }
        System.out.println("Second Largest element "+secondLargest);


    }
}
