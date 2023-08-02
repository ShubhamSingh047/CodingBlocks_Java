package Arrays_2D;

import java.util.*;

public class ExitPointOfArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of row and col respectivcely");
		
		int row=s.nextInt();
		int col=s.nextInt();
		
		int arr[][]=new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		Solution(arr);
	}

	public static void Solution(int[][] arr) {
		// TODO Auto-generated method stub
		int dir=0;
        int i=0;
        int j=0;
        boolean test=true;
           while(test){
                   dir+=arr[i][j]%4;
                   arr[i][j]=0;
                  if(dir==0){
                      j++;
                  }else if(dir==1){
                      i++;
                  }else if(dir==2){
                      j--;
                  }else if(dir==3){
                      i--;
                  }
                  if (i < 0){
                        i++;
                        test=false;
                  }
                    else if(j<0){
                        j++;
                        test=false;
                    }
                    else if(j>=arr[0].length){
                        j--;
                        test=false;
                    }else if(i>=arr.length){
                        i--;
                        test=false;
                    }
                }
           System.out.println(i+" "+j);
	}
}
