package Searching;

import java.util.Scanner;

public class KthPostiveNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		findKthPositive(arr,k);
	}
	public static int findKthPositive(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
	public static int BS_approch_k(a) 
}
