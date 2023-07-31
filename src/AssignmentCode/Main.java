package AssignmentCode;
import java.util.*;

public class Main {
	 public static void main(String args[]) {
	        Scanner s= new Scanner(System.in);
	        int row=s.nextInt();
	        int col=s.nextInt();
	        int[][] arr= new int[row][col];
	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	                arr[i][j]=s.nextInt();
	            }
	        }

	        int minc=0, minr=0, maxr=arr.length-1, maxc=arr[0].length-1;
	        int count=0, max=row*col;

	        while(count<max){
	            for(int i=minr, j=minc; i<=maxr&&count<max; i++){
	                System.out.print(arr[i][j]+", ");
	                count++;
	            }
	            minc++;

	            for(int i=minc, j=maxr; i<=maxc && count< max; i++){
	                System.out.print(arr[j][i]+", ");
	                count++;
	            }
	            maxr--;

	            for(int i=maxr, j=maxc; i>=minr && count<max; i--){
	                System.out.print(arr[i][j]+", ");
	                count++;
	            }
	            maxc--;

	            for(int i=maxc, j=minr; i>=minc && count<max; i--){
	                System.out.print(arr[j][i]+", ");
	                count++;
	            }
	            minr++;
	        }
	    }
}
