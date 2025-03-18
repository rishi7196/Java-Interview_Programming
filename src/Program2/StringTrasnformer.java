package Program2;

public class StringTrasnformer {

    public static void main(String[] args) {


            String input = "AB12CD23";
            String output = input.replaceAll("[0-9]", "")+
                            input.replaceAll("[^0-9]","");
            System.out.println(output); // Output: ABCD1223
        }
    }


