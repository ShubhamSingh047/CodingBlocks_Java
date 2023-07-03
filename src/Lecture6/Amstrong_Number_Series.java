package Lecture6;
import java.util.*;
public class Amstrong_Number_Series {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	       int n1 = sc.nextInt();
	       int n2 = sc.nextInt();
	       
	  for(int i= n1 + 1; i<=n2; i++) {
	      int count = 0;
	      int result = 0;
	      int Number =i;

	      while (Number!= 0) {
	        Number/= 10;
	        count++;
	      }

	      Number = i;
		  while (Number!= 0) {
		        int rem = Number% 10;
		        result += Math.pow(rem, digits);
		        Number /= 10;
		  }

	      if (result == i) {
	        System.out.print(i + " ");
	      }
	    }
	  }
}
