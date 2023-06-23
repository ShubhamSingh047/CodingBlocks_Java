package Lecture3;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int star=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			row++;
			if(row<=n)
				star++;
			else 
				star--;
			System.out.println();
		}
	}

}
