package TrickyProgram;

public class LongestString {
	
	public static void main(String[] args) {	
	String str = "Java programming language is powerful";
    String[] words = str.split("\\s");
    
    String longest="";
    for(String word:words)
    {
    	
    	if(word.length()>longest.length())
    	{
    		longest=word;
    		
    	}
    	
    }
    System.out.println(longest);
    }

    

}
