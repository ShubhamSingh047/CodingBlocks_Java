package Self_Array;

public class Maximum_sum_subarray_optimum {
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, 1, 2, 1, 1};
		int res=0; int max_res=arr[0];
		for(int i=1; i<arr.length; i++) {
			max_res=Math.max(max_res+arr[i], arr[i]);
			res=Math.max(max_res,res);
		}
		System.out.println(res);
	}

}
