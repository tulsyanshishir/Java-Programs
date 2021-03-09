
public class longestPalindromicSubstring {

	public static String longestPalindromeSubstring(String s) {
		if (s.length() == 0)
			return "";

		int longest = 0;
		int start = 0;
		int end = 0;
		boolean[][] table = new boolean[s.length()][s.length()];
		table[0][0] = true;

		for (int i = 1; i < s.length(); i++) {
			// All single characters are palindrome in itself
			table[i][i] = true;

			// All two characters are palindrome if two characters are equal
			table[i - 1][i] = s.charAt(i - 1) == s.charAt(i);
			if (table[i - 1][i] && longest <= 2) {
				longest = 2;
				start = i - 1;
				end = i;
			}
		}

		for (int L = 3; L <= s.length(); L++) {
			for (int i = 0; i <= s.length() - L; i++) {
				int j = i + L - 1;
				table[i][j] = table[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));

				if (table[i][j] && longest <= L) {
					longest = L;
					start = i;
					end = j;
				}
			}
		}
		return s.substring(start, end + 1);
	}

	public static void main(String[] args) {
		String lstr = longestPalindromeSubstring("abba");
		System.out.println(lstr);
	}

}
