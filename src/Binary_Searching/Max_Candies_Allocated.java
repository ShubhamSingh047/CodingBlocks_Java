package Binary_Searching;

public class Max_Candies_Allocated {
//	leetcode:- https://leetcode.com/problems/maximum-candies-allocated-to-k-children/
    public int maximumCandies(int[] candies, long k) {
        long low=1;
        long high=0;
        for(int i=0; i<candies.length; i++){
            high=Math.max(candies[i],high);
        }
        int ans=0;
        while(low<=high){
            int mid=(int)(low+high)/2;
            long res=CheckPile(candies, mid);
            if(res>=k){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public long CheckPile(int[] arr, int mid){
        long pile=0;
        for(int i=0; i<arr.length; i++){
            pile+=arr[i]/mid;
        }
        return pile;
    }

}
