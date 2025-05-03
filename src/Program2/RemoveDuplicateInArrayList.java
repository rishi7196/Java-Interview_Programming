package Program2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("rishi");
        list.add("mohan");
        list.add("rishi");
        list.add("mohan");

        List<String> Uniquelist=list.stream().distinct().collect(Collectors.toList());
        System.out.println("Rmoev duplicate element is list "+Uniquelist);
    }
    
}
