package Lecture6;

import java.util.*;

public class Inverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int res=0;
		while(n!=0) {
			int mod=n%10;
			res+=i*Math.pow(10,mod-1);
			i++;
			n/=10;
		}
		System.out.println(res);
	}
}
