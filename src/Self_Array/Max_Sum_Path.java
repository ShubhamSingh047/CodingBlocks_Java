package Self_Array;

public class Max_Sum_Path {
	public static void main(String[] args) {
		int[] arr1= {2,3,7,10,12,15,30,34};
		int[] arr2= {1,5,7,8,10,15,100};
		
		int i=0,j=0,n=arr1.length,m=arr2.length;
		int u_arr=0,l_arr=0,sum=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				u_arr+=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				l_arr+=arr2[j];
				j++;
			}else {
				sum+=Math.max(u_arr,l_arr)+arr1[i];
				i++;j++;u_arr=0;l_arr=0;
			}
		}
		while(i<n) {
			u_arr+=arr1[i];
			i++;
		}
		while(j<m) {
			l_arr+=arr2[j];
			j++;
		}
		sum+=Math.max(l_arr, u_arr);
		System.out.println(sum);
	}
}
