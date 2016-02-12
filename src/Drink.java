
public class Drink {

	private String size;
	private String type;
	private double price;
	
	public Drink(String drinkSize, String drinkType, double drinkPrice) {
		setSize(drinkSize);
		setType(drinkType);
		setPrice(drinkPrice);
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		 this.size = size;
	}
	
	public  String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		 this.price = price;
	}
	
}
