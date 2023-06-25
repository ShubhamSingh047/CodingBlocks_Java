package Lecture3;

import java.util.Scanner;

public class PatternPascaltraingle {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int row=0;
		int star=1;
		while(row<n) {
			int i=0;
			while(i<star) {
				System.out.print("* ");
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}
}
