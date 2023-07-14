package Lecture12;

import java.util.Scanner;

public class PalindromCheck {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.println(Palindrom(s1));
		
	}
	public static boolean Palindrom(String s1) {
		int i=0, j=s1.length()-1;
		while(i<=j) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
