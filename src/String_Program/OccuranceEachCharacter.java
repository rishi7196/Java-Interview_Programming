package String_Program;
import java.util.HashMap;

public class OccuranceEachCharacter {
    public static void main(String[] args) {
        String str="selenium";
        HashMap<Character,Integer> map= new HashMap<>();
        for(Character c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
      System.out.println(map);
        
    }
    
}
