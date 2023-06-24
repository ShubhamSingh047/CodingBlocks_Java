package Lecture3;

import java.util.Scanner;

public class Pattern28 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int val=1;
			while(j<=star) {
				//vertical mirroring
				if(j<=star/2) {
					System.out.print(val+"\t");
					val++;
				}else {
					System.out.print(val+"\t");
					val--;
				}
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}
}
