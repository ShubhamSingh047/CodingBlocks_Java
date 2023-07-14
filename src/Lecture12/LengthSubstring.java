package Lecture12;

import java.util.Scanner;

public class LengthSubstring {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		PrintSubstring(s1);
		
	}
	//printing in sequence;
	public static void PrintSubstring(String S) {
		for(int i=1; i<=S.length(); i++) {
			for(int j=i; j<=S.length(); j++) {
				int len=j-i;
				System.out.println(S.substring(len,j));
			}
		}
	}

}
