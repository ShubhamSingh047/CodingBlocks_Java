package Self_Sliding_Window;
import java.util.*;

public class SubarrayWithSum {
	public static void main(String[] args) {
		int[] arr={15, 2, 4, 8, 9, 5, 10, 23};
		Scanner s= new Scanner(System.in);
		int sum=s.nextInt();
		int curr_max=0, start=0;
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			
			curr_max+=arr[i];
		
			while(curr_max>sum && start<i) {
				curr_max-=arr[start];
				start++;
			}
			if(curr_max==sum) {
				System.out.println("start index "+ start +" end Index "+i);
				return;
			}
		}
		System.out.println("false");
	}
}
