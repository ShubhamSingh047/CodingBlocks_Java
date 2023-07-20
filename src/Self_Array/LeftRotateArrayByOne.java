package Self_Array;

public class LeftRotateArrayByOne {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int temp=arr[0];
		int n=arr.length;
		for(int i=1; i<n; i++) {
			arr[n-1]=arr[i];
		}
		arr[n-1]=temp;
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
