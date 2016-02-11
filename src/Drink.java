
public class Drink {

	private static String size;
	private static String type;
	private static double price;
	
	public Drink(String drinkSize, String drinkType) {
		setSize(drinkSize);
		setType(drinkType);
	}
	
	public static String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		 Drink.size = size;
	}
	
	public static String getType() {
		return type;
	}
	
	public void setType(String type) {
		Drink.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public static void setPrice(double price) {
		 Drink.price = price;
	}
	
}
