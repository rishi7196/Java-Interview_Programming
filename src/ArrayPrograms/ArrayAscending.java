package ArrayPrograms;

import java.util.Arrays;

public class ArrayAscending {
    public static void main(String[] args) {
        
        String str=" this is rishi";
        char[]ch=str.toCharArray();
        Arrays.sort(ch);
        String sorted= new String(ch);
        System.out.println(sorted);

    }
    
}
