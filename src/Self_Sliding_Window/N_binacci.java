package Self_Sliding_Window;
import java.util.*;

public class N_binacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int arr[]=new int[m];
		arr[n-1]=1;
		arr[n]=1;
		for(int i=n+1; i<m; i++) {
			arr[i]=2*arr[i-1]+arr[i-n-1];
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
