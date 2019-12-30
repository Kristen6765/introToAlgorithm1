//Kristen Peng
//ID 260782511
public abstract class MarketProduct {

	private String name;
	
	public MarketProduct(String name) {
		this.name=name;
	}
	
	public final String getName() {
		return name;
	}
	
	public abstract int getCost();

	public abstract boolean equals(Object o);
	


}
