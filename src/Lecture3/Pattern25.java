package Lecture3;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int star=1;
		int sum=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(sum+"\t");
				sum++;
				j++;
			}
			star+=2;
			
			space--;
			row++;
			System.out.println();
		}
	}
}
