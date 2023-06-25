package Lecture3;

import java.util.Scanner;

public class FibnachySeries {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int n1=0;
		int n2=1;
		int sum=0;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print(n1+" ");
				i++;
				sum=n1+n2;
				n1=n2;
				n2=sum;
			}
			System.out.println();
			row++;
			star++;
		}
	}
}
