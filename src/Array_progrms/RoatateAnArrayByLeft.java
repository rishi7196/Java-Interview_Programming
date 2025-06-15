package Array_progrms;

public class RoatateAnArrayByLeft {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 0, 4, 5};
        int n = 3;
        for (int i = 0;i < n; i++) {
            int first = arr[0], j;

            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
