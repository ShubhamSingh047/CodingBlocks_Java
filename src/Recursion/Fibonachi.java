package Recursion;

import java.util.Scanner;

public class Fibonachi {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=PrintSequence(n);
		System.out.println(res);
	}
	public static int PrintSequence(int n) {
		if(n==0||n==1)return 1;
		return PrintSequence(n-1)+PrintSequence(n-2);
	}
}
