package Lecture12;

import java.util.*;


public class Substring {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		subString(s1);
	}
	public static void subString(String s1) {
		for(int i=0; i<s1.length(); i++) {
			for(int j=i+1; j<=s1.length(); j++) {
				//code to print only palindromF
				if(PalindromCheck.Palindrom(s1.substring(i,j))) {
					System.out.println(s1.substring(i,j));
				}
			}
		}
	}
}
