import java.util.LinkedHashMap;

public class longsterNonRepeatingSubstring {
	
	 public static int lengthOfLongestSubstring(String s) {
	        System.out.println(s);
	        int longestSubstring = 0;
	        char[] arr = s.toCharArray();
	        LinkedHashMap<Character,Integer> subMap = new LinkedHashMap<>();        
	         for(int i=0;i<arr.length;i++){
	             char c = arr[i];
	          if(!subMap.containsKey(c)) 
	           subMap.put(c,i);
	          else{
	              i = subMap.get(c);
	              System.out.println(i);
	              subMap.clear();
	          }
	             if(subMap.size()>longestSubstring)
	            longestSubstring = subMap.size();
	             
	       }
	         return longestSubstring;
	    }

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

}
