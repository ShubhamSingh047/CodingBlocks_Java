package Sorting;

public class UnionOfTwoUnsortedArray {
	public static void main(String[] args) {
		int a[]= {2,8,8,10,15};
		int b[]= {3,8,8};
		int i=0,j=0,k=0;
		
		int n=a.length,m=b.length;
		
		int arr[]= new int[n+m];
		
		while(i<n && j<m) {
			if(a[i]<=b[j]) {
				arr[k]=a[i];
				i++;
				k++;
			}else {
				arr[k]=b[j];
				j++;
				k++;
			}
			
		}
		
		while(i<n) {
			arr[k]=a[i];
			i++;
			k++;
		}
		
		while(j<m) {
			arr[k]=b[j];
			j++;
			k++;
		}
		int temp=1; 
		for(int e=1; e<arr.length;e++) {
			if(arr[e]!=arr[temp-1]) {
				arr[temp]=arr[e];
				temp++;
			}
		}
		int f=0;
		while(f<temp) {
			System.out.print(arr[f]+" ");
			f++;
		}
	}
}
