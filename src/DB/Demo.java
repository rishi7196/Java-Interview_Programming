package DB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		String str="SELnium";
		StringBuffer sb= new StringBuffer();
		for(char c:str.toCharArray())
		{
			
			sb.append(Character.isUpperCase(c)
					?Character.toLowerCase(c)
							:Character.toUpperCase(c));
		}
		System.out.println(sb.toString());
		
	}
}
		
		
