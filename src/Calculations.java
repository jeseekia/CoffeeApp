import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculations {

	public static double calculatePrice(String type) {
		double typePrice = 0;
		type = type.toLowerCase();
		switch(type) {
			case "coffee":
				typePrice = 1.50;
				break;
			case "latte":
				typePrice = 2.50;
				break;
			case "espresso":
				typePrice = 2.00;
				break;
			case "cappuccino":
				typePrice = 2.50;
				break;
			case "frappuccino":
				typePrice = 2.50;
				break;
			case "iced coffee":
				typePrice = 2.00;
				break;
		}
		return typePrice;
		
	}
	
	public static double sizeUpCharge(String size) {
		double sizePrice = 0;
		
		if(size.equalsIgnoreCase("medium")) {
			sizePrice = 0.50;
		}
		else if(size.equalsIgnoreCase("large")) {
			sizePrice = 1.00;
		}
		return sizePrice;
	}
	
	public static double calculateSalesTax() {
		double salesTax = getSubTotal() * .06;
		return salesTax;
	}
	
	public static double getSubTotal() {
		ArrayList<Drink> order = Order.getDrinkOrder();
		double subTotal = 0;
		
		for (int i = 0; i < order.size(); i++){
			Drink currentDrink = order.get(i);
			subTotal += currentDrink.getPrice();
		}
		return subTotal;
	}
	
	public static double getTotal() {
		double subTotal = getSubTotal();
		double salesTax = calculateSalesTax();
		return subTotal + salesTax;
	}
	
	public static String formatNumber(double x) {
		DecimalFormat formatter = new DecimalFormat("$#0.00");
		String formattedNumber = formatter.format(x);
		return formattedNumber;
	}
	
	public static String getFormattedSubTotal() {
		return formatNumber(getSubTotal());
	}
	
	public static String getFormattedTotal() {
		return formatNumber(getTotal());
	}
	
	public static String getFormattedTax() {
		return formatNumber(calculateSalesTax());
	}
	
}
