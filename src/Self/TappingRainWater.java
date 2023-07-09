package Self;

public class TappingRainWater {
	public static void main(String[] args) {
		int[] arr= {3, 0, 2, 0, 4};
		int n=arr.length;
		int res=0;
		for(int i=1; i<n-1; i++) {
			int lmax=arr[i];
			for(int j=0; j<i; j++) {
				lmax=Math.max(lmax, arr[j]);
			}
			int rmax=arr[i];
			for(int j=i+1; j<n; j++) {
				rmax=Math.max(arr[j], rmax);
			}
			res+=Math.min(lmax,rmax)-arr[i];
		}
		System.out.print(res);
	}
}
