package Lecture6;
import java.util.*;
public class Boston_Number{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        int sum=0;
        int temp=n;
        int res=0;
        while(i<=n){
            if(n%i==0 && isPrime(i)){
                int t=i;
                while(t>0){
                    sum+=t%10;
                    t/=10;
                }
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
    public static boolean isPrime(int n){
        if(n==1){
            return true;
        }
            for(int i=2; i*i<=n; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
}