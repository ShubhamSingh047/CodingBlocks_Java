package Lecture12;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Substring {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		for(int i=0; i<s1.length(); i++) {
			for(int j=i+1; j<=s1.length(); j++) {
			System.out.println(s1.substring(i,j));
			}
		}
	}
}
