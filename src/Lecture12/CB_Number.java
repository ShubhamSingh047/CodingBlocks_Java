package Lecture12;

import java.util.Scanner;

public class CB_Number {
	public static void main(String[] args) {
		
		int[] arr= {2,3,5,7,11,13,17,19,23,29};
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		
		int n=arr.length;
		
		System.out.println(LengthSubstring(s1));
	}
	public static int LengthSubstring(String s) {
		int count=0;
		int[] boolean=new int[];
		int n=s.length();
		for(int i=0; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				int len=j-i;
				if(CheckNumb(Long.parseLong(s.substring(len, j)))&&isvisited(visited,i,j-1)){
					count++;
				};
			}
		}
		return count;
		
	}
	
	public static boolean CheckNumb(long n) {
		if(n==1||n==0) {
			return false;
		}
		int[] arr= {2,3,5,7,11,13,17,19,23,29};
		
		for(int i=0; i<n; i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(n%arr[i]==0) {
				return false;
			}
		}
		
		return true;
	}
}
