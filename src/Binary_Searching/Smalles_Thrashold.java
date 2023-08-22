package Binary_Searching;

public class Smalles_Thrashold {
	public static void main(String[] args) {
		int[] arr= {44,22,33,11,1};
		int threshold=5;
		int maxi=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			maxi=Math.max(arr[i],maxi);
		}
		int low=1;
		int high=maxi;
		while(low<=high) {
			int mid=(low+high)/2;
			int total=CheckTotal(arr,mid);
			if(total<=threshold) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println(low);
	}
	public static int CheckTotal(int[] arr, int devisor) {
		int ans=0;
		for(int i=0; i<arr.length; i++) {
			ans+=Math.ceil((double)(arr[i])/devisor);
		}
		return ans;
	}
}
