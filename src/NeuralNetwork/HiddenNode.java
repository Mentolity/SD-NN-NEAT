package NeuralNetwork;

import java.io.Serializable;

public class HiddenNode extends Node implements Serializable{

	private static final long serialVersionUID = -4440628456365235415L;

	public HiddenNode(int id){
		super(id);
	}

	public int getNodeID(){
		return nodeID;
	}

	@Override
	public void fire(){
		double sigmod = sigmod(sumOfIncomingEdges());	//normalize the sum
		if(sigmod >= Math.abs(fireThreshold)){			//if we fire set all output edges to active and update their inputs
			for(Edge e : outgoingEdges){
				if(e.isEnabled()){						//only fire if the edge is enabled
					e.setInput(sigmod);
					e.setActive(true);
				}else{
					e.setActive(false);
				}
			}
		}else{											//if we don't fire set all output edges to be inactive
			for(Edge e : outgoingEdges){
				e.setActive(false);
			}
		}
	}
}
