package String_Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveduplicateInList {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(2,4,5,3,5,6,2,3);
		
		list=list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		
	}

}
