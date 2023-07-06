package Self;

public class FrequesncySortedArray {
	public static void main(String[] args) {
		int[] arr= {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10,10,10,10};
		int n=arr.length;
		int count=1;
		for(int i=1; i<n; i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}else {
				System.out.println(arr[i-1]+" : "+count);
				count=1;
			}
		}
		System.out.println(arr[n-1]+" : "+count);
	}
	

}
