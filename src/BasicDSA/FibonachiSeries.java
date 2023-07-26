package BasicDSA;

import java.util.*;

public class FibonachiSeries {
	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2; i<=n; i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(sum);
	}
}
