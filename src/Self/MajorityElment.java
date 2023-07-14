package Self;

public class MajorityElment {
	public static void main(String[] args) {
		//moores voting algo
		int[] arr= {0,1,1,1,1};
		int n=arr.length;
		int count=1; int res=0;
		for(int i=0; i<n; i++) {
			if(arr[res]==arr[i]) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				res=i;
				count=1;
			}
		}
		count=0;
		for(int i=0; i<n; i++) {
			if(arr[res]==arr[i]) {
				count++;
			}
		}
		if(count<=n/2) {
			res=-1;
		}
		System.out.println(res);
	}
}
