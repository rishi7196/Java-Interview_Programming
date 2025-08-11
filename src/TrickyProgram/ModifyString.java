package TrickyProgram;

public class ModifyString {
	public static void main(String[] args) {
		
        String str = "rishi";
        String insert= "CH";
        int position =4;
        StringBuilder sb= new StringBuilder(str);
        sb.insert(position,insert);
        System.out.println(sb.toString());
		
		
	}

}
