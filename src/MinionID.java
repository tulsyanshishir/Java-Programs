import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinionID {
	static String primeNumberString = "";

	public static String getPrime() {
		// declaration of variables
		String rs = new String();
		int i, j;
		// stirng creation logic
		for (i = 2; i < 30000; i++) {
			for (j = 2; j <= i; j++) {
				if (i == j) {
					rs = rs + i;
				}
				if (i % j == 0) {
					break;
				}
			}
		}
		return rs;
	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

	public static String getPrimeNumberString(int i) {
		String primeNumberString = "";
		int count = 0;
		int num = 2;
		while (count != i + 5) {
			boolean prime = true;
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				count++;
				primeNumberString += num;
			}
			num++;
		}
		return primeNumberString;
	}

	public static String getPrimeNumberString() {
		String primeNumberString = "";
		for (int i = 2; i <= 30000; i++) {
			boolean isPrime = isPrime(i);
			if (isPrime)
				primeNumberString = primeNumberString + i;
			if (primeNumberString.length() >= 10006)
				break;
		}
		return primeNumberString;
	}

	public static String solution(int i) {

		/*
		 * String primeNumberString = new String(); primeNumberString =
		 * getPrimeNumberString(i); String minionID =
		 * primeNumberString.substring(i,i+5); return minionID;
		 */

		String primeNumberString = getPrimeNumberString();
		String minionID = primeNumberString.substring(i, i + 5);
		return minionID;
		/*
		 * System.out.println(getPrimeNumberString()); return
		 * getPrimeNumberString().substring(i,i+5);
		 */
	}

	public static String getPrimeNumbers() {
		int max = 21000;
		boolean[] primeFlags = new boolean[max + 1];
		Arrays.fill(primeFlags, true);
		for (int i = 2; i * i <= max; i++) {
			if (primeFlags[i]) {
				for (int j = i * 2; j <= max; j = j + i)
					primeFlags[j] = false;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i < max; i++) {
			if (primeFlags[i])
				sb.append(i);
		}
		return sb.toString();
	}

	 public static String solution3(int i ) {
		  int max = 21000;
	        boolean[] primeFlags = new boolean[max+1];
	        Arrays.fill(primeFlags,true);
	        StringBuilder sb = new StringBuilder();
	        for(int j=2;j<=max && sb.length()<i+6;j++){
	            if(primeFlags[j]){
	                sb.append(j);
	                for(int k = j*j;k<=max;k=k+i)
	                    primeFlags[k]=false;
	                }
	            }
	            return sb.substring(i,i+5);
	       }
	public static void main(String args[]) {
		String ID = solution(3);
//		/String ID2 = sol(10000);
//		System.out.println(ID2);
	}

}