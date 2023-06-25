package Lecture3;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int res=0;
		while(n!=0) {
			res+=n%10;
			res*=10;
			n/=10;
		}
		
		res/=10;
		System.out.println(res);
	}

}
