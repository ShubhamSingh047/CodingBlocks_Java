package Sorting;

public class IntersectionOfTwoArr {
	public static void main(String[] args) {
		int a[]= {1,1,3,3,3};
		int b[]= {1,1,1,3,5,5,5};
		int i=0,j=0, n=a.length, m=b.length;
		while(i<n && j<m) {
			if(i>0 && a[i]==a[i-1])i++;
			if(j>0 && b[j]==b[j-1])j++;
			if(a[i]==b[j]) {
				System.out.print(a[i++]+" ");
				j++;
			}
			else {
				i++;j++;
			}
		}
	}

}
