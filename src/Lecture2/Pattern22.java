package Lecture2;

import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int star=n;
		int space=-1;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			int m=1;
			while(m<=space){
				System.out.print("  ");
				m++;
			}
			int k=1;
			if(row==1) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			space+=2;
			star--;
			row++;
		}
		
	}
}
