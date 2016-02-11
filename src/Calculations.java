
public class Calculations {

	public static void calculatePrice(Drink drink1) {
		switch(drink1.getType()) {
			case "Coffee":
					drink1.setPrice(1.50);
					break;
			case "Latte":
					drink1.setPrice(2.50);
					break;
			case "Espresso":
				drink1.setPrice(2.00);
					break;
			case "Cappuccino":
				drink1.setPrice(2.50);
					break;
		}
		
	}
	
	public static void sizeUpCharge(Drink drink1) {
		if(drink1.getSize().equalsIgnoreCase("medium")) {
			drink1.setPrice(drink1.getPrice() + .50);
		}
		else if(drink1.getSize().equalsIgnoreCase("large")) {
			drink1.setPrice(drink1.getPrice() + 1.00);
		}
	}
	
	public static double calculateSalesTax(double subTotal) {
		double salesTax = subTotal * .06;
		return salesTax;
	}
}
