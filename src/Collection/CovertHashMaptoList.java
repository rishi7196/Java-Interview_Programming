package Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CovertHashMaptoList {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        List<Map.Entry<Integer,String>> entry=new ArrayList<>(map.entrySet());
        System.out.println("Enrues list :"+entry);
        }
    }
    