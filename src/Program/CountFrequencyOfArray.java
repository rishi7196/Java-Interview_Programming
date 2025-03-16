package Program;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfArray {

    public static void main(String[] args) {

        int[]num={10,20,30,10,30,30,20,0,5};
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i:num)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>=2)
            {
                System.out.println(entry.getKey());
            }
        }


    }
}


