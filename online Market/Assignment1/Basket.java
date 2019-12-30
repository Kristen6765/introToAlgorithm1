
//Kristen Peng
//ID 260782511
public class Basket {
	private MarketProduct[] mp;
	
	public Basket() {
		mp= new MarketProduct[0];
		//mp= new MarketProduct[0];
		
	}
	public MarketProduct[] getProducts() {
		MarketProduct[] shallowCopy= new MarketProduct[mp.length];
		for(int i=0; i<mp.length; i++)
		{
			shallowCopy[i]=mp[i];
		}
		return shallowCopy;
	}
	
	public void add(MarketProduct m) {
	MarketProduct[] newmp=new MarketProduct[mp.length+1];
	    int i;
		for( i=0; i<mp.length; i++) {
			newmp[i]=mp[i];
		}
		newmp[i]=m;
		mp=newmp;

	
	
	}
	
	public boolean remove(MarketProduct m) {
		int pos=0,i;
		for(i=0; i<mp.length;i++) {
			if(mp[i].equals(m)) { 
		
			 break;
			}
		}	
			pos=i;
			
			if(pos==mp.length) {
				return false;
			}
			
		
		while((pos+1)<mp.length) {
			mp[pos]=mp[pos+1];
			pos++;
		}
		MarketProduct[] newmp=getProducts();
	    mp=new MarketProduct[newmp.length-1];
		for(i=0; i<mp.length; i++) {
			mp[i]=newmp[i];
		}
		return true;
		
		
	}
	
	public void clear() {
		mp=new MarketProduct [0];
		
	
	}
	
	public int getNumOfProducts() {
		int counter=0;
		for(int i=0; i<mp.length;i++) {
			
				counter ++;
			
		}
		return counter;
		
		
	}
	
	public int getSubTotal() {
		int cost=0;
		for(int i=0; i<mp.length; i++) {
			
				cost= cost+mp[i].getCost();
			
		}
		return cost;
		
	}
	
	public int getTotalTax() {
		int tax=0;
		int i;
		for(i=0;i<mp.length;i++) {
				if(mp[i] instanceof Jam)
					tax+=mp[i].getCost()*0.15;
	}
		return tax;
	}

		
		
	
	
	public int getTotalCost() {
		int tcost=getSubTotal()+getTotalTax();
		
		return tcost;
		
	}
	public String DollarHelper(int cents) {
		String c=null;
		double x;
		if (cents<=0) {
			 c="-";
			 return c;
		}
		else {
			x=(double)cents/100.00;
			c=String.format("%.2f",x);
			return c;
		}
	}
	
	public String toStirng() {
		String s="";
		for(int i=0; i<mp.length;i++) {
			 s= s+ mp[i].getName()+"\t"+DollarHelper(mp[i].getCost())+"\n";
			
		}
		s=s+"\n";
		
		s=s+"SubTotal\t"+DollarHelper(getSubTotal())+"\n";
		s=s+"Total Tax\t"+DollarHelper(getTotalTax())+"\n";
		s=s+"\n";
		s=s+"Total Cost\t"+DollarHelper(getTotalCost());
		return s;
		
		
		
		
		
		
		
		
		
		
	}

	
}