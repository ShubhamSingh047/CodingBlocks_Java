package Lecture3;

import java.util.Scanner;

public class Pattern27 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(j+"\t");
				j++;
			}
			row++;
			space--;
			star+=2;
			System.out.println();
		}
	}
}
