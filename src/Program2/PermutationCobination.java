package Program2;

public class PermutationCobination {
	static void permute(String prefix,String str)
    {
        if(str.isEmpty()) System.out.println(prefix);
        else
            for(int i=0;i<str.length();i++)
            {
                permute(prefix+str.charAt(i),str.substring(0,i)
                        +str.substring(i+1));

            }
    }
    public static void main(String[] args) {
        permute("","abc");

    }
}


