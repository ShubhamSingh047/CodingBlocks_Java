package Self;

import java.util.Scanner;

public class RotateArrbyk {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		k%=n;
		if(k<0) {
			k+=n;
		}
		while(k>0) {
			Rotate(arr);
			k--;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void Rotate(int[] arr) {
		int temp=arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
}
