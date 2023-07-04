package Lecture8;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int temp=0;
			for(int j=i; j<arr.length; j++) {
				temp+=arr[j];
				sum=Math.max(temp, sum);
			}
		}
		System.out.println(sum);
	}
}
