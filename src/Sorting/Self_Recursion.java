package Sorting;
import java.util.*;

public class Self_Recursion {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str="pippiippip";
		Solution(str, 0, "");
	}

	private static void Solution(String str, int i, String ans) {
		// TODO Auto-generated method stub
		if(i==str.length()) {
			System.out.println(ans);
			return;
		}
		if(i<str.length()-2&&(str.charAt(i)=='p'&&str.charAt(i+1)=='i')) {
			Solution(str, i+2, ans+"3.14");
		}else {
			Solution(str, i+1, ans+str.charAt(i));
		}
	}
}
//