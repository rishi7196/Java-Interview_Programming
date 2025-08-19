package TrickyProgram;

public class Masking {
	public static void main(String[] args) {
		
		  String str = "1234567890987654";
		 System.out.println(str.length()<=4 ? str : 
			 "X".repeat(str.length()-4)+str.substring(str.length()-4));
		  
	}

}
