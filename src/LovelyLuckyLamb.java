import java.util.ArrayList;
import java.util.List;

public class LovelyLuckyLamb {
	
	public static int solution2(int total_lambs) {
        if(total_lambs >= Math.pow(10,9))
			return 0;	
		int generousPassSum = 0;
		int stringyPassSum = 2;
		List<Integer> generousList = new ArrayList<>();
		List<Integer> stringyList = new ArrayList<>();
		for(int i =0;i<=total_lambs;i++) {
			generousList.add((int) Math.pow(2, i));
			generousPassSum = generousPassSum + generousList.get(i);
			if(generousPassSum>total_lambs)
				break;
		}
		stringyList.add(1);
		stringyList.add(1);
		for(int j = 2;j<=total_lambs;j++) {
			int val = stringyList.get(j-1) + stringyList.get(j-2);
			stringyList.add(val);
			stringyPassSum = stringyPassSum + stringyList.get(j);
			if(stringyPassSum>total_lambs)
				break;
		}
						
		return stringyList.size()-generousList.size();
    }
	
	public static int solution(int total_Lambs) {
		if(total_Lambs > Math.pow(10,9))
			return 0;	
		int currVal = 0;
		int generousPassSum = 0;
		int generousPassCount = 0;
		int stringyPassSum = 2;
		int stringyPassCount = 2;
		for(int i =0;i<total_Lambs;i++) {
			currVal = (int) Math.pow(2, i);
			generousPassSum = generousPassSum + currVal;
			generousPassCount++;
			if(generousPassSum>total_Lambs)
				break;
		}
		int first = 1;
		int second = 1;
		int current = 0;
		for(int j = 2;j<total_Lambs;j++) {
			current = first + second;
			first = second;
			second = current;
			stringyPassSum = stringyPassSum + current;
			stringyPassCount++;
			if(stringyPassSum>total_Lambs)
				break;
		}
						
		return (int)(stringyPassCount-generousPassCount);
	}

	public static void main(String[] args) {
		System.out.println(solution(143));
		System.out.println(solution2(143));

	}

}
