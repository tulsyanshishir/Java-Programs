
public class Vertex {
	String label;
	Vertex(String label){
		this.label = label;
	}
	public String getLabel() {
		return this.label;
	}
	
	@Override
    public int hashCode() 
    { 
        int hash = (int)label.charAt(0); 
        System.out.println("hashCode for key: "
                           + label + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return label.equals(((Vertex)obj).label); 
    } 
	
}

