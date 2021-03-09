import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {
	
	public static String compressString(String inputStr) {
		
		if (inputStr == null) {
			return null;
		}
		
		StringBuilder comString = new StringBuilder();
		char strArray[] = inputStr.toCharArray();
		
		Map<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
		for (char c : strArray) {
			if(charMap.containsKey(c)) 
				charMap.put(c, charMap.get(c)+1);
			else
				charMap.put(c,1);
		}
		
		
		for(Entry<Character,Integer> entry : charMap.entrySet()) {
			comString.append(entry.getKey());
			comString.append(entry.getValue());
		}
		if(comString.toString().length() < inputStr.length())
			return comString.toString();
		
        return inputStr;
	}
	
	
	public static String compressStr(String inputStr) {
		
		if (inputStr == null) {
			return null;
		}
		StringBuilder build = new StringBuilder();
		char currChar = 0;
		int  count = 1;
		for(int i = 0 ; i<inputStr.length()-1;i++) {
			currChar = inputStr.charAt(i);
			if(currChar!=inputStr.charAt(i+1)) {
				build.append(currChar);
				build.append(count);
				count = 1;
			}
			else
				count++;
		}
		build.append(currChar);
		build.append(count);
		
		if(build.toString().length() < inputStr.length())
			return build.toString();
		
		return inputStr;
	}
		
	
	public static void main(String[] args) {
		String input = "abbbcddddddd"; //a2b3c1d4
		System.out.println("Output is: " + compressString(input));
		System.out.println("Output is: " + compressStr(input));
	}
}
