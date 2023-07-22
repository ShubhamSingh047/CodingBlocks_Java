package Recursion_Class_lecture;

import java.util.ArrayList;

public class ValidParantahtis {
	public static void main(String[] args) {
		PrintParanthatis(3,0,0,"");
	}
	public static void PrintParanthatis(int n,int open,int close,String ans) {
		if(open==n && close==n) {
			System.out.println(ans+" ");
			return;
		}
		if(open<n) {
			PrintParanthatis(n,open+1,close,ans+"(");
		}
		if(close<open) {
			PrintParanthatis(n,open,close+1,ans+")");
		}
	}
	
	
}
