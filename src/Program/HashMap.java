package Program;

import java.util.Iterator;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<Integer,String> hash= new java.util.HashMap<>();
        hash.put(101,"Rishi");
        hash.put(102,"Rishi");
        hash.put(103,"Rishi");
        hash.put(104,"Rishi");
        System.out.println(hash);

        Iterator<Integer>it = hash.keySet().iterator();
            while(it.hasNext())
            {
               int value= it.next();
               System.out.println("Rollno "+value+ " is "+hash.get(value));
            }

        }

    }

