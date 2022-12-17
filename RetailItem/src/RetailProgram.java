
public class RetailProgram {

	public static void main(String[] args) {
	
		RetailItem item1=new RetailItem("Jacket", 12, 59.95);
		RetailItem item2=new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3=new RetailItem("Shirt", 20, 24.95);

		System.out.println(item1.get_description()+" "+item1.get_unitsOnHand()+" "+item1.get_price());
		System.out.println(item2.get_description()+" "+item2.get_unitsOnHand()+" "+item2.get_price());
		System.out.println(item3.get_description()+" "+item3.get_unitsOnHand()+" "+item3.get_price());
	}

}
