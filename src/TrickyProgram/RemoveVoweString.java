package TrickyProgram;

public class RemoveVoweString {
	public static void main(String[] args) {
		
		String str="Hello Shubham";
		String s=str.replaceAll("(?i)[aeiou]", "");
		System.out.println(s.trim());
	}

}
