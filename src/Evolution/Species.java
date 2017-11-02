package Evolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Species{
	int generationsWithoutImprovement = 0;
	double maxFitness = 0;
	NEATNetwork firstNN;
	
	ArrayList<NEATNetwork> population = new ArrayList<NEATNetwork>();
	
	public Species(){
		this(null);
	}
	
	public Species(NEATNetwork nn){
		if(nn != null){
			population.add(nn);
			firstNN = nn;
		}
	}
	
	public NEATNetwork getFirstNN(){
		return firstNN;
	}
	
	public void setFirstNN(NEATNetwork nn){
		firstNN = nn;
	}
	
	public void add(NEATNetwork nn){
		population.add(nn);
	}
	
	public void removeLowest(){
		int lowestIndex = 0;
		double lowestFitness = 0;
		
		for(int i=0; i<population.size(); i++){
			if(population.get(i).getCurrentFitness() <= lowestFitness){
				lowestIndex = i;
				lowestFitness = population.get(i).getCurrentFitness();
			}
				
		}
	}
	
	public int size(){
		return population.size();
	}
	
	public int getGenerationsWithoutImprovement(){
		return generationsWithoutImprovement;
	}
	
	public void incGenerationsWithoutImprovement(){
		generationsWithoutImprovement++;
	}
	
	public void resetGenerationsWithoutImprovement(){
		generationsWithoutImprovement = 0;
	}
	
	public double getMaxFitness(){
		return maxFitness;
	}
	
	public void updateMaxFitness(double fitness){
		maxFitness = fitness;
	}
	
	public ArrayList<NEATNetwork> getPopulation(){
		return population;
	}
	
	public void sortPopulation(){	//sorts population from Highest to Lowest
		Collections.sort(population, new Comparator<NEATNetwork>() {
			@Override
			public int compare(NEATNetwork nn1, NEATNetwork nn2){
				return Double.compare(nn2.getCurrentFitness(), nn1.getCurrentFitness());
			}
		});
	}
}

