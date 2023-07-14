package Assigment3;
import java.util.*;

public class RainWaterTrapping {
	public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
				        int t=s.nextInt();
		                for(int j=1; j<=t; j++){
		                    int n=s.nextInt();
		                    int arr[]=new int[n];
//		                    int l_arr[]=new int[n];
//		                    int r_arr[]=new int[n];
		                    for(int i=0; i<n; i++){
				                arr[i]=s.nextInt();
				            }
//		                    l_arr[0]=arr[0];
//		                    for(int i=1; i<n; i++){
//		                        l_arr[i]=Math.max(arr[i],arr[i-1]);
//		                    }
//		                    r_arr[n-1]=arr[n-1];
//		                    for(int i=n-2; i>=0; i--){
//		                        r_arr[j]=Math.max(arr[i],arr[i-1]);
//		                    }
//		                    int res=0;
//		                    for(int i=0; i<n; i++){
//		                        res+=Math.min(l_arr[i],r_arr[i])-arr[i];
//		                    }
//		                    System.out.println(res);
		            }
	}
}
