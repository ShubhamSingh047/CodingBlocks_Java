package PrefixSum;

public class EquilibriumPoint {
	public static void main(String[] args) {
		int[] arr= {0,-1,1,6};
		int n=arr.length;
		for(int i=0; i<n; i++) {
			int lsum=0,rsum=0;
			for(int j=0; j<i; j++) {
				lsum+=arr[j];
			}
			for(int j=i+1; j<n; j++) {
				rsum+=arr[j];
			}
			if(lsum==rsum) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}
}
