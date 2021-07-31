
public class FoodItems {
	private int foodId;
	private String foodName;
	private double foodPrice;
	
	public FoodItems(int foodId, String foodName, double foodPrice) {
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	
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
	public int getFoodId() {
		return foodId;
	}	
}
