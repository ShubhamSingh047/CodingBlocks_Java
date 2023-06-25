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
		while(row<=n) {
				sum=n1+n2;
				n1=n2;
				n2=sum;
				row++;
		}
		System.out.println(n1);
	}
}
