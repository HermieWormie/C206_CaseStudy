
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
	
	// order id
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	// customer's student/staff id
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	// order date
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	// food item name
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	//quantity
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// convert to string
	public String toString() {
		String output = "";
		output += String.format("%-10s %-15s %-15s %-15s %-15s\n", orderId, customerId,
				orderDate, foodName, quantity);
		return output;
	}
	
}
