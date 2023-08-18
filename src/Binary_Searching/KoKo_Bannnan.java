package Binary_Searching;
import java.util.*;

public class KoKo_Bannnan {
	/*
	 * given an unsorted array we have to find the minimum time it will take for koko to eat all
	 * the banana in given time.
	 * for eg it can take coco 3 hours to eat all the banana where as the given time limit is 5 hours
	 */ 
	public static void main(String[] args) {
		//we need to find max banana slot
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the arr");
		int n=s.nextInt();
		System.out.println("enter time bound for koko");
		int x=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter arr elments or slots for banana "+n+" times");
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		int maxi=MaximumSlot(arr);
		int res=MinmumTime(arr,maxi,x);
		System.out.println(res);
	}

	private static int MinmumTime(int[] arr, int maxi,int k) {
		// TODO Auto-generated method stub
		int total=0;
		int ans=-1;
		for(int i=1; i<=maxi; i++) {
			total=TotalTime(arr,i);
			if(total<=k) {
				return i;
			}
		}
		return ans;
	}

	private static int TotalTime(int[] arr, int time) {
		// TODO Auto-generated method stub
		int res=0;
		for(int i=0; i<arr.length; i++) {
			res+=Math.ceil((double)(arr[i])/time);
		}
		return res;
	}

	private static int MaximumSlot(int[] arr) {
		// TODO Auto-generated method stub
		int maxi=0;
		for(int i=0; i<arr.length; i++) {
			maxi=Math.max(arr[i],maxi);
		}
		return maxi;
	}
}
