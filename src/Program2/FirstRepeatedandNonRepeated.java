package Program2;

import java.util.HashMap;
public class FirstRepeatedandNonRepeated {
    public static void main(String[] args) {
        String s = "Rishi Kumar";
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> m = new HashMap<>();
        for (Character c : ch) {
            if (m.containsKey(c))
                m.put(c, m.get(c) + 1);

            else {
                if (!c.equals(' ')) {
                    m.put(c, 1);
                }

            }

        }
        //checking the first non repeated character
        for(char c: ch)
        {
            if(m.get(c)==1)
            {
                System.out.println("First  repeated char is "+ch+ " is "+c+ " ");
                break;
            }
        }
        for(char c: ch) {
            if (m.get(c) > 1) {
                System.out.println("First non repeated char is " + ch + " is " + c + " ");
                break;
            }
        }

    }
}