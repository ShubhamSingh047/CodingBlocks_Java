package Lecture3;

import java.util.Scanner;

public class PatternInvertedGlass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int row=1;
        int star=0;
        int star2=n;
        int space=n+1;
        while(row<=2*n+1){
            int i=0;
            int val=n;
            while(i<=star){
                System.out.print(val+" ");
                if(i<=n) {
                	val--;
                }else {
                	val++;
                }
                i++;
            }
            int j=1;
            while(j<space-1){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<space) {
            	System.out.print("  ");
                k++;
            }
            int l=star2;
            while(l<=n){
            	if(l==0) {
            		
            	}else {
            		System.out.print(l+" ");
            	}
                l++;
            }
            row++;
            System.out.println();
            if(row<=n+1){
                star++;
                space--;
                star2--;
            }else{
                star--;
                space++;
                star2++;
            }
        }
	}
}
