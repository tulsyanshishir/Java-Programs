import java.util.ArrayList;

public class AdjacencyList {
	
	boolean visited[] = new boolean[4];
	 public static void main(String args[]) {
		ArrayList<Integer>[] aL = new ArrayList[4];
		for(int i = 0; i<4; i++) {
			aL[i] = new ArrayList<Integer>();
		}
		
		
	aL[0].add(1);
	aL[0].add(2);
	aL[0].add(3);
	aL[0].add(4);
	aL[1].add(2);
	aL[1].add(3);
	aL[1].add(1);
	aL[2].add(3);
	aL[2].add(2);
	aL[2].add(1);
	aL[2].add(4);
	aL[3].add(4);
	aL[3].add(1);
	aL[3].add(3);
	
	 for (int i = 0; i < 4; i++) { 
         for (int j = 0; j < aL[i].size(); j++) { 
             System.out.print(aL[i].get(j) + " "); 
         } 
         System.out.println(); 
     } 

}}
