
public class SoftwareSales {
	
	int units;
	double retail=99;
	double discount;
	double cost;

	public SoftwareSales (int units) {
		this.units=units;
	}
	
	public double get_cost() {
		
		if (units>=100) {
			
			discount=.5;
		}
		
		else if (units<=99 && units >=50) {
			
			discount=.4;
		}
		
		else if (units<=49 && units >=20) {
			
			discount=.3;
		}
		
		else if (units<=19 && units >=10) {
			
			discount=.2;
		}
		
		else {
			
			discount=1;
		}
		
		cost = (units *retail * discount);
		
		return cost;
		
	}
	
	//Main Function//
	
	public static void main(String[] args) {
		
		SoftwareSales cost = new SoftwareSales(10);
		
		System.out.println(cost.get_cost());
	}
}
