package Binary_Searching;

public class Minimum_Sorted_Dublicate {
	public static void main(String[] args) {
		int[] arr= {2,0,1,1,1};
		int res=findMin(arr);
		System.out.println(res);
	}
	 public static int findMin(int[] arr) {
	        int low=0;
	        int high=arr.length-1;
	        int ans=Integer.MAX_VALUE;
	        if(arr.length==1)return arr[0];
	        while(low<=high){
	            int mid=low+(high-low)/2;
	            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
	                ans=Math.min(arr[low],ans);
	                low++;
	                high--;
	                continue;
	            }
	            if(arr[mid]<=arr[high]){
	                ans=Math.min(arr[mid],ans);
	                high=mid-1;
	            }else{
	                low=mid+1;
	            }

	        }
	        return ans;
	    }

}
