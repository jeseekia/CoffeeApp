import java.util.ArrayList;

public class Order {
	
	//The drinkOrder ArrayList is responsible for storing each individual drink order as well as their size, type, and price.
	private static ArrayList<Drink> drinkOrder = new ArrayList<>();
	
	//This method is responsible for creating each Drink object. This method uses the Strings for drinkSize and drinkType in order to calculate the price of the Drink.
	//Once the price is calculated the Drink object is created.
	public static Drink createDrink(String drinkSize, String drinkType) {
		double drinkPrice = Calculations.calculatePrice(drinkType) + Calculations.sizeUpCharge(drinkSize);
		
		Drink currentDrink = new Drink(drinkSize, drinkType, drinkPrice);
		return currentDrink;
	}
	
	//This is the getter for the drinkOrder ArrayList.
	public static ArrayList<Drink> getDrinkOrder() {
		return drinkOrder;
	}
	
	//This is the setter for the drinkOrder ArrayList. This method adds the new Drink object to the drinkOrder ArrayList after it is created.
	public static void setDrinkOrder(Drink currentDrink) {
		drinkOrder.add(currentDrink);
	}
	
	//This method formats the size, type, and price of each individual drink so that it can be presented in the cart panel when the user presses Cart.
	public static String formatOrderLines (String size, String type, String price) {
		String formattedLine = String.format("%-8s%-20s%10s", size, type, price);
		return formattedLine;
	}
}
