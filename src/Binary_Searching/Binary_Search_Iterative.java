package Binary_Searching;

public class Binary_Search_Iterative {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5};
		int low=0;
		int high=4;
		int res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if (arr[mid]==1) {
				res=mid;
				break;
			}else if(arr[mid]>1) {
				high=mid;
			}else{
				low=mid+1;	
			}
		}
		System.out.println(res+" ");
	}
}
