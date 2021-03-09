
public class fibonacci {

	public static int createFibonacci(int seriesLength) {
		if(seriesLength < 2) 
			return seriesLength;
			
		return createFibonacci(seriesLength-1) + createFibonacci(seriesLength-2);		
		
	}
	
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			System.out.println(createFibonacci(i));
			
		}
				
	}

}
