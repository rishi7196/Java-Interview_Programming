package TrickyProgram;

public class AddCharInMiddle {
	public static void main(String[] args) {
		
		String str="Rishi";
//		StringBuffer sb= new StringBuffer(str);
//		sb.insert(3, 'A');
//		System.out.println(sb.toString());
		int insertPosition = 4;
		char ch = 'A';
		//split and joing thestring
		String res=str.substring(0, insertPosition)+ch+str.substring(insertPosition);
		System.out.println(res);
	}

}
