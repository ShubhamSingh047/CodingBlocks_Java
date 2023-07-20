package Recursion;

public class Subset {
	public static void main(String[] args) {
		Print_Subset("abcd","",0);
	}
	public static void Print_Subset(String str, String ans, int i) {
		if(i==str.length()) {
			System.out.println(ans);
			return;
		}
		Print_Subset(str, ans, i+1);
		Print_Subset(str, ans+str.charAt(i), i+1);
		
	}

}
