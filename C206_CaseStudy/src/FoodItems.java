
public class FoodItems {
	private int foodId;
	private String foodName;
	private int foodPrice;
	
	public FoodItems(int foodId, String foodName, int foodPrice) {
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
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
}
