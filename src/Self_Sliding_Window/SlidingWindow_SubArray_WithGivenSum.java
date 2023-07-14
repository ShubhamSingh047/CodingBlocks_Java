package Self_Sliding_Window;

public class SlidingWindow_SubArray_WithGivenSum {
	public static void main(String[] args) {
		int curr=0;
		int[] arr= {1, 8, 30, -5, 20, 7};
		int k=3;
		int n=arr.length;
		for(int i=0;i<k; i++) {
			curr+=arr[i];
		}
		int num=45;
		for(int i=k; i<n; i++) {
			curr+=(arr[i]-arr[i-k]);
			if(curr==num) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}
}
