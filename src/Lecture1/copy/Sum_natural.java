package Lecture1.copy;

import java.util.Scanner;

public class Sum_natural {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int i=0;
		int sum=0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
