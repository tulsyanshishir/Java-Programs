package AbstractFactory;

public class LongestPalindromicSubstring {
	
	
	
	public static void main(String args[]) {
		String str = "agbdba";
		int LPS = LPSRecursive(str.toCharArray(),0,str.length());
		System.out.println(LPS);
	}

	private static int LPSRecursive(char[] str, int start, int len) {
		if(len==1)
			return 1;
		if(len==0)
			return 0;
		if(str[start]==str[start+len-1])
			return 2 + LPSRecursive(str,start+1,len-2);
		else
			return Math.max(LPSRecursive(str,start,len-1), LPSRecursive(str,start+1,len-1));
		
	}

}
