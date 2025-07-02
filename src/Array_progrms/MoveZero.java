package Array_progrms;

import java.util.Arrays;

public class MoveZero
 {
    public static void main(String[] args) {
        
    	int[] arr = {0, 1, 0, 3, 12};
    	int j=0;
    	// move non zeros
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]!=0)
    		{
    			arr[j++]=arr[i];
    		}
    	}
    	///fill remiang zeros 
    	while(j<arr.length)
    	{
    		arr[j++]=0;
    	}
    	System.out.println(Arrays.toString(arr));
    }
    
}
