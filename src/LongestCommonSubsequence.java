

import java.util.Arrays;

public class LongestCommonSubsequence {
	static final int maximum = 1000;
	public static int LCSIterative(char[] a, char[] b) {
		int temp[][] = new int[a.length+1][b.length+1];
		int max = 0;
		for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(a[i-1] == b[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
		}
		return max;
		
	}
	public static int LCSRecursive(String a, String b, int i, int j,int mem[][]) {
		if(i>=a.length() || j>=b.length())
			return 0;
		if(mem[i][j]!=-1)
			return mem[i][j];
			
		if(a.charAt(i) == b.charAt(j))
			return mem[i][j] = 1+LCSRecursive(a, b, i+1, j+1,mem);
		else
			return mem[i][j]= Math.max(LCSRecursive(a, b, i+1, j,mem), LCSRecursive(a, b, i, j+1,mem));
		
	}
	public static void main(String[] args) {
		String a = "abcdefghacd";
		String b = "bdeghafde";

		
		  int mem[][] = new int[a.length()][maximum];
	        for (int[] row : mem) {
	            Arrays.fill(row, -1);
	        }
		System.out.println("Recursive : "+LCSRecursive(a,b,0,0,mem));
		
		char[] x = a.toCharArray();
		char[] y = b.toCharArray();
		
		System.out.println("Iterative : "+LCSIterative(x,y));
	}

}
