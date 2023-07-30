package Arrays_2D;

import java.util.Scanner;

public class PrintSpiral {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		int minr=0, minc=0, maxr=arr.length-1, maxc=arr[0].length-1;
		int max=row*col;
		int count=0;
		while(count<max) {
			//first line col
			for(int i=minr, j=minc; i<=maxr && count<max; i++) {
				System.out.print(arr[i][j]+" ");count++;
			}
			minc++;
			
			//first Bottom Line
			for(int i=minc, j=maxr; i<=maxc && count<max; i++) {
				System.out.print(arr[j][i]+" ");count++;
			}
			maxr--;
			
			//first right line
			for(int i=maxr,j=maxc; i>=minr && count<max; i--) {
				System.out.print(arr[i][j]+" ");count++;
			}
			maxc--;
			for(int i=maxc, j=minr; i>=minc && count<max; i--) {
				System.out.print(arr[j][i]+" ");count++;
			}
			minr++;
		}
	}

}
