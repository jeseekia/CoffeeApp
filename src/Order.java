import java.util.ArrayList;

public class Order {
	
	
	private static ArrayList<Drink> drinkOrder = new ArrayList<>();
	
	public static Drink createDrink(String drinkSize, String drinkType) {
		double drinkPrice = Calculations.calculatePrice(drinkType) + Calculations.sizeUpCharge(drinkSize);
		
		Drink currentDrink = new Drink(drinkSize, drinkType, drinkPrice);
		return currentDrink;
	}
	
	
	public static ArrayList<Drink> getDrinkOrder() {
		return drinkOrder;
	}
	
	public static void setDrinkOrder(Drink currentDrink) {
		drinkOrder.add(currentDrink);
	}
	
	public static String formatOrderLines (String size, String type, String price) {
		String formattedLine = String.format("%-8s%-20s%10s", size, type, price);
		return formattedLine;
	}
}
