import java.util.ArrayList;

public class C206_CaseStudy {

	private static ArrayList<Promotions> promoList = new ArrayList<Promotions>();
	
	public static void main(String[] args) {
		//Food Items
		ArrayList<FoodItems> itemsList = new ArrayList<FoodItems>();
		itemsList.add(new FoodItems(1, "Grilled Chicken Chop", 4));
		itemsList.add(new FoodItems(2, "Fried Chicken Cutlet", 6));
		
		//Promotions
		promoList.add(new Promotions(1, 6,"Laksa", 20, "Monday"));
		promoList.add(new Promotions(2, 4,"Nasi Lemak", 10, "Tuesday"));
		
		int option = 0;

		while (option != 6) {

			menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				//Stalls
				manageStalls();
			} else if (option == 2) {
				//Food Items
				manageFoodItems(itemsList);
			} else if (option == 3) {
				//Purchase Orders
				managePurchaseOrders();
			} else if (option == 4) {
				//Promotions
				managePromotions();
			} else if (option == 5) {
				//Orders
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
	public static void manageFoodItems(ArrayList<FoodItems> itemsList) {
				
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
				viewFoodItems(itemsList);
			}
			else if (choice == 2) {
				FoodItems fi = inputFoodItems(itemsList);
				addFoodItems(itemsList, fi);
			}
			else if (choice == 3) {
				viewFoodItems(itemsList);
				deleteFoodItems(itemsList);
			}
			else if (choice == 4) {
				System.out.println("Back to Home");
			}
			else {
				System.out.println("Invalid choice. Please try again");
			}
		}
	}
	//-------------------------------------------------------------------------------------
	public static String retrieveAllFoodItems(ArrayList<FoodItems> itemsList) {
		String output = "";
		
		for (FoodItems fi : itemsList) {
			output += String.format("%-10d %-25s $%d\n", fi.getFoodId(), fi.getFoodName(), fi.getFoodPrice());
		}
		return output;
	}
	
	public static void viewFoodItems(ArrayList<FoodItems> itemsList) {
		String output = String.format("%-10s %-25s %s\n", "FOOD ID", "NAME", "PRICE");
		if (itemsList.size() == 0) {
			output = "There are no food items available.";
		}
		else {
			output += retrieveAllFoodItems(itemsList);
		}
		System.out.println(output);
	}
	//-------------------------------------------------------------------------------------
	public static FoodItems inputFoodItems(ArrayList<FoodItems> itemsList) {
		String name = Helper.readString("Enter Food Name > ");
		int price = Helper.readInt("Enter Food Price > ");
		
		if (price > 2 && price < 16) {
			FoodItems fi = new FoodItems(itemsList.size() + 1, name, price);
			return fi;
		}
		else {
			return null;
		}
	}
	public static void addFoodItems(ArrayList<FoodItems> itemsList, FoodItems fi) {
		if (fi == null) {
			System.out.println("Food price limit ranges from $3 - $15. Please try again.");
		}
		else {
			itemsList.add(fi);
			System.out.println(String.format("Food Item added!\n"));
		}
		
	}
	//-------------------------------------------------------------------------------------
	public static void deleteFoodItems(ArrayList<FoodItems> itemsList) {
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
	
	// ================================================================== FOR MANAGE FOOD ITEMS (EDISON) ============================================================================
	public static void managePurchaseOrders() {
	
	}
	// ================================================================== FOR MANAGE FOOD ITEMS (HERMAN) ============================================================================
	public static void managePromotions() {
		int choice = -1;
		while (choice != 4) {
	
			setHeader("Manage Promotions");
			System.out.println("1. View Promotions");
			System.out.println("2. Add Promotion");
			System.out.println("3. Delete Promotion");
			System.out.println("4. Back to Canteen Automation System (CAS)");
			choice = Helper.readInt("Enter option > ");
			System.out.println();
			if (choice == 1) {
				viewPromotions();
			}
			else if (choice == 2) {
				String name = Helper.readString("Enter Food Name > ");
				int stall = Helper.readInt("Enter Stall ID > ");
				int percentage = Helper.readInt("Enter discount percentage > ");
				String day = Helper.readString("Enter day of the week > ");
				
				promoList.add(new Promotions(promoList.size() + 1, stall, name, percentage, day));
				System.out.println(String.format("Promotion for " + name + " at stall number " + stall + " on "+ day + " added!\n"));
			}
			else if (choice == 3) {
				viewPromotions();
				int id = Helper.readInt("Enter Promotion ID to delete > ");
				int flag = -1;
				
				for (int i = 0 ; i < promoList.size(); i++) {
					if (promoList.get(i).getPromotionID() == id) {
						promoList.remove(i);
						flag = 1;
					}
				}
				if (flag == -1) {
					System.out.println("Invalid Promotion ID entered!");
				}
				else {
					for (Promotions pr : promoList) {
						if (pr.getPromotionID() > id) {
							pr.setPromotionID(pr.getPromotionID()-1);
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
	
	public static void viewPromotions() {
		String output = String.format("%-15s %-14s %-16s %-10s %s\n", "PROMOTION ID", "STALL NUMBER",  " FOOD ITEM", "OFFER(%)", "DAY OF THE WEEK");
		
		for (Promotions pr : promoList) {
			if (promoList.size() == 0) {
				output = "There are no food items available.";
			}
			else {
				output += String.format("%-15d %-15d %-15s %-10d %s\n", pr.getPromotionID(), pr.getStallID(), pr.getfoodName(), pr.getPromotionPercent(), pr.getDOTW());
			}
		}
		System.out.println(output);
	}
	// ================================================================== FOR MANAGE FOOD ITEMS (SARA) ============================================================================
	public static void manageOrders() {
		
	}
}
