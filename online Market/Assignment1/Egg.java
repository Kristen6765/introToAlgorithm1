//Kristen Peng
//ID 260782511
public class Egg extends MarketProduct{

	private int numEggs;
	private int pc12Eggs;
	
	public Egg(String name, int num, int pc4dozen){
		super(name);
		//assign name to the  MarketProduct constructor
		numEggs=num;
		pc12Eggs=pc4dozen;
	}
	
	
	public int getCost() {
		int cost=0;
		double c=0.00;
		double pc=pc12Eggs;
		double num=numEggs;
		c=(pc/12)*num;
		cost=(int)c;
		return cost;
		
	}
	
	public boolean equals(Object o){
		if (o instanceof Egg && getName().equals(((Egg)o).getName()) && getCost()==(((Egg)o).getCost())&&numEggs==(((Egg)o).numEggs)) {
			return true;
			}
		
		else {
			return false;
		}
		
	}
}
