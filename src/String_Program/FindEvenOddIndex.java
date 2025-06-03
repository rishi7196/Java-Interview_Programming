package String_Program;

public class FindEvenOddIndex {
    public static void main(String[] args) {
        
        String str="selenium";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                System.out.println("Index is "+i+" "+str.charAt(i));
            }
        }
    }
    
}
