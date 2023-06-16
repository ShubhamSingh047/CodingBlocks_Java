package Lecture2;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int k=1;
			while(k<=n) {
				if(k==i||k==n+1-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
