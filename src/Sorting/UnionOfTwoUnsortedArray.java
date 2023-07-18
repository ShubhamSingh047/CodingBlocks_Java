package Sorting;

import org.w3c.dom.ls.LSOutput;

public class UnionOfTwoUnsortedArray {
	public static void main(String[] args) {
		int a[]= {2,8,8,10,15,15,15};
		int b[]= {3,8,8};
		int i=0,j=0,k=0;
		
		int n=a.length,m=b.length;
		
		
		while(i<n && j<m) {
			if(i>0&&a[i]!=a[i-1]) {
				i++; 
				continue;
			}
			if(j>0&&b[j]!=b[j-1]) {
				j++;
				continue;
			}
			if(a[i]<b[j]) {
				System.out.print(a[i]+" ");
				i++;
			}else if(a[i]>b[j]){
				System.out.print(b[j]+" ");
				j++;
			}
			else {
				System.out.print(a[i]+" ");
				i++;j++;
			}
		}
		
		while(i<n) {
			if(a[i]==0 || a[i]!=a[i-1])
				System.out.print(a[i]+" ");
			i++;
		}
		
		while(j<m) {
			if(b[j]==0|| b[j]!=b[j-1])
				System.out.print(b[j]+" ");
			j++;
		}
	}
}
