package Program;
import java.util.HashMap;
import java.util.Map;
public class CountVowel {
    public static void main(String[] args) {
        String str="selenium";
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        for (char ch : str.toCharArray()) {
           if(map.containsKey(ch))
               map.put(ch,map.get(ch)+1);

        }
        for(Map.Entry<Character,Integer>entry : map.entrySet())
        {
            if(entry.getValue()>0)
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
