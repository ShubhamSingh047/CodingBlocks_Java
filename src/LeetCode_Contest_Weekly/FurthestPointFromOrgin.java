package LeetCode_Contest_Weekly;

public class FurthestPointFromOrgin {
		public static void main(String[] args) {
			String moves="_L_R__LL";
			int res=furthestDistanceFromOrigin(moves);
			System.out.println(res);
		}
		
	    public static int furthestDistanceFromOrigin(String moves) {
	        int countl=0;
	        int countr=0;
	        int space=0;
	        for (char i=0; i<moves.length(); i++) {
	            char j=moves.charAt(i);
	            if(j=='L'){
	                countl--;
	                countr--;
	            }
	            if(j=='R'){
	                countr++;
	                countl++;
	            }
	            if(j=='_'){
	                space++;
	            };
	        }
	        if(countl>=countr){
	            int leftAbs=Math.abs(countl);
	            return leftAbs+space;
	        }else{
	            return countr+space;
	        }
	    }

}
