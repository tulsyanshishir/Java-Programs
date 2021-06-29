import java.util.*;

public class patternMatch {
	
	 public static boolean isMatch(String s, String p) {
	        if(s==null||p==null) return false;
	        if(p==".*") return true;
	        Map<Character,Integer> s1 = charMap(s);
	        Map<Character,Integer> p1 = charMap(p);
	        //if(s1.size()<p1.size()) return false;
	        char key;
            boolean match = true;
	        for(Map.Entry<Character,Integer> me : s1.entrySet() ) {
	        	key = me.getKey();
	        	if(p1.containsKey(key))
	        	{
		        	if(me.getValue() != p1.get(key) && p1.get(key) != 0) {
		        		match = false;
		        		return match;
		        	}
	        	}
	        	else return false;
	        }
			return match;
	    }
	 
	public static Map<Character,Integer> charMap(String s){
		Map<Character,Integer> charCount = new LinkedHashMap<>();
        char c = 0;
        char d = 0;
        int count = 1;
        int index = 0;
        for(int i =0;i<s.length();i++) {
        	c=s.charAt(i);
        	if(i+1<s.length()) index = i+1; 
        	d=s.charAt( index );
        	if(index == i) {
        		charCount.put(c, count);
        	}
        	if(d == '*') {
        		charCount.put(c, 0);
        		count = 1;
        		i=i+1;
        		index = i;
        		continue;
        	}
        	if(d == '.') {
        		charCount.put(c, 1);
        		count = 1;
        		i=i+1;
        		index = i;
        		continue;
        	}
        	if(c == s.charAt( index ) ) {
        		count++;
        	}
        	else {
        		charCount.put(c, count);
        		count = 1;
        	}
        }
        
        for(Map.Entry<Character,Integer> me : charCount.entrySet() ) {
        	 System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
        return charCount;
	}
	public static void main(String[] args) {
		
		//boolean isMatch = isMatch("mississippi","mis*is*p*");
		boolean isMatch = isMatch("aab","c*a*b*");
		System.out.println(isMatch);
		
	}

}
