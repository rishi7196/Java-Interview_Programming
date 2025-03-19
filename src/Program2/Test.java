package Program2;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        String str="aabbbcccc";
        char[]ch= str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c: ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);

    }
}
