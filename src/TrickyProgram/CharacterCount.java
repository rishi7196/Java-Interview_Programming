package TrickyProgram;

public class CharacterCount {
		    public static void main(String[] args) {
		        String input = "aabcccda";
		        StringBuilder result = new StringBuilder();
		        int i = 0;

		        while (i < input.length()) {
		            char c = input.charAt(i);
		            int count = 0;
//		            Checks if the current character equals c
//		            If yes → it's part of the same group, keep counting
//		            If no → different character found, exit loop
		            while (i < input.length() && input.charAt(i) == c)
		            {
		            	i++;
		            	count++; }
		            result.append(c).append(count);
		        }

		        System.out.println(result);
		    }
		

}


