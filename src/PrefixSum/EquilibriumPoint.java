package PrefixSum;

public class EquilibriumPoint {
	public static void main(String[] args) {
		int[] arr= {3,4,8,-9,20,6};
		int n=arr.length;
		int[] prefix_arr=new int[n];
		prefix_arr[0]=arr[0];
		for(int i=1; i<n; i++) {
			prefix_arr[i]=prefix_arr[i-1]+arr[i];
		}
		for(int i=0; i<n; i++) {
			if()
		}
	}
}
