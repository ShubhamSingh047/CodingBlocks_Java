package Lecture2;

import java.util.Scanner;

public class PatternInvertedPyrm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<n) {
			int space=1;
			while(space<=i) {
				System.out.print(" - ");
				space+=2;
			}
			int start=n-2-1;
			while(start>=i) {
				System.out.print(" * ");
				start-=2;
			}
			int star=n-2;
			while(star>=i) {
				System.out.print(" * ");
				star-=2;
			}
			System.out.println();
			i+=2;
		}
	}
}
