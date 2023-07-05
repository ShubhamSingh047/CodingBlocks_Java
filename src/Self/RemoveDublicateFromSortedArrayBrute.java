package Self;

public class RemoveDublicateFromSortedArrayBrute {
	public static void main(String[] args) {
		int[] arr={1, 2, 2, 3, 4, 4, 4, 5, 5};
		int[] temp=new int [arr.length];
		temp[0]=arr[0];
		int res=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=temp[res-1]) {
				temp[res]=arr[i];
				res++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			arr[i]=temp[i];
		}
		for(int i=0; i<res; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
