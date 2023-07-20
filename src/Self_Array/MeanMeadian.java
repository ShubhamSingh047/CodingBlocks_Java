package Self_Array;
import java.util.*;

public class MeanMeadian {
	public static void main(String[] args) {
		int a[] = {1, 2, 19, 28, 5};
		int n=a.length;
		System.out.println(median(a,n));
		System.out.println(mean(a,n));
	}
	  public static int median(int A[],int N)
	    {
	      
	        Arrays.sort(A);
	        int n=A.length;
	       int meanI=(n%2==0)?(n/2)-1:n/2;
	       return A[meanI];
	       
	       //Your code here
	       //If median is fraction then conver it to integer and return
	    }
	    //Function to find median of the array elements.
	    public static int mean(int A[],int N)
	    {
	       //Your code here
	     
	       int sum=0;
	       for(int i=0; i<A.length; i++){
	           sum+=A[i];
	       }
	       return sum/=A.length;
	    }
}
