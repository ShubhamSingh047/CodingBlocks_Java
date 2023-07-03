package Lecture6;
import java.util.*;

public class AmstrongNumber {
	public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        call(n);
        System.out.println(Is_armstrong(n));
    }
//    public static void call(int n){
//    	//power
//        int pow=0;
//        int temp=n;
//        int re=n;
//        while(n!=0){
//            pow++;
//            n/=10; //typecasting
//        }
//        int res=0;
//        while(temp!=0){
//            res+=Math.pow(temp%10,pow);
//            temp/=10;
//        }
//        System.out.print(res==re);

	    public static boolean Is_armstrong(int n){
	        int d = countofdigit(n);
	        int sum = 0;
	        int p = n;
	        while(n>0){
	            int rem = n % 10;
	            sum = (int)(sum + Math.pow(rem,d));
	            n=n/10;
	        }
	        return sum==p;
	    }
	    public static int countofdigit(int n){
	        int count = 0;
	        while(n>0){			
	        n=n/10;
	        count++;
	    }
	    return count;
	    }
    }
