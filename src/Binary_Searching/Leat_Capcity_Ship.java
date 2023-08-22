package Binary_Searching;

public class Leat_Capcity_Ship {
	public static void main(String[] args) {
		int weights[]= {3,2,2,4,1,4};
		int days=3;
		int low=0; //maximum value exist in arr otherwise max value will never be loaded
		int high=0; //summision of arr in case we want to load the ship in on single day;
		for(int i=0; i<weights.length; i++) {
			low=Math.max(low,weights[i]);
			high+=weights[i];
		}
		while(low<=high) {
			int mid=(low+high)/2;
			int day=Check_Req_Days(weights,mid);
			if(day<=days) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println(low);
	}

	public static int Check_Req_Days(int[] arr, int capcity) {
		// TODO Auto-generated method stub
		int days=1; int load=0;
		for(int i=0; i<arr.length; i++) {
			if(load+arr[i]>capcity) {
				load=arr[i];
				days++;
			}else {
				load+=arr[i];
			}
		}
		return days;
	}
}
