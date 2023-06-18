package Lecture2;

import java.util.Scanner;

public class Pattern_Assig {
//	1
//	1 1
//	1 2 1
//	1 3 3 1
//	1 4 6 4 1
//	1 5 10 10 5 1
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int num=1;
		System.out.println(1);
		while(i<=n) {
			int j=1;
			System.out.print(1);
			while(j<=num) {
				System.out.print(num-1);
				j++;
			}
			System.out.println();
			num++;
			i++;
		}
	}
}
