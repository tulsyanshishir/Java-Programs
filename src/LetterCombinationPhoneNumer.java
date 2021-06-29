import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class LetterCombinationPhoneNumer {
	
	 final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
			    {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

			    public static List<String> letterCombinations(String D) {
			        int len = D.length();
			        List<String> ans = new ArrayList<>();
			        if (len == 0) return ans;
			        bfs(0, len, new StringBuilder(), ans, D);
			        return ans;
			    }

			    public static void bfs(int pos, int len, StringBuilder sb, List<String> ans, String D) {
			        if (pos == len) ans.add(sb.toString());
			        else {
			            char[] letters = L[Character.getNumericValue(D.charAt(pos))];
			            for (int i = 0; i < letters.length; i++)
			                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), ans, D);
			        }
			    }
			    static ArrayList<String>
			    letterCombinationsUtil(int[] number, int n,
			                           String[] table)
			    {
			        // To store the generated letter combinations
			        ArrayList<String> list = new ArrayList<>();
			 
			        Queue<String> q = new LinkedList<>();
			        q.add("");
			 
			        while (!q.isEmpty()) {
			            String s = q.remove();
			 
			            // If complete word is generated
			            // push it in the list
			            if (s.length() == n)
			                list.add(s);
			            else {
			                String val = table[number[s.length()]];
			                for (int i = 0; i < val.length(); i++)
			                {
			                    q.add(s + val.charAt(i));
			                }
			            }
			        }
			        return list;
			    }
			 
			    // Function that creates the mapping and
			    // calls letterCombinationsUtil
			    static void letterCombinations(int[] number, int n)
			    {
			        // table[i] stores all characters that
			        // corresponds to ith digit in phone
			        String[] table
			            = { "0",   "1",   "abc",  "def", "ghi",
			                "jkl", "mno", "pqrs", "tuv", "wxyz" };
			 
			        ArrayList<String> list
			            = letterCombinationsUtil(number, n, table);
			 
			        // Print the contents of the list
			        for (int i = 0; i < list.size(); i++) {
			            System.out.print(list.get(i) + " ");
			        }
			    }
			 

	public static void main(String[] args) {
		System.out.println(letterCombinations("234"));

	}

}
