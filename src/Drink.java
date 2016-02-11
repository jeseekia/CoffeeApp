
public class Drink {

	private static String size;
	private static String type;
	private static double price;
	
	public Drink(String size, String type) {
		
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
	
	public static void calculatePrice(String type, String size) {
		double price = 0.0;
		switch(getType()) {
			case "Coffee":
					price = 1.50;
					break;
			case "Latte":
					price = 2.50;
					break;
			case "Espresso":
					price = 2.00;
					break;
			case "Cappuccino":
					price = 2.50;
					break;
		}
		
		switch(getSize()) {
			case "Small":
				break;
			case "Medium":
				price += 0.50;
				break;
			case "Large":
				price += 1.00;
				break;
		}
		setPrice(price);
		
	}
}
