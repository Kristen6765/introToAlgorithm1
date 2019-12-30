//Kristen Peng
//ID 260782511
public class Jam extends MarketProduct{

	private int numJars;
	//An int indicating the number of jars.
	private int pcPerjar;
	//An int indicating the price per jar in cents.
	public Jam (String name, int numJars, int pcPerjar) {
		super(name);
		this.numJars=numJars;
		this.pcPerjar=pcPerjar;
		
	}
	
	public int getCost() {
		int cost;
	 cost=numJars*pcPerjar;
		return cost;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Jam && getName().equals(((Jam)o).getName()) && getCost()==(((Jam)o).getCost())&&numJars==(((Jam)o).numJars)) {
		return true;
		}else {
			return false;
		}
		
	}
}
