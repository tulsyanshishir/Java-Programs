
public class MainDummy {
	static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	
	 public static boolean isMatch(String s, String p) {
	      boolean match = false;
	      int pLen = p.length();
	        if(pLen == 2 && p.equalsIgnoreCase(".*"))
	            return true;
	      int j = 0;
	      int i = 0;
	      int sLen = s.length();
	        
	      while(i<sLen && j<pLen){
	          char sI = s.charAt(i);
	          char pI = p.charAt(j);
	          System.out.println(pI);
	          if(pI==sI)
	          {           
	              i++;
	              j++;
	          }
	          else if(pI == '.')
	              continue;
	          else if(pI == '*' && i>0){
	              char previousI = s.charAt(i-1);
	              if(j<pLen)
	               j++;
	          if(i<sLen-1)
	            while(s.charAt(i+1) == previousI)
	            i++;
	          }
	          else if(pI!=sI){
	             match = false;
	             break;
	          }
	          
	          System.out.println(i);
	          System.out.println(j);
	          
	          if(i==sLen-1 && j == pLen-1)
	            match = true;
	      
	      }
	        return match;
	    }
	

	public static void main(String args[])  throws java.lang.Exception{
		
}
	
}
