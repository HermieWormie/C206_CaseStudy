import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class OrdersTest {

	private Orders o1;
	private Orders o2;
	
	private ArrayList<Orders> ordersList;

	
	public OrdersTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		o1 = new Orders(1, "122", "16/8/2021", "Laksa", 3);
		o2 = new Orders(2, "123", "16/8/2021", "Nasi Lemak", 1);

		ordersList = new ArrayList<Orders>();
	}

	@Test
	public void testAddOrders() {
		assertNotNull("Test if there is valid orders arraylist to add to", ordersList);

		C206_CaseStudy.addOrders(ordersList, o1);
		assertEquals("Test if that orders arraylist size is 1 after adding", 1, ordersList.size());

		assertSame("Test that correct order added is same as 1st item of promolist?", ordersList.get(0), o1);

		C206_CaseStudy.addOrders(ordersList, o2);
		assertEquals("Test that orders arraylist size is 2 after adding", 2, ordersList.size());
	}

	@Test
	public void testViewAllOrders() {
		assertNotNull("Test if there is valid orders arraylist to add to", ordersList);

		String allOrders = C206_CaseStudy.retrieveAllOrders(ordersList);
		String testOutput = "";
		assertEquals("Test that orderList is empty", testOutput, allOrders);

		C206_CaseStudy.addOrders(ordersList, o1);
		C206_CaseStudy.addOrders(ordersList, o2);
		assertEquals("Test if that Promotion arraylist size is 2 after adding", 2, ordersList.size());

		allOrders = C206_CaseStudy.retrieveAllOrders(ordersList);

		testOutput = String.format("%-10s %-15s %-15s %-15s %-15s\n", 1, "122", "16/8/2021", "Laksa", 3);
		testOutput += String.format("%-10s %-15s %-15s %-15s %-15s\n", 2, "123", "16/8/2021", "Nasi Lemak", 1);

		assertEquals("Test if the added orders are matching with the orders in ordersList ", testOutput, allOrders);

	}

	@Test
	public void testDeleteOrders() {
		assertNotNull("Test if there is valid orders arraylist to delete from", ordersList);

		String allOrders = C206_CaseStudy.retrieveAllOrders(ordersList);
		String testOutput = "";
		assertEquals("Check that ordersList is empty", testOutput, allOrders);

		C206_CaseStudy.addOrders(ordersList, o1);
		C206_CaseStudy.addOrders(ordersList, o2);
		assertEquals("Test if that orders arraylist size is 2 after adding", 2, ordersList.size());

		allOrders = C206_CaseStudy.retrieveAllOrders(ordersList);

		testOutput = String.format("%-10s %-15s %-15s %-15s %-15s\n", 1, "122", "16/8/2021", "Laksa", 3);
		testOutput += String.format("%-10s %-15s %-15s %-15s %-15s\n", 2, "123", "16/8/2021", "Nasi Lemak", 1);

		assertEquals("Check that ordersList is updated with orders after adding", testOutput, allOrders);

		ordersList.remove(0);
		assertEquals("Test if that orders arraylist size is 1 after deleting", 1, ordersList.size());

		allOrders = C206_CaseStudy.retrieveAllOrders(ordersList);

		String deleteTest = String.format("%-10s %-15s %-15s %-15s %-15s\n", 2, "123", "16/8/2021", "Nasi Lemak", 1);
		assertEquals("Test if o1 is deleted and if only o2 is left in ordersList", deleteTest, allOrders);
	}

	@After
	public void tearDown() throws Exception {
		o1 = null;
		o2 = null;
		ordersList = null;
	}

}