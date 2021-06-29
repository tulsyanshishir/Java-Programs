
public class MaxNumberSumToX {
	
	public static long sum(int n,int x) {
		long number = 0;
		if(x==0) {
		 number = (n==1) ? 0: -1;
          return number;
		}
		
		if(x>9*n) return -1;
			
		for(int i = 0;i<n;i++) {
		 if(x>=9) {
			 number = number*10+9;
			 x -= 9;
		 }
		 else if(x<9 && x>=0) {
			 number=number*10+x;
			 x=-1;		 
		 }
		 else
			 number= number*10;
		}
		return number;
	}
	

	public static void main(String[] args) {
		System.out.println(sum(2,0));
		System.out.println("+"+Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

}
