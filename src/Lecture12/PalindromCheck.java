package Lecture12;

import java.util.Scanner;

public class PalindromCheck {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		
		int i=0, j=s1.length()-1;
		while(i<=j) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				System.out.println(false);
				return;
			}
			i++;
			j--;
		}
		System.out.println(true);
	}
}
