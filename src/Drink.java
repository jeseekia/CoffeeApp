
public class Drink {

	private String size;
	private String type;
	private double price;
	
	//This constructor is responsible for creating each drink object it uses the drinkSize, drinkType, and drinkPrice as parameters.
	//The drinkPrice is calculated after first finding the drinkSize and drinkType.
	public Drink(String drinkSize, String drinkType, double drinkPrice) {
		setSize(drinkSize);
		setType(drinkType);
		setPrice(drinkPrice);
	}
	
	//This is the getter for the String size. The return for size is determined by which button the user presses Small, Medium, or Large in the order panel.
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		 this.size = size;
	}
	
	//This is the getter for the String type. The return for type is determined by which drink button the user presses.
	//The choices are either Coffee, Cappuccino, Espresso, Frappuccino, Latte, and Iced Coffee.
	public  String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	//The price is determined by the type and size that the user selects. The calculations for price are shown in the Calculations class.
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		 this.price = price;
	}
	
}
