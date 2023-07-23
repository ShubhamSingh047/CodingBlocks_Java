package Recursion;

public class Permution {
	public static void main(String[] args) {
		String str="ABC";
		PermutionSup(str,"");
	}

	private static void PermutionSup(String str, String ans) {
		// TODO Auto-generated method stub
		if(0==str.length()) 
		{
			System.out.println(ans);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			String forRec=str.substring(0,i)+str.substring(i+1);
			PermutionSup(forRec,ans+ch);
		}
	}
	
}
