package String_Program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveCommaSeperateWord {
	public static void main(String[] args) {
		
		String str=" i love india , i love";
		
		String uniquw=Arrays.stream(str.split("\\s")).map(word->word.replace(",", "")).distinct()
		.collect(Collectors.joining(" "));
		System.out.println(uniquw);
	}

}
