package Self_Array;
import java.util.*;

public class NextGreaterElment {
public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int j=0; j<t; j++){
            int n=s.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++) {
            	arr[i]=s.nextInt();
            }
            NextElment(arr, n);
            for(int i:arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
		
		
	}
	public static void NextElment(int[] arr,int n) {
		int index1=-1; int index2=-1;
		for(int i=n-1; i>0; i--) {
			if(arr[i-1]<arr[i]) {
				index1=i-1;
				break;
			}
		}
		if (index1!=-1){
		 for(int i=n-1; i>=0;i--){
             if(arr[index1]<arr[i]){
                index2=i;
                break;
             }
         }	
		 swap(arr,index1,index2);
		}else {
        	 ReverseArr(arr, 0, n-1);
        	 return;
         }
        System.out.println(index2+" <-index2 ");
		ReverseArr(arr,index1+1,n-1);
		
	}
	public static void ReverseArr(int[] arr, int i, int j) {
		while(i<=j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
    }

}
