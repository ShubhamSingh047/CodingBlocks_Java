package Lecture2;
import java.util.*;

public class Assignment2 {
	public static void main(String args[]) {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int rowUp=1;
        while(rowUp<=n/2){
            int col=n/2+1;
            if(n/2+1==rowUp)
                col=2;
            while(col>=rowUp){
                System.out.print(" * ");
                col--;
            }

            int space=1;
            while(space<rowUp){
                if(rowUp!=1)
                    System.out.print("   ");
                space++;
            }
            int spacel=1;
            while(spacel<rowUp-1){
                if(rowUp!=1)
                    System.out.print("   ");
                spacel++;
            }
            int start=n/2+1;
            if(n==rowUp){
                start=2;
            }
            while(start>=rowUp){
                System.out.print(" * ");
                start--;
            }
            System.out.println();
            rowUp++;
        }
        
        int row=1;
        
        while(row<=n/2+1){
            int col=1;
            while(col<=row){
                System.out.print(" * ");
                col++;
            }
            int space=n/2;
            while(space>=row){
                System.out.print("   ");
                space--;
                
            }
            int spacel=n/2-1;
            while(spacel>=row){
                System.out.print("   ");
                spacel--;
            }
            int start=1;
            if(row==n/2+1){
                start=2;
            }
            while(start<=row){
                System.out.print(" * ");
                start++;
            }
            System.out.println();
            row++;
        }
    }
}
