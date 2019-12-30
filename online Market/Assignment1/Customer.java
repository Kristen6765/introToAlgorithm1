//Kristen Peng
//ID 260782511
public class Customer {
	private String name;
	private int balance;
	private Basket goods;
	
	public Customer(String nameCustomer, int initialBalance) {
		goods=new Basket();
		name=nameCustomer;
		balance=initialBalance;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		
		//System.out.println("test balance"+balance);
		return balance;
	}
	
	public Basket getBasket() {
		return goods;
	}
	
	public int addFunds(int input)throws IllegalArgumentException {
		
		if(input<0) {
			throw(new IllegalArgumentException("you can't add negative funds"));
		}
		
		
		
		balance=getBalance()+input;
		return balance;
		
	}
	
	public void addToBasket(MarketProduct mp) {
		goods.add(mp);
		
	}
	public boolean removeFromBasket(MarketProduct mp) {
		boolean b=goods.remove(mp);
		return b;
		
	}
	public String checkOut()throws IllegalStateException  {
		    int cost=goods.getTotalCost();
		     
		    if(balance<cost)
		       throw (new IllegalStateException());
		    balance=balance-cost;
		       String s=goods.toStirng();
		     // System.out.println(s);
		       goods.clear();
		    //   System.out.println(s);
		      return s;  
		      

		
		
	}
}
