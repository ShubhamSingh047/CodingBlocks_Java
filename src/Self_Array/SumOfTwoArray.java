package Self_Array;

public class SumOfTwoArray {
	public static void main(String[] args) {
		int[]arr1= {6 ,9, 8, 5};
		int[] arr2= {0};
		int[] output=new int[arr1.length+1];
		sumOfTwoArrays(arr1,arr2,output);
		for(int i:output)System.out.println(i);
	}
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i=arr1.length-1,j=arr2.length-1,k=output.length-1,c=0,d=0;
        while(i>=0&&j>=0){
            c=arr1[i--]+arr2[j--]+c;       
            if(c>9){
                d=c%10;
                c/=10;
            }
            output[k--]=c+d;
            c=0;
            d=0;
        }
        System.out.println(i+" <-i j->"+j);
        while(i>=0){
        	System.out.println("inside 1"+c);
            c=arr1[i--]+c;
           if(c>9){
                d=c%10;
                c/=10;
            }
            output[k--]=c+d;
            d=0;
            c=0;
        }
        while(j>=0){
            c=arr2[j--]+c;
            if(c>9){
                d=c%10;
                c/=10;
            }
            output[k--]=c+d;
            d=0;
        }
        if(c>0)
            output[0]=c;
    }

}
