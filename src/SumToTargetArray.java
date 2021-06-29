import java.util.HashSet;

public class SumToTargetArray {
	
	public static void pairSumArray(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<>();
		for(int i = 0;i<arr.length;i++) {
			int temp = Math.abs(sum-arr[i]);
			if(s.contains(temp)) {
				System.out.println(temp+" + "+arr[i]+" = " + sum);
			}
			s.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,1,11,12,19,27,16};
		int sum = 31;
		pairSumArray(arr, sum);
	}

}
