package Array_progrms;

public class FindUnsortedElements {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 4, 5, 3, 1};
        findUnsortedElements(arr);
    }

    static void findUnsortedElements(int arr[]) {
        System.out.print("Unsorted elements: ");
        //Iterate through the array, skipping the first and last elements.
        for (int i = 1; i < arr.length - 1; i++) {
// Check if each element follows either an increasing
            if (!((arr[i - 1] <= arr[i] && arr[i] <= arr[i + 1])
                    || (arr[i - 1] >= arr[i] && arr[i] >= arr[i + 1]))) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
