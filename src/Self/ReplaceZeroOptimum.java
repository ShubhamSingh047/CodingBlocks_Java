package Self;

public class ReplaceZeroOptimum {
	public static void main(String[] args) {
		int[] arr= {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n=arr.length;
		int count=0;
		for(int i=0; i<n; i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
