
public class Orders {
	
	private int orderId;
	private String customerId;
	private String orderDate;
	private String items;
	private int quantity;
	
	public Orders(int orderId, String customerId, String orderDate, String items, int quantity) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.items = items;
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

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		String output = "";
		output += String.format("%-15s %-20s %-15s", customerId, orderDate, items);
		return output;
	}
	
}
