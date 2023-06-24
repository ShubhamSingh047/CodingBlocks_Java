package Lecture3;
import java.util.*;

public class PatternAssi2 {
	public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=0;
        int space=1;
        int star=n;
        while(row<=2*n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=0;
            int p=star;
            while(j<=star){
                System.out.print(p+" ");
                if(j<=star) {
                	p--;
                }else {
                	p++;
                }
                j++;
            }
            
            int k=1;
            while(k<=star) {
            	System.out.print(k+" ");
            	k++;
            }
            row++;
            if(row<=n){
                star--;
                space++;
            }else{
                star++;
                space--;
            }
            
            System.out.println();   
        }
    }
}
