//Kristen Peng
//ID 260782511
public class SeasonalFruit extends Fruit{
	
	public SeasonalFruit(String name, double weight, int pc4kg) {
		super(name, weight, pc4kg);
		
	}

	public int getCost() {
		int cost;
		cost=super.getCost();
		//getCost is not static, have to use super
		cost=(int)(cost*0.85);
		return cost;
	}
}
