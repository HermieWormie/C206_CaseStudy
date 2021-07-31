
public class Promotions {
	private int promotionID;
	private String foodName;
	private int promotionPercent;
	private int promotionDays;
	
	public Promotions(int promotionID, String foodName, int promotionPercent, int promotionDays) {
		this.promotionID = promotionID;
		this.foodName = foodName;
		this.promotionPercent = promotionPercent;
		this.promotionDays = promotionDays;
	}
	
	//ID
	public int getPromotionID() {
		return promotionID;
	}

	public void setPromotionID(int promotionID) {
		this.promotionID = promotionID;
	}
	
	//Name
	public String getPromotionName() {
		return foodName;
	}

	public void setPromotionName(String promotionName) {
		this.foodName = promotionName;
	}
	
	//Percentage
	public int getPromotionPercent() {
		return promotionPercent;
	}

	public void setPromotionPercent(int promotionPercent) {
		this.promotionPercent = promotionPercent;
	}
	
	//Duration
	public int getPromotionDays() {
		return promotionDays;
	}
	
	public void setPromotionDays(int promotionDays) {
		this.promotionDays = promotionDays;
	}
	
	
}
