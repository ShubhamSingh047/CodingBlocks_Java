package Lecture2;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int k=1;
			while(k<=i) {
				System.out.print("   ");
				k++;
			}
			int j=i;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
	}
}
