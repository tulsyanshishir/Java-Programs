import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class palindromepermutaion {
	
	public static boolean isPalindromePermutaion(String str) {
		if(str == null) return false;
        int oddCount = 0 ;
        int strLen = str.length();
        str = str.toLowerCase();
        Map<Character,Integer> countMap = new HashMap<>();
        for(int i = 0; i<strLen; i++) {
        	char currChar = str.charAt(i);
        	if(Character.isLetter(currChar) || Character.isDigit(currChar))
	        	if(countMap.containsKey(currChar)){
	        	countMap.put(currChar, countMap.get(currChar)+1);
        	}
        	else {
        		countMap.put(currChar, 1);
        	}
        	
        }
        for(Entry<Character,Integer> key : countMap.entrySet()) {
        	if(key.getValue() %2 !=0) oddCount++;
        }
        
        return oddCount <= 1;
		
	}
	
	public static void main(String args[]) {
		System.out.println(isPalindromePermutaion("Tact Coa"));
	}

}
