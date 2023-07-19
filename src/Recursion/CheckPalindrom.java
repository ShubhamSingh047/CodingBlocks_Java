package Recursion;

import java.util.Scanner;

public class CheckPalindrom {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(IsPalindrom(str,0,str.length()-1));
	}
	public static boolean IsPalindrom(String str, int start, int end) {
		
		if(start>=end) {
			return true;
		}
		boolean res=(str.charAt(start)==str.charAt(end));
		return res&&IsPalindrom(str,start+1,end-1);
	}

}
