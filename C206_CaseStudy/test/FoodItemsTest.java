import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FoodItemsTest {

	private FoodItems fi1;
	private FoodItems fi2;
	
	private ArrayList<FoodItems> itemsList;
	
	public FoodItemsTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		fi1 = new FoodItems(1, "Grilled Chicken Chop", 4);
		fi2 = new FoodItems(1, "Fried Chicken Cutlet", 6);
		
		itemsList = new ArrayList<FoodItems>();
	}

	@Test
	public void testAddFoodItems() {
		assertNotNull("Test if there is valid Food Items arraylist to add to", itemsList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addFoodItems(itemsList, fi1);
		assertEquals("Test if that Food Items arraylist size is 1?", 1, itemsList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Food Items is added same as 1st item of the list?", fi1, itemsList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addFoodItems(itemsList, fi2);
		assertEquals("Test that Food Items arraylist size is 2?", 2, itemsList.size());
	}
	
	@Test
	public void testViewAllFoodItems() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Food Items arraylist to add to", itemsList);

		// test if the list of Food Items retrieved from the SourceCentre is empty
		String allFoodItems= C206_CaseStudy.retrieveAllFoodItems(itemsList);;
		String testOutput = "";
		assertEquals("Check that ViewAllFoodItemslist", testOutput, allFoodItems);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addFoodItems(itemsList, fi1);
		C206_CaseStudy.addFoodItems(itemsList, fi2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, itemsList.size());

		// test if the expected output string same as the list of FoodItems retrieved
		// from the SourceCentre
		allFoodItems = C206_CaseStudy.retrieveAllFoodItems(itemsList);

		testOutput = String.format("%-10d %-25s $%d\n", 1, "Grilled Chicken Chop", 4);
		testOutput += String.format("%-10d %-25s $%d\n", 1, "Fried Chicken Cutlet", 6);

		assertEquals("Check that ViewAllFoodItems", testOutput, allFoodItems);

	}
	
	@Test
	public void testDeleteFoodItems() {
				
		//check if foodlist item is not null, so can delete an item
		assertNotNull("Test if there is valid Food Items arraylist to add to", itemsList);
		
		//after adding 2 items check the foodlist size is 2
		C206_CaseStudy.addFoodItems(itemsList, fi1);
		C206_CaseStudy.addFoodItems(itemsList, fi2);
		assertEquals("Test if that Food Items arraylist size is 2?", 2, itemsList.size());
		
		//after removing one item, check size of foodlist becomes 1
		itemsList.remove(0);
		assertEquals("Test if that Food Items arraylist size is 1?", 1, itemsList.size());
		
		//remove another item, list size becomes 0
		itemsList.remove(0);
		assertEquals("Test if that Food Items arraylist size is 0?", 0, itemsList.size());
	}
	
	@After
	public void tearDown() throws Exception {
		fi1 = null;
		fi2 = null;
		itemsList = null;
	}
}
