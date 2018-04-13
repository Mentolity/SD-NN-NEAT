package Evolution;

import java.io.Serializable;

import NeuralNetwork.Node;

public class NodeGene implements Serializable{

	private static final long serialVersionUID = -562174731752028309L;

	enum NodeType{
		SENSOR, HIDDEN, OUTPUT
	}


	Node node;
	NodeType nodeType;

	public NodeGene(Node n, NodeType type){
		node = n;
		nodeType = type;
	}

	Node getNode(){
		return node;
	}

	NodeType getNodeType(){
		return nodeType;
	}

	public String toString(){
		return this.nodeType + "";
	}
}
