package Self;

import org.w3c.dom.ls.LSOutput;

public class MaximumOddEvenSubArray {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 7, 9};
		int res=0;
		int n=arr.length;
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j=i; j<n-1; j++) {
				if((arr[j]%2==0 && arr[j+1]%2!=0)||(arr[j]%2!=0 && arr[j+1]%2==0)){
					count++;
				}else {
					break;
				}
			}
			res=Math.max(count,res);
		}
		System.out.println(res);
	}
}
