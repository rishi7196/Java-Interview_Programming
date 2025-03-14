package Program2;
import java.util.Iterator;


public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<String, Integer> hash= new java.util.HashMap<>();

        hash.put("B",101);
        hash.put("A",102);


        System.out.println(hash);
        Iterator<String>i= hash.keySet().iterator();
        while(i.hasNext())
        {
            String key=i.next();
            //System.out.println(key);
            System.out.println("Roll no.: "+key+"     name: "+hash.get(key));
        }

    }
}