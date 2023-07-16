package PrefixSum;

public class EquilbriumOptimum {
	public static void main(String[] args) {
		int []arr= {3, 4, 8, -9, 20, 6};
		int n=6;
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=arr[i];
		}
		int lsum=0;
		for(int i=0; i<n; i++) {
			if(lsum==sum-arr[i]) {
				System.out.println(true);
				return;
			}
			lsum+=arr[i];
			sum-=arr[i];
		}
		System.out.println(false);
	}
}
