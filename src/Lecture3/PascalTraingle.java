package Lecture3;

import java.util.Scanner;

public class PascalTraingle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=0;
		int star=1;
		while(row<n) {
			int i=0;
			int ncr=1;
			while(i<star) {
				System.out.print(ncr+" ");
				ncr=((row-i)*ncr)/(i+1);
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}
}
