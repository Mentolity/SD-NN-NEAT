package NeuralNetwork;

import java.io.Serializable;
import java.util.ArrayList;

public class Layer <E> implements Serializable{
	private static final long serialVersionUID = 9152939717158522602L;
	ArrayList<E> nodeList = new ArrayList<E>();

	public E get(int i){
		return nodeList.get(i);
	}

	public void add(E n){
		nodeList.add(n);
	}

	public void remove(E n){
		nodeList.remove(n);
	}

	public ArrayList<E> getNodeList(){
		return nodeList;
	}
}
