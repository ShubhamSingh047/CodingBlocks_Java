package AssignmentCode;
import java.util.*;

public class Main {
	public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=s.nextInt();
            }
        }
        int minr=0, minc=0, maxr=arr.length-1, maxc=arr[0].length-1;
        int total=row*col;
        int count=0;
        while(count<total){
            //first col
        	 for(int j=minc,i=minr;  j<=maxc && count<total; j++){
                 System.out.print(arr[i][j]+", ");
                 count++;
             }
             minr++;

             //last col
             for(int j=minr, i=maxc; j<=maxr && count<total; j++){
                 System.out.print(arr[j][i]+", ");
                 count++;
             }
             maxc--;

             //last row
             for(int j=maxc,i=maxr; j>=minc && count<total; j--){
                 System.out.print(arr[i][j]+", ");
                 count++;
             }
             maxr--;
             //first row
             for(int j=maxr, i=minc; j>=minr && count<total; j--){
                 System.out.print(arr[j][i]+", ");
                 count++;
             }
             minc++;
        }
    System.out.print("END");
    }
}
