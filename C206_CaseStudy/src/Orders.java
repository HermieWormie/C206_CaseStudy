import java.util.ArrayList;

public class Orders {
	
	private String customerId;
	private String orderDate;
	private ArrayList<FoodItems> items;
	
	public Orders(String customerId, String orderDate, ArrayList<FoodItems> items) {
		super();
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.items = items;
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

	public ArrayList<FoodItems> getItems() {
		return items;
	}

	public void setItems(ArrayList<FoodItems> items) {
		this.items = items;
	}
	
	public String toString() {
		String output = "";
		output += String.format("%-15s %-20s %-15s", customerId, orderDate, items);
		return output;
	}
	
}
