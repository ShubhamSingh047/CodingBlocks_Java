package Lecture3;

import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=1;
		int n=s.nextInt();
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("1 ");
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
