package Lecture3;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int star=n;
		int space=2;
		int row=1;
		while(row<=2*n-1) {
			int k=1;
			while(k<space) {
				System.out.print("   ");
				k++;
			}
			int i=1;
			while(i<=star) {
				System.out.print(" * ");
				i++;
			}
			row++;
			//mirroring;
			if(row<=n) {
				space+=2;
				star--;
			}else {
				space-=2;
				star++;
			}
			System.out.println();
		}
	}

}
