
public class Orders {
	
	private int orderId;
	private String customerId;
	private String orderDate;
	private String foodName;
	private int quantity;
	
	public Orders(int orderId, String customerId, String orderDate, String foodName, int quantity) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.foodName = foodName;
		this.quantity = quantity;
	}
	

	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		String output = "";
		output += String.format("%-15d %-15d %-15s %-10d %s\n", orderId, customerId,
				orderDate, foodName, quantity);
		return output;
	}
	
}
