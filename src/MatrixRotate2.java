
public class MatrixRotate2 {
	
	public static void main(String args[]) {
		int[][]	 arr  = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};		
		int rowLength = arr.length;
		int columnLength = arr[0].length;
		int level = rowLength /2 ;
		int cycle = 0;
		int maxLength;
		
		//System.out.println(rowLength);		
		//System.out.println(columnLength);
		
		for(int row = 0; row < rowLength; row++) {
			for(int col = 0; col < columnLength; col++) {
				//System.out.println("arr["+row+"]"+"["+col + "] " + arr[row][col]);				
			}	
		}	
		int curr;
		int prev;
		int i = 0;
	    int j = 0;
	    
		for(cycle = 0; cycle < level; cycle++) {
			
			prev = arr[cycle+1][cycle];
			
			maxLength = columnLength - 1 - cycle;
			
			for(j=cycle;j<=maxLength;j++){
				curr      = arr[cycle][j];
				arr[cycle][j] = prev;
				prev      = curr;
			}	
			
			
			for(i=cycle+1;i<=maxLength;i++){
				curr      = arr[i][maxLength];
				arr[i][maxLength] = prev;
				prev      = curr;
			}	
		
			
			for(j=maxLength-1;j>=cycle;j--){
				curr      = arr[maxLength][j];
				arr[maxLength][j] = prev;
				prev      = curr;
			}	
		
			for(i=maxLength-1;i>=cycle;i--){
				curr      = arr[i][cycle];
				arr[i][cycle] = prev;
				prev      = curr;
			}	
		   				
		}
		
		for(int row = 0; row < rowLength; row++) {
			for(int col = 0; col < columnLength; col++) {
				System.out.println("arrRot["+row+"]"+"["+col + "] " + arr[row][col]);				
			}	
		}
	}
}
