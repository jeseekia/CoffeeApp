import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculations {

//This method is responsible for calculating the base price of the drink, it uses the String type as a parameter. 
	//Each drink has a specific price which is set in the double typePrice.
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
//This method adds an up charge to the price of the drink if the user decides to order a medium or a large sized drink.
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

	//This method calculates the 6 % sales tax from the subtotal price of all the drinks ordered.
	public static double calculateSalesTax() {
		double salesTax = getSubTotal() * .06;
		return salesTax;
	}

	//This method calculates the subtotal by looping through all of the drinks the user ordered and adding their prices together.
	public static double getSubTotal() {
	//The ArrayList<Drink> order stores all of the individual drinks ordered by the user.
		ArrayList<Drink> order = Order.getDrinkOrder();
		double subTotal = 0;
		
		for (int i = 0; i < order.size(); i++){
			Drink currentDrink = order.get(i);
			subTotal += currentDrink.getPrice();
		}
		return subTotal;
	}

	//This method calculates the total price by adding together the subtotal and the sales tax 	
	public static double getTotal() {
		double subTotal = getSubTotal();
		double salesTax = calculateSalesTax();
		return subTotal + salesTax;
	}
	
	//This method formats any double to two decimal places and adds a $ in front of the number.
	public static String formatNumber(double x) {
		DecimalFormat formatter = new DecimalFormat("$#0.00");
		String formattedNumber = formatter.format(x);
		return formattedNumber;
	}
	
	//This method formats the subtotal to two decimal places.
	public static String getFormattedSubTotal() {
		return formatNumber(getSubTotal());
	}
	
	//This method formats the total to two decimal places.
	public static String getFormattedTotal() {
		return formatNumber(getTotal());
	}
	
	//This method formats the calculated sales tax to two decimal places.
	public static String getFormattedTax() {
		return formatNumber(calculateSalesTax());
	}
	
}
