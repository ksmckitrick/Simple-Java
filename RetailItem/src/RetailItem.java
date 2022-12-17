
public class RetailItem {
	
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem (String description, int unitsOnHand,  double price) {
		this.description=description;
		this.unitsOnHand=unitsOnHand;
		this.price=price;
		
	}

	public String get_description() {
		
		return description;
	}
	
	public int get_unitsOnHand() {
		 
		return unitsOnHand;
	}
	
	public double get_price() {
		
		return price;
	}
}

