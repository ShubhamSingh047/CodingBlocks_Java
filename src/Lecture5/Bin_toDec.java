package Lecture5;

import java.util.Scanner;

public class Bin_toDec {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum+=rem*mul;
			mul*=2;
			n/=10;
		}
		System.out.println(sum);
	}
}
