package Self_Array;

public class MaximumSubOddEvenArrayOptimum {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 7, 9};
		int res=arr[0];
		int count=1;
		for(int i=1; i<arr.length; i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0&&arr[i-1]%2==0)) {
				count++;
				res=Math.max(res,count);
			}
			else {
				count=1;
			}
		}
		System.out.println(res);
	}
}
