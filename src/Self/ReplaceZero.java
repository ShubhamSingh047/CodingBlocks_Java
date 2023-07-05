package Self;

import java.util.Iterator;

public class ReplaceZero {
	public static void main(String[] args) {
		int[] arr= {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n=arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i]==0) {
				for(int j=i+1; j<n; j++) {
					if(arr[j]!=0) {
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						break;
					}
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
