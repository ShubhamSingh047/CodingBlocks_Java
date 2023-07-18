package Lecture15.Recursion;

public class Board_Path {
	public static void main(String[] args) {
		int n=4;
		PrintPath(0,n,"");
	}
	public static void PrintPath(int Curr, int end, String ans) {
		if(Curr==end) {
			System.out.println(ans+" ");
			return;
		}
		if(Curr>end) {
			return;
		}
		PrintPath(Curr+1, end, ans+1);
		PrintPath(Curr+2, end, ans+2);
		PrintPath(Curr+3, end, ans+3);
	}
}
