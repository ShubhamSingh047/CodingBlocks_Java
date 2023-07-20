package Self_Array;

public class SecondLargestElmentBrute {
	public static void main(String[] args) {
		int[] arr= {5,20,12,20};
		int largest=LargestElment(arr);
		int secondL=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=largest && arr[i]>secondL) {
				secondL=arr[i];
			}
		}
		System.out.println(secondL);
	}
	public static int LargestElment(int []arr) {
		int larr=arr[0];
		for(int i=1; i<arr.length; i++) {
			larr=(arr[i]>larr)?arr[i]:larr;
		}
		return larr;
	}
}
