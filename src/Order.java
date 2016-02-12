import java.util.ArrayList;

public class Order {
	
	
	private static ArrayList<Drink> drinkOrder = new ArrayList<>();
	
	public static Drink createDrink(String drinkSize, String drinkType) {
		Drink currentDrink = new Drink(drinkSize, drinkType);
		return currentDrink;
	}
	
	
	public static ArrayList<Drink> getDrinkOrder() {
		return drinkOrder;
	}
	
	public static void setDrinkOrder(Drink currentDrink) {
		drinkOrder.add(currentDrink);
	}
	
}
