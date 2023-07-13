package Self;

import java.util.Iterator;

public class Circular_Sum {
	public static void main(String[] args) {
		int res=0;
		int[] arr= {5, -2, 3, 4};
		int n=arr.length;
		for(int i=0; i<n; i++) {
			int curr_sum=arr[i];
			int res_sum=arr[i];
			for(int j=1; j<n; j++) {
				int idx=(i+j)%n;
				curr_sum+=arr[idx];
				res_sum=Math.max(curr_sum,res_sum);
			}
			res=Math.max(res,res_sum);
		}
		System.out.println(res);
	}
}
