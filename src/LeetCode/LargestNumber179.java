package LeetCode;
import java.util.*;

import java.util.Scanner;

public class LargestNumber179 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(largestNumber(arr));
	}
    public static String largestNumber(int[] arr) {
        int max=0;
        int curr_max=0;
        String s="";
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            while(arr[i]!=0){
                if(arr[i]>10) {
                    temp.add(arr[i]%10);
                }
                else{
                    temp.add(arr[i]);
                }
                arr[i]/=10;
            }
        }
        Collections.sort(temp);
        for(int i=temp.size()-1; i>=0; i--){
            s+=i;
        }
        return s;
    }

}
