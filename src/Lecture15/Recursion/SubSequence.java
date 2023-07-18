package Lecture15.Recursion;

public class SubSequence {
	public static void main(String[] args) {
		String ques="abc";
		PrintSubsequence(ques,"");
	}
	public static void PrintSubsequence(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		PrintSubsequence(ques.substring(1), ans);
		PrintSubsequence(ques.substring(1), ans+ch);
		
	}
}
