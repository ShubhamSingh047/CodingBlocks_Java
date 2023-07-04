package Lecture8;

public class kadane_Algorithum {
	public static void main(String[] args) {
		int[] arr= {3,2,-7,6,-7,3};
		int res=Kadane(arr);
		System.out.println(res);
	}
	public static int Kadane(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
