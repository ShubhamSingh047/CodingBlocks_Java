package Lecture6;
import java.util.*;

public class Boston_Number {
	public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int i=2;
		        int sum=0;
		        int temp=n;
		        int res=0;
		        while(i<=n){
		            if(n%i==0){
		                sum+=i%10;
		                n/=i;
		            }
		            else{
		                i++;
		            }
		        }
		        while(temp>0){
		            res+=temp%10;
		            temp/=10;
		        }
		        String ans="";
		        ans=(res==sum)?"1":"0";
		        System.out.print(ans);
		    }
	}

