package Lecture2;

import java.util.Scanner;

public class Project10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int k=1;
			while(k<=i) {
				System.out.print("  ");
				k++;
			}
			int j=1;
			while(j<=n-i+1) {
				System.out.print(" *");
				j++;
			}
			int m=1;
			while(m<=n-i) {
				System.out.print(" *");
				m++;
			}
			System.out.println();
			i++;
		}
	}
}
