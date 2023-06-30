package Lecture7;

public class Searching_Lenear {
	public static void main(String[] args) {
		int[] arr= {1,34,56,78,11,-7,90};
		int x=78;
		int res=Search_Arr(arr,x);
		System.out.println(res);
	}
	public static int Search_Arr(int[] arr,int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
}
