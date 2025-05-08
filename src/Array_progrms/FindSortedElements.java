package Array_progrms;
import java.util.ArrayList;
public class FindSortedElements {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 4, 5, 3, 1};
        ArrayList<Integer> sortedElements = getSortedElements(arr);
        System.out.print("Sorted elements: ");
        for (int num : sortedElements) {
            System.out.print(num + " ");
        }
        System.out.println();
    } static ArrayList<Integer> getSortedElements(int arr[]) {
        ArrayList<Integer> sortedList = new ArrayList<>();

        // Always add the first element as it's part of sorted order
        sortedList.add(arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i - 1] <= arr[i] && arr[i] <= arr[i + 1])
                    || (arr[i - 1] >= arr[i] && arr[i] >= arr[i + 1])) {
                sortedList.add(arr[i]);
            }
        }
        // Always add the last element as it's part of sorted order
        sortedList.add(arr[arr.length - 1]);
        return sortedList;
    }
}
