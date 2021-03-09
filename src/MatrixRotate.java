
public class MatrixRotate {
	
	public static void main(String args[]) {
		int[][]	 arr  = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};		
		int rowLength = arr.length;
		int columnLength = arr[0].length;
		
		//System.out.println(rowLength);		
		//System.out.println(columnLength);
		
		for(int row = 0; row < rowLength; row++) {
			for(int col = 0; col < columnLength; col++) {
				//System.out.println("arr["+row+"]"+"["+col + "] " + arr[row][col]);				
			}	
		}	
		int count = rowLength * columnLength;
		int curr;
		int prev;
		int i = 0;
	    int j = 1;
	    int itr = 0;
	    int colHolder;
	    int rowHolder;
	    
		while(count > 0){
			
			prev = arr[itr][itr];
			
			for(j=itr+1;j<columnLength-itr;j++){
				curr      = arr[i][j];
				arr[i][j] = prev;
				count -= 1;
				prev      = curr;
			}	
			
			j=j-1;
			
			for(i=itr+1;i<rowLength-itr;i++){
				curr      = arr[i][j];
				arr[i][j] = prev;
				count -= 1;
				prev      = curr;
			}	
			
			i=i-1;
			
			colHolder = j-1;
			
			for(j=colHolder;j>columnLength-itr;j--){
				curr      = arr[i][j];
				arr[i][j] = prev;
				count -= 1;
				prev      = curr;
			}	
			
			j=j+1;
			rowHolder = i-1;
			for(i=rowHolder;i>rowLength-itr;i--){
				curr      = arr[i][j];
				arr[i][j] = prev;
				count -= 1;
				prev      = curr;
			}	
			
			i=i+1;
				
			itr += 1;
		}
		
		for(int row = 0; row < rowLength; row++) {
			for(int col = 0; col < columnLength; col++) {
				System.out.println("arrRot["+row+"]"+"["+col + "] " + arr[row][col]);				
			}	
		}
	}
}
