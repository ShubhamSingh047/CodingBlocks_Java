package Sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr= {5,4,1,2,3,6};
		int n=arr.length-1;
		Sorting(arr,0,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void Sorting(int[] arr, int s, int e) {
		if(s>=e)return;
		int mid=(s+e)/2;
		Sorting(arr, s, mid);
		Sorting(arr, mid+1, e);
		Merge(arr,s,mid,e);
	}
	public static void Merge(int[] arr,int s,int mid, int e) {
		System.out.println(s+" "+e);
		int temp[]=new int[e-s+1];
		int left=s,right=mid+1,k=0;
		while(left<=mid && right<=e) {
			if(arr[left]<arr[right]) {
				temp[k++]=arr[left++];
			}else if(arr[right]<arr[left]) {
				temp[k++]=arr[right++];
			}
			else {
				temp[k++]=arr[left++];
				right++;
			}
		}
		while(left<=mid) {
			temp[k++]=arr[left++];
		}
		while(right<=e) {
			temp[k++]=arr[right++];
		}
		//we are taking equal to e as e=n-1 which has been passed from main method;
		for (int i = s; i < temp.length; i++) {
	           arr[i] = temp[i-s];
	    }
	}
}
