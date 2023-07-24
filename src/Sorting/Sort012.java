package Sorting;

public class Sort012 {
	public static void main(String[] args) {
		int arr[]= {0, 1, 2, 0, 1, 2};
		DutchAlgo(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}

	public static void DutchAlgo(int[] arr) {
		// TODO Auto-generated method stub
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0)
				Swap(arr,low++,mid++);
			else if(arr[mid]==2)
				Swap(arr, mid++,high--);
			else 
				mid++;
		}
	}

	public static void Swap(int[] arr, int low, int mid) {
		// TODO Auto-generated method stub
		int temp=arr[low];
		arr[low]=arr[mid];
		arr[mid]=temp;
	}
	

}
