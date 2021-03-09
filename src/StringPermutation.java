
public class StringPermutation {
	static void permutation(String str) {
		permutation(str, "");
	}

	static void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}
	
	static int power(int a, int b) {
		if (b < 0) {
		return 0; 
		} else if (b == 0) {
		return 1;
		} else {
		return a * power(a, b - 1);
		}
		}

	public static void main(String args[]) {
		// permutation("Ram");
		//String str = "Ram";
		// System.out.println(str.substring(0, 0));
		//System.out.println(str.substring(1));
		
		System.out.println(power(2,3));
	}

}

