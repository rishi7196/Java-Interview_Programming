package String_Program;

import java.util.HashMap;

public class CountOccuranceOfEachWords {
    public static void main(String[] args) {
    String str="i love my india in my country";
    String[]ch=str.split("\\s");
        HashMap<String,Integer> map= new HashMap<>();
        for(String c:ch)
        {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
      
        System.out.println(map);
    }
    
}