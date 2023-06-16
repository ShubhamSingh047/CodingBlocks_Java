package Lecture2;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=5;
		while(i>=1) {
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
