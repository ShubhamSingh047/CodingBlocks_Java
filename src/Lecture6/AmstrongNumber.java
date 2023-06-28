package Lecture6;
import java.util.*;

public class AmstrongNumber {
	public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        call(n);
    }
    public static void call(int n){
    	//power
        int pow=0;
        int temp=n;
        int re=n;
        while(n!=0){
            pow++;
            n/=10; //typecasting
        }
        int res=0;
        while(temp!=0){
            res+=Math.pow(temp%10,pow);
            temp/=10;
        }
        System.out.print(res==re);
    }
}
