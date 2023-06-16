package Lecture2;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1;
		int n=s.nextInt();
		while(i<=n) {
			int j=i;
			while(j<=n) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=i) {
				if(k%2!=0)
					System.out.print("*");
				else {
					System.out.print("!");
				}
				k++;
			}
			int m=1;
			while(m<=i-1) {
				if(i%2==0) {
				if(m%2!=0)
					System.out.print("*");
				else 
					System.out.print("!");
				}else {
					if(m%2!=0)
						System.out.print("!");
					else 
						System.out.print("*");
				}
				m++;
			}
			System.out.println();
			i++;
		}
	}

}
