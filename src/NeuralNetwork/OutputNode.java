package NeuralNetwork;

import java.io.Serializable;

public class OutputNode extends Node implements Serializable{
	private static final long serialVersionUID = -2532734913521168794L;
	Boolean fired = false;
	public OutputNode(int id){
		super(id);
		outgoingEdges = null;	//Output nodes don't have outgoing edges
	}

	@Override
	public void fire(){	//if incoming edge fires activate output
		double sigmod = sigmod(sumOfIncomingEdges());
		
		if(sigmod >= Math.abs(fireThreshold)){
			fired = true;
		}else{
			fired = false;
		}
	}
	
	public boolean checkFired(){
		return fired;
	}
}
