package Binary_Searching;
import java.util.*;

public class BookAllocation {
	 public static void main(String args[]) {
	        Scanner s=new Scanner(System.in);
	        int t=s.nextInt();
	        for(int i=0; i<t; i++){
	            int books=s.nextInt();
	            int stud=s.nextInt();
	            int[] pages=new int[books];
	            int low=0;
	            int high=0;
	            for(int j=0; j<books; j++){
	                pages[j]=s.nextInt();
	                high+=pages[j];
	            }
	            while(low<=high){
	                int mid=(low+high)/2;
	                if(ValidDistribution(pages,mid,stud)){
	                    high=mid-1;
	                }else{
	                    low=mid+1;
	                }
	                
	            }
	            System.out.println(low);
	        }
	    }
	    public static boolean ValidDistribution(int[] arr, int mid,int stud){
	        int student=1, pages=0;
	        for(int i:arr){
	            if(i+pages>mid){
	                student++;
	                pages=i;
	            }else{
	                pages+=i;
	            }
	        }
	        return student<=stud;
	    }
}
