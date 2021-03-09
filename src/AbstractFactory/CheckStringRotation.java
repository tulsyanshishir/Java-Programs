package AbstractFactory;

public class CheckStringRotation {
	
	public static boolean isSubstring(String string1, String string2) {
		
		StringBuilder addString2 = new StringBuilder(string2);
		addString2.append(string2);
		int index = addString2.indexOf(string1); 
		if(index == -1) return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSubstring("waterbottle","ebottlewat"));
	}

}
