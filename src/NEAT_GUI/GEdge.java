package NEAT_GUI;
/*
 * Swing classes
 * =========================
 * JComponent: Swing component to be visualized (GEdge)
 */
import javax.swing.JComponent;

/*
 * Class representing visualization of a connection gene
 * 
 * GEdge(GNode n1, GNode n2, float w): Constructor for GEdge object
 * getWeight(): returns weight of GEdge
 * getStartNode(): returns starting GNode of GEdge
 * getEndNode(): returns ending GNode of GEdge
 */
public class GEdge extends JComponent{

	private float weight;
	private GNode startNode, endNode;
	
	public GEdge(GNode n1, GNode n2, float w){
		weight = w;
		startNode = n1;
		endNode = n2;
	}
	
	public float getWeight(){
		return weight;
	}
	
	public GNode getStartNode(){
		return startNode;
	}
	
	public GNode getEndNode(){
		return endNode;
	}
}