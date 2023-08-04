package Arrays_2D;
import java.util.*;

public class RotateImage {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
        int n=s.nextInt();
        
        int[][] arr= new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=s.nextInt();
            }
        }

        //we now have to find transpose
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // reverse the array colm wise
         for(int j=0; j<arr[0].length; j++){
             int ti=0;
             int bi=arr.length-1;
             while(ti<bi){
                 int temp=arr[ti][j];
                 arr[ti][j]=arr[bi][j];
                 arr[bi][j]=temp;
                 ti++;
                 bi--;
             }
         }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}
