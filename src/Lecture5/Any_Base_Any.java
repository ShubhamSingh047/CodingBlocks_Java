package Lecture5;

import java.io.DataOutput;
import java.util.Scanner;

public class Any_Base_Any {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum+=rem*mul;
			mul*=5;
			n/=10;
		}
		System.out.println(sum);
	}
}
