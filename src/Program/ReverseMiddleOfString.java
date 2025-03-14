package Program;

public class ReverseMiddleOfString {
    public static void main(String[] args) {

        String str = "I love India";
        String[] arr = str.split("\\s");
        for(int i=0;i<arr.length;i++)
        {
               if(arr[i].equals("love"))
               {
                   arr[i]= new StringBuffer(arr[i]).reverse().toString();
               }
        }
        System.out.println(String.join(" ",arr));


    }
}