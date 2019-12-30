//Kristen Peng
//ID 260782511
public class Fruit extends MarketProduct{
	private double weight;
	//kg
	private int pcPercents;
	//cents
	
	public Fruit (String name, double weight, int pcPercents) {
		super(name);
		this.weight=weight;
		this.pcPercents=pcPercents;
		
	}
	
	public int getCost(){
		int cost;
		double c=0.00;
		double pc=0.00;
		pc=(double)pcPercents;
		c=weight*pc;
		cost=(int) c;
		return cost;
		
	}
	
	public boolean equals(Object o) {
		if (o instanceof Fruit && getName().equals(((Fruit)o).getName()) && getCost()==(((Fruit)o).getCost())&&weight==(((Fruit)o).weight)) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
