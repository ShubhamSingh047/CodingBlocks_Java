package Self_Array;

public class Circular_Sub_ArraySum {
	public static void main(String[] args) {
		int[] arr= {8 ,-8 ,9 ,-9 ,10 ,-11 ,12};
		int n=arr.length;
		
		int simple_SubArray=Normal_Sum_SubArray(arr, n);
		System.out.println(simple_SubArray);
		
//		imp condition
		if(simple_SubArray<0) {
			System.out.println(simple_SubArray);
			return;
		}
		
		int min_sum=0;
		for(int i=0; i<n; i++) {
			min_sum+=arr[i];
			arr[i]=-arr[i];
		}
		
		/* using min Subarray 
		int min_SumSubArray=Min_SubArray(arr,n);		
		int min_arr_sum=simple_SubArray-min_SumSubArray;
		*/
		
		int min_arr_sum=min_sum+Normal_Sum_SubArray(arr,n);
		int res=Math.max(min_arr_sum,simple_SubArray);
		System.out.println(res);
	}
	
	public static int Normal_Sum_SubArray(int[] arr, int n) {
		int res=arr[0], max_sum=arr[0];
		for(int i=1; i<n; i++) {
			max_sum=Math.max(max_sum+arr[i],arr[i]);
			res=Math.max(res,max_sum);
		}
		return res;
	}
	
	public static int Min_SubArray(int[] arr, int n) {
		int res=arr[0], min=arr[0];
		for(int i=1; i<n; i++) {
			min=Math.min(min+arr[i],arr[i]);
			res=Math.min(res,min);
		}
		return res;
	}
}
