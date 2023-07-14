package Self;

public class FlipArrayZeroOne {
	public static void main(String[] args) {
		//not complete
		int[] arr= {0, 0, 0, 1, 0, 0,0, 1,1,0,0,0,1};
		int n=arr.length;
		int flipOne=0, flipZero=0;
		for(int i=1; i<n; i++) {
			if(arr[i]!=arr[i-1] && arr[i]==0) {
				flipZero++;
			}
		}
		for(int i=1; i<n; i++) {
			if(arr[i]!=arr[i-1]&&arr[i]==1) {
				flipOne++;
			}
		}
		if(arr[0]==1) {
			flipOne++;
		}else {
			flipZero++;
		}
		int res=(flipOne>flipZero)?flipZero:flipOne;
		int num=(flipOne>flipZero)?0:1;
		for(int i=1; i<n; i++) {
			if(arr[i]== num && arr[i]!=arr[i-1]) {
				System.out.print(i+" - ");
			}
			
		}
	}
}
