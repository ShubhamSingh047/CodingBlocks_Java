package Lecture9;

public class TappingWater {
	public static void main(String[] args) {
		int[] arr= {2,5,3,1,7,3,4};
		int res=trap(arr);
		System.out.println(res);
	}
	  public static int trap(int[] height) {
	        int[] larr=new int[height.length];
	        int[] rarr=new int[height.length]; 
	        
	        larr[0]=height[0];
	        for(int i=1; i<height.length; i++){
	            larr[i]=Math.max(larr[i-1],height[i]);
	        }

	        rarr[height.length-1]=height[height.length-1];
	        for(int i=height.length-2; i>=0; i--){
	            rarr[i]=Math.max(rarr[i+1],height[i]);
	        }
	        int sum=0;
	       for(int i=0; i<height.length; i++) {
	    	   sum+= Math.min(rarr[i], larr[i])-height[i];
	       }
	        
	       return sum;
	    }

}
