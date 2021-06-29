

public class palindromeInteger {
	
	 public static boolean isPalindrome(int x) {
	       if(x<0) return false;
	        int y = 0;
	        while(x!=0){
	            y=(y*10)+(x%10);
	            x=x/10;
	        }
	        System.out.println(y);
	        if(x==y) return true;
	        else return false;
	    }

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}

}
