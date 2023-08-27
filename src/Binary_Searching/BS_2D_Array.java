package Binary_Searching;

public class BS_2D_Array {
	public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length, m=matrix[0].length;
        int low=0; int high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int i=mid/m;
            int j=mid%m;
            int res=matrix[i][j];
            if(res==target){
                return true;
            }else if(res<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
