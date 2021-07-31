import java.util.ArrayList;

public class C206_CaseStudy {

	private static ArrayList<FoodItems> itemsList = new ArrayList<FoodItems>();
	
	public static void main(String[] args) {
		itemsList.add(new FoodItems(1, "Grilled Chicken Chop", 2.50));
		itemsList.add(new FoodItems(2, "Fried Chicken Cutlet", 2.80));
		int option = 0;

		while (option != 6) {

			menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				manageStalls();
			} else if (option == 2) {
				manageFoodItems();
			} else if (option == 3) {
				managePurchaseOrders();
			} else if (option == 4) {
				managePromotions();
			} else if (option == 5) {
				manageOrders();
			} else if (option == 6) {
				System.out.println("Thanks for using this application!");
			} else {
				System.out.println("Invalid option!");
			}
			System.out.println();
		}
	}

	public static void menu() {
		setHeader("Canteen Automation System (CAS)");
		System.out.println("1. Manage Stalls");
		System.out.println("2. Manage Food Items");
		System.out.println("3. Manage Purchase Orders");
		System.out.println("4. Manage Promotions");
		System.out.println("5. Manage Orders");
		System.out.println("6. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	// ====================================================================== FOR MANAGE STALLS (DON) ===============================================================================
	public static void manageStalls() {
		
	}
	// ================================================================== FOR MANAGE FOOD ITEMS (WANYING) ============================================================================
	public static void manageFoodItems() {
				
		int choice = -1;
		while (choice != 4) {
			setHeader("Manage Food Items");
			System.out.println("1. View Food Items");
			System.out.println("2. Add New Food Items");
			System.out.println("3. Delete Food Items");
			System.out.println("4. Back to Canteen Automation System (CAS)");
			choice = Helper.readInt("Enter option > ");
			System.out.println();
			if (choice == 1) {
				viewFoodItems();
			}
			else if (choice == 2) {
				String name = Helper.readString("Enter Food Name > ");
				double price = Helper.readDouble("Enter Food Price > ");
				
				itemsList.add(new FoodItems(itemsList.size() + 1, name, price));
				System.out.println(String.format("Food Item, %s added!\n", name));
			}
			else if (choice == 3) {
				viewFoodItems();
				int id = Helper.readInt("Enter Food ID to delete > ");
				boolean match = false;
				for (int i = 0 ; i < itemsList.size(); i++) {
					if (itemsList.get(i).getFoodId() == id) {
						itemsList.remove(i);
						match = true;
					}
				}
				if (!match) {
					System.out.println("Invalid Food ID entered!");
				}
				else {
					for (FoodItems fi : itemsList) {
						if (fi.getFoodId() > id) {
							fi.setFoodId(fi.getFoodId()-1);
						}
					}
					System.out.println("Food ID " + id+ " Deleted!");
				}
				
			}
			else if (choice == 4) {
				System.out.println("Back to Home");
			}
			else {
				System.out.println("Invalid choice. Please try again");
			}
		}
	}
	public static void viewFoodItems() {
		String output = String.format("%-10s %-25s %s\n", "FOOD ID", "NAME", "PRICE");
		
		for (FoodItems fi : itemsList) {
			if (itemsList.size() == 0) {
				output = "There are no food items available.";
			}
			else {
				output += String.format("%-10d %-25s $%.2f\n", fi.getFoodId(), fi.getFoodName(), fi.getFoodPrice());
			}
		}
		System.out.println(output);
	}
	
	// ================================================================== FOR MANAGE FOOD ITEMS (EDISON) ============================================================================
	public static void managePurchaseOrders() {
	
	}
	// ================================================================== FOR MANAGE FOOD ITEMS (HERMAN) ============================================================================
	public static void managePromotions() {
	
	}
	// ================================================================== FOR MANAGE FOOD ITEMS (SARA) ============================================================================
	public static void manageOrders() {
		
	}
}
