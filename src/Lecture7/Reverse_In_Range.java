package Lecture7;

public class Reverse_In_Range {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,11,7,89,80,-90,11};
		Reverse(arr,2,6);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Reverse(int[] arr, int i, int j) {
		int a=i;
		int b=j;
		while(a<=b) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			a++;
			b--;
		}
	}
}
