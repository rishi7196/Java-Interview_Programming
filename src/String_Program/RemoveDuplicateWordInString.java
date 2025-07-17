package String_Program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWordInString {
	public static void main(String[] args) {
		
		
		 String s = "i love india and i love india";
		 String result=Arrays.stream(s.split("\\s")).distinct().collect(Collectors.joining(" "));
		 System.out.println(result);
		 //String s = "i love india and i love india";
//		 String[] parts = s.split("\\s+");
//
//		// Using LinkedHashSet keeps the first-order of words
//		Set<String> unique = new LinkedHashSet<>(Arrays.asList(parts));
//
//		String result = String.join(" ", unique);
//		System.out.println(result);
	}

}
