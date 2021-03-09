/**/
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Graph {
	private Map<Vertex,List<Vertex>> adjVertices = new HashMap<>();
	
    public void addVertex(String label) {
    	adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }
    
    public void removeVertex(String label) {
    	Vertex v = new Vertex(label);
    	adjVertices.values().stream().forEach(e->e.remove(v));   
    	adjVertices.remove(v);
    }
    
    public void addEdge(String label1, String label2) {
    	Vertex v1 = new Vertex(label1);
    	Vertex v2 = new Vertex(label2);  	
    	adjVertices.get(v1).add(v2);
    	adjVertices.get(v2).add(v1);
    }
    
    public void removeEdge(String label1,String label2) {
    	Vertex v1 = new Vertex(label1);
    	Vertex v2 = new Vertex(label2);
    	List<Vertex> ev1 = adjVertices.get(v1);
    	List<Vertex> ev2 = adjVertices.get(v2);
    	if(ev1 != null) {
    		ev1.remove(v2);
    	}
		if(ev2 != null) {
			ev2.remove(v1);		
		}
    }
    public Set<String> traverse(String label) {   	
    	Set<String> visited = new LinkedHashSet<String>();
    	Stack<String> stack = new Stack<String>();
    	stack.push(label);
    	while(!stack.isEmpty()) {
    		String vertex = stack.pop();
    		if(!visited.contains(vertex)) {
    			visited.add(vertex);
    			List<Vertex> adjVertcies = adjVertices.get(new Vertex(vertex));
    			for(Vertex v : adjVertcies) {
    				stack.push(v.label);
    			}
    		}
    	}
		return visited;
    }
    public Set<String> BFS(String label){
    	Set<String> visited = new LinkedHashSet<String>();
    	Queue<String> queue = new LinkedList<String>();
    	queue.add(label);
    	while(!queue.isEmpty()) {
    		String vertex = queue.poll();
    		if(!visited.contains(vertex)) {
    		visited.add(vertex);
    		List<Vertex> adjVert = adjVertices.get(new Vertex(vertex));
    		for(Vertex v : adjVert) {
    			queue.add(v.label);
    		}
    		}
    	}
    	return visited;
    }
}
