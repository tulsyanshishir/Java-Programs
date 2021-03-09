
public class inPlaceRotateMatrix {
	
	public static int[][] inPlaceRotate(int mat[][]){
		int rowLen = mat.length-1;
		int colLen = mat[0].length-1;
		if(rowLen!=colLen) return null;
		for(int i=0;i<rowLen/2;i++) {
			for(int j=i;j<colLen-i;j++) {
				int p1 = mat[i][j] ;
				int p2 = mat[j][colLen-i];
				int p3 = mat[rowLen-i][colLen-j];
				int p4 = mat[rowLen-j][i];
				
				mat[j][colLen-i] = p1;
				mat[rowLen-i][colLen-j] = p2;
				mat[colLen-j][i] = p3;
				mat[i][j] = p4;
			}
			
		}
		return mat;		
	}
    public static void printMatrix(int[][] mat) {
    	for(int i = 0;i<mat.length;i++) {
    		for(int j=0;j<mat.length;j++) {
    			System.out.print(mat[i][j] + " ");
    			}
    		System.out.println("");
    	}
    	
    }
	public static void main(String[] args) {
		
		int[][] mat = {
					   {1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}
				       };
		printMatrix(mat);
		
		printMatrix(inPlaceRotate(mat));
	

	}

}
