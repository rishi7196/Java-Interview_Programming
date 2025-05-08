package String_Program;

public class CountSpecialChar {
    public static void main(String[] args) {
        
        String str="abcaaaadd";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println("count of number is "+count);

    }
    
}
