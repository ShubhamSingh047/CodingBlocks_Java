package Lecture3;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int space=n;
		int star=n;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			if(row<=n) {
				space--;
				star--;
			}else {
				space++;
				star++;
			}
			System.out.println();
		}
	}
}
