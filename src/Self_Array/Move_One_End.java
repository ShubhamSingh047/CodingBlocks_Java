package Self_Array;
import java.util.*;

public class Move_One_End {
	public static void main(String[] args) {
//		        Scanner s=new Scanner(System.in);
//		        int n=s.nextInt();
//		        int[] arr=new int[n];
//		        for(int i=0; i<n; i++){
//		            arr[i]=s.nextInt();
//		        }
				int[] arr= {1, 0, 0, 1, 1, 0, 1};
				int n=arr.length;
		        int res=0;
		        for(int i=0; i<n; i++){
		            if(arr[i]!=1){
		                int temp=arr[i];
		                arr[i]=arr[res];
		                arr[res]=temp;
		                res++;
		            }
		        }
		        for(int i:arr){
		            System.out.print(i+" ");
		        }
	}
}
