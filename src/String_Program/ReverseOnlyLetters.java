package String_Program;

import java.util.*;
import java.util.stream.*;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;//
        while (left < right) {// left pointer is less than right
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
            	
            	// check if  both character is letter
                char temp = arr[left]; // store the lefe char in temp variable
                arr[left] = arr[right];// replace the left character
                arr[right] = temp;
                //move both pointer
                left++;
                right--;
                //skip non character
            } else {
                if (!Character.isLetter(arr[left])) left++;
                if (!Character.isLetter(arr[right])) right--;
            }
        }
        return new String(arr);// return modified string
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("#$R#is$%h##i"));  // "i#$h%s$i##R#"
    }
}
