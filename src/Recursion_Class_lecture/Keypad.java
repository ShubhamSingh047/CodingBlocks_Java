package Recursion_Class_lecture;

public class Keypad {
	static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	public static void main(String[] args) {
		String str="23";
		Combination(str,"");
	}
	public static void Combination(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=str.charAt(0);
		int num=ch-'0';
		String press=code[num];
		for(int i=0; i<press.length(); i++) {
			Combination(str.substring(1),ans+press.charAt(i));
		}
	}
}
