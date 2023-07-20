package Self_Array;

public class SecondLargestOptimum {
	public static void main(String[] args) {
		int[] arr= {10,10};
		int larr=arr[0];
		int slarr=-1;
		for(int i=1;i<arr.length; i++) {
			if(arr[i]>larr) {
				slarr=larr;
				larr=arr[i];
			}else if(arr[i]!=larr){
				if(slarr==-1) {
					slarr=arr[i];
				}else if(arr[i]>slarr && arr[i]<larr) {
					slarr=arr[i];
				}
			}
		}
		System.out.println(slarr);
	}
}
