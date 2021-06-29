
public class UniqueString {
	
	public static boolean isUnique(String str1) {
		int checker = 0;
		for(int i = 0;i<str1.length();i++) {
			
			int bitIndex = str1.charAt(i)-'a';
			
			if((checker & (1<<bitIndex))>0)
				return false;	
			checker |= (1<<bitIndex);
			
		}
		return true;	
	}

	public static void main(String[] args) {
		System.out.println(isUnique("abacd"));
	}

}
