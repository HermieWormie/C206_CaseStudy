
public class FoodItems {
	private String foodId;
	private String foodName;
	private double foodPrice;
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodId() {
		return foodId;
	}
	public void display() {
		System.out.println(String.format("%s %.2f", foodName, foodPrice));
	}	
}
