import java.util.ArrayList;

public class Order {
	
	
	//public static ArrayList<Drink> drinkOrder = new ArrayList<>();
	
	public static Drink createDrink() {
		String drinkSize = "";
		String drinkType = "";
		Drink currentDrink = new Drink(drinkSize, drinkType);
		return currentDrink;
	}
	
//	public static ArrayList<Drink> getDrinkOrder() {
//		return drinkOrder;
//	}
	
}