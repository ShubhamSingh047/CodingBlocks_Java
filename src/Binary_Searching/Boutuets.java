package Binary_Searching;
import java.util.*;

public class Boutuets {
	 public static void main(String[] args) {
		 System.out.println("enter size of arr");
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter number of beuquets required (m)");
		 int m=s.nextInt();
		 
		 System.out.println("enter number of beuquets flower required in each beuque (k)");
		 int k=s.nextInt();
		 
		 System.out.println("enter array");
		 for(int i=0; i<n; i++) {
			 arr[i]=s.nextInt();
		 }
		 
		 int res=minDays(arr,m, k);
		 System.out.println(res);
	}
	 public static int minDays(int[] bloomDay, int m, int k) {
	        if(m*k>bloomDay.length)return -1;
	        int min=Integer.MAX_VALUE;
	        int max=Integer.MIN_VALUE;
	        for(int i=0; i<bloomDay.length; i++){
	            min=Math.min(bloomDay[i],min);
	            max=Math.max(bloomDay[i],max);
	        }
	        int low=min; int high=max;
	        int ans=-1;
	        while(low<=high){
	            int mid=(low+high)/2;
	            if(Check(bloomDay,mid,k,m)){
	                ans=mid;
	                high=mid-1;
	            }else{
	                low=mid+1;
	            }
	        }
	        return ans;
	    }
	    public static boolean Check(int[] arr, int mid,int k,int m){
	        int countA=0;
	        int totalB=0;
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]<=mid){
	                countA++;
	            }else{
	                totalB+=(countA/k);
	                countA=0;
	            }
	        }
	        totalB+=countA/k;
	        return totalB>=m;
	    }
}
