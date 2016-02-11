import java.util.ArrayList;

public class Calculations {

	public static void calculatePrice(String type) {
		switch(type) {
			case "Coffee":
					Drink.setPrice(1.50);
					break;
			case "Latte":
					Drink.setPrice(2.50);
					break;
			case "Espresso":
				Drink.setPrice(2.00);
					break;
			case "Cappuccino":
				Drink.setPrice(2.50);
					break;
		}
		
	}
	
	public static void sizeUpCharge(String size) {
		if(size.equalsIgnoreCase("medium")) {
			Drink.setPrice(Drink.getPrice() + .50);
		}
		else if(size.equalsIgnoreCase("large")) {
			Drink.setPrice(Drink.getPrice() + 1.00);
		}
	}
	
	public static double calculateSalesTax(double subTotal) {
		double salesTax = subTotal * .06;
		return salesTax;
	}
	
//	public static double getSubTotal() {
//		
//		ArrayList<Drink> order = Order.getDrinkOrder();
//		
//		double subTotal = 0;
//		
//		for (int i = 0; i < order.size(); i++) {
//			//order[i]
//		}
//
//		return subTotal;
//	}
}
