import java.util.*;
public class CreateGraph {
	public static void main(String args[]) {
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		
		graph.addEdge("A", "B");
		graph.addEdge("A", "D");
		graph.addEdge("B", "C");
		graph.addEdge("C", "D");
		
		System.out.println("Graph : ");
		Set<String> path= graph.traverse("B");
		Iterator<String> iterator = path.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Set<String> pathBFS= graph.traverse("B");
		Iterator<String> iteratorBFS = pathBFS.iterator();
		while(iteratorBFS.hasNext()) {
			System.out.println(iteratorBFS.next());
		}
		
		}	
}
