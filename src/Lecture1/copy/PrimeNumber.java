package Lecture1.copy;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int i=2;
		while(i*i<=n) {
			if(n%i==0) {
				System.out.println("Not prime");
				return;
			}
			i++;
		}
		System.out.println("Prime");
	}
}
