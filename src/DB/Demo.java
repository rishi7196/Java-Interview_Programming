package DB;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		String str=" i love indian country i love";
		String unique=Arrays.stream(str.split("\\s")).distinct().collect(Collectors.joining(" "));
		System.out.println(unique);
		
	

	}
}