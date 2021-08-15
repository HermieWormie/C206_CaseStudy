public class PurchaseOrders {
	private int pOrdersID;
	private int quantity;
	private String ingredientName;
	
	public PurchaseOrders(int pOrdersID, int quantity, String ingredientName) {
		this.pOrdersID = pOrdersID;
		this.quantity = quantity;
		this.ingredientName = ingredientName;
	}

	public int getPOrdersID() {
		return pOrdersID;
	}

	public void setPOrdersID(int pOrdersID) {
		this.pOrdersID = pOrdersID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
}