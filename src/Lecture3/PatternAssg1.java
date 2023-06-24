package Lecture3;
import java.util.*;

public class PatternAssg1 {
	public static void main(String[] args) {

		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int row=1;
		        int space=n-1;
		        int star=1;
		        int spaceIn=-1;
		        int val=1;
		        while(row<=2*n-1){
		            int m=1;
		            while(m<=space){
		                System.out.print("  ");
		                m++;
		            }
		            int i=star;
		            while(i>=1){
		                System.out.print(i+" ");
		                i--;
		            }
		            int j=1;
		            while(j<=spaceIn){
		                System.out.print("  ");
		                j++;
		            }
		            int k=1;
		            if(row==1||row==n){
		                k=2;
		            }
		            while(k<=star){
		                System.out.print(" "+k);
		                k++;
		            }
		            row++;
		            if(row<=n/2+1){
		                star++;
		                space-=2;
		                spaceIn+=2;
		            }else{
		                star--;
		                space+=2;
		                spaceIn-=2;
		            }
		            System.out.println();
		        }
	}

}
