package Program;
import java.util.Scanner;
public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]arr={10,20,30,30,50};
        System.out.println("Search entire element");
        int target=sc.nextInt();
       int index= searchElement(arr,target);// //searching the element
       if(index!=-1)
       {
           System.out.println("Element found "+index);
       }
       else {
           System.out.println("Element not found "+index);
       }    }
    //Crete a generic function
    public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                return i;// return index if found
            }
        }
        return -1;//return index if not found
    }
}