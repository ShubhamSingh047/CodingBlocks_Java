package Lecture2;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int k=i;
			while(k<=n) {
				System.out.print("  ");
				k++;
			}
			int j=1;
			while(j<=i) {
				System.out.print(" *");
				j++;
			}
			int m=1;
			while(m<i) {
				System.out.print(" *");
				m++;
			}
			System.out.println();
			i++;
		}
	}
}
