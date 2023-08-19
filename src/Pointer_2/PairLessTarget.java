package Pointer_2;
import java.util.*;

public class PairLessTarget {
	//2824. Count Pairs Whose Sum is Less than Target
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of arr");
		int n=s.nextInt();
		int[] arr= new int[n];
		System.out.println("enter arr");
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("enter target");
		int target=s.nextInt();
		int res=countPairs(arr,target);
		System.out.println(res);
	}
	 public static int countPairs(int[] nums, int target) {
	        Arrays.sort(nums);
	        int low=0;
	        int high=nums.length-1;
	        int ans=0;
	        while(low<high){
	            int sum=nums[low]+nums[high];
	            if(sum<target){
	                ans+=high-low;
	                low++;
	            }else{
	                high--;
	            }
	        }
	        return ans;
	    }

}
