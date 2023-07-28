package Self_Array;

public class RemoveDublicate {
	public static void main(String[] args) {
		int[] arr= {1,2,1,1,1,3,4};
		int res=1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res++]=arr[i];
			}
		}
		for(int i=0; i<res; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
