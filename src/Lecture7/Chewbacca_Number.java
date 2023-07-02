package Lecture7;

import java.util.Scanner;

public class Chewbacca_Number {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	long n=s.nextLong();
	long ans=0;
	long mul=1;
	while(n>9) {
		int rem =(int)(n%10);
		if(rem>=5)
			rem=9-rem;
		ans+=rem*mul;
		mul*=10;
		n/=10;
	}
	if(n==9||n<5) {
		ans+=n*mul;
	}else {
		ans+=(9-n)*mul;
	}
	System.out.println(ans);
	}
}
