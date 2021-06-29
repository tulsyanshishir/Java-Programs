import java.util.ArrayList;
import java.util.List;


public class PrintParanthesis {

	public static void main(String[] args) {
        String inp = "((())(()(())))(()(()))(((((()())))((())))(()))";

        int idx = 0;
        List<String> res = new ArrayList<>();
        int level = 0;

        while (idx < inp.length()) {
            if (inp.charAt(idx) == '(') {
                if (level >= res.size()) { // this will be added only if a new level needs to be created
                    res.add("");
                }
                String curr = res.get(level);
                if (level != 0) {// before adding new bracket fill it with spaces if needed to compensate for last open bracket in prev level
                    for (int i = curr.length(); i < res.get(level - 1).length(); i++) {
                        curr += " ";
                    }
                }
                curr += "(";
                res.set(level, curr);
                level++;
            } else {
                // to compensate for extra level added
                level--;
                String curr = res.get(level);
                if (level < res.size() - 1) { // before adding closing bracket add spaces to size to next level
                    for (int i = curr.length(); i < res.get(level+1).length(); i++) {
                        curr += " ";
                    }
                }
                curr += ")";
                res.set(level, curr);
            }
            idx++;
        }

        //print output
        res.forEach(a -> System.out.println(a));
    }

}
