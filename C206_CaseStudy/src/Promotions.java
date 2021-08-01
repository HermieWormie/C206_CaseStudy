
public class Promotions {
	private int promotionID;
	private int stallID;
	private String foodName;
	private int promotionPercent;
	private String promotionDOTW;
	
	public Promotions(int promotionID, int stallID, String foodName, int promotionPercent, String promotionDOTW) {
		this.promotionID = promotionID;
		this.stallID = stallID;
		this.foodName = foodName;
		this.promotionPercent = promotionPercent;
		this.promotionDOTW = promotionDOTW;
	}
	
	//ID
	public int getPromotionID() {
		return promotionID;
	}

	public void setPromotionID(int promotionID) {
		this.promotionID = promotionID;
	}
	
	//Name
	public String getfoodName() {
		return foodName;
	}

	public void setfoodName(String promotionName) {
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
	public String getDOTW() {
		return promotionDOTW;
	}
	
	public void setDOTW(String promotionDOTW) {
		this.promotionDOTW = promotionDOTW;
	}
	
	//Stall ID
	public int getStallID() {
		return stallID;
	}

	public void setStallID(int stallID) {
		this.stallID = stallID;
	}
	
	
}
