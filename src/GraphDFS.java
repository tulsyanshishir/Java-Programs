import java.util.LinkedList;
import java.util.Iterator;

public class GraphDFS {
	
   private int V;
   private LinkedList<Integer> aL[]; 
	
	@SuppressWarnings("unchecked")
	GraphDFS(int v){
		this.V = v;
		aL = new LinkedList[v];
		for(int i=0;i<v;++i) {
			aL[i] = new LinkedList<Integer>();
			
		}		
	}
	
	void DFSUtils(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v+" "); 
		Iterator<Integer> i = aL[v].listIterator();
		while(i.hasNext()) {
			 int n = i.next(); 
	            if (!visited[n]) 
	                DFSUtils(n, visited); 
	        } 
		}
	
	void DFS(int v) {
		
		boolean visited[] = new boolean[V];
		DFSUtils(v, visited);
		
	}
	
	void addEdge(int v, int e) {
		aL[v].add(e);		
	}

	public static void main(String[] args) {
		GraphDFS g = new GraphDFS(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        g.DFS(2);

	}

}
