package Lecture2;

import java.util.Scanner;

public class Proble21myapproch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(" * ");
				j++;
			}
			int m=1;
			while(m<=n-i) {
				System.out.print("  ");
				m++;
			}
			int x=1;
			while(x<=n-i) {
				System.out.print("    ");
				x++;
			}
			int k=1;
			while(k<=i) {
				System.out.print(" * ");
				k++;
			}
			System.out.println();
			i++;	
		}
	}
}
