package Arrays_2D;
import java.util.*;

public class Boolean_Matrix {
	//if any element in an array contains 1 then make whole col and row to be 1;
	public static void main(String[] args) {

		        Scanner s= new Scanner(System.in);
		        int row=s.nextInt();
		        int col=s.nextInt();
		        
		        int[][] arr= new int[row][col];
		        
		        for(int i=0; i<row; i++){
		            for(int j=0; j<col; j++){
		                 arr[i][j]=s.nextInt();
		                
		            }
		        }
		        
		        for(int i=0; i<arr.length; i++){
		            for(int j=0; j<arr[0].length; j++){
		                if(arr[i][j]==-1){
		                    for(int k=0; k<arr.length; k++){
		                        arr[i][k]=1;
		                    }
		                    for(int k=0; k<arr[0].length; k++){
		                        arr[k][i]=1;
		                    }
		                }
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
