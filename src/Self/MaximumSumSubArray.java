package Self;

public class MaximumSumSubArray {
	public static void main(String[] args) {
		int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
		int res=0;
		int n=arr.length;
		for(int i=0; i<n; i++) {
			int count=0;
			for(int j=i; j<n; j++) {
				count+=arr[j];
				res=Math.max(count,res);
			}
		}
		System.out.println(res);
	}
}
