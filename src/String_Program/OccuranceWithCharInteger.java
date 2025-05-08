package String_Program;

import java.util.HashMap;

public class OccuranceWithCharInteger {
    public static void main(String[] args) {
        
        String str="abbcddef";
        char[]ch=str.toCharArray();
        HashMap<Character,Integer>map= new HashMap<>();
        for(Character c:ch)
        {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        map.forEach((k,v)->System.out.print(k+""+v));
    }
    
}
