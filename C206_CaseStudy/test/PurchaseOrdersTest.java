import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PurchaseOrdersTest {
	
	private PurchaseOrders PO1;
	private PurchaseOrders PO2;
	
	private ArrayList<PurchaseOrders> pOrdersList;
	
	public PurchaseOrdersTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		PO1 = new PurchaseOrders(1, "Fishball", 3);
		PO2 = new PurchaseOrders(2, "Hotdog", 5);

		pOrdersList = new ArrayList<PurchaseOrders>();
	}
	
	public void testAddPurchaseOrders() {
		assertNotNull("Test if there is a valid purchase order arraylist to add to", pOrdersList);

		C206_CaseStudy.addPurchaseOrders(pOrdersList, PO1);
		assertEquals("Test if that purchase orders arraylist size is 1 after adding", 1, pOrdersList.size());

		assertSame("Test that correct purchase order added is same as 1st item of pOrdersList?", pOrdersList.get(0), PO1);

		C206_CaseStudy.addPurchaseOrders(pOrdersList, PO2);
		assertEquals("Test that purchase orders arraylist size is 2 after adding", 2, pOrdersList.size());
	}

	@Test
	public void testViewAllPurchaseOrders() {
		assertNotNull("Test if there is valid purchase orders arraylist to add to", pOrdersList);

		String allPOrders = C206_CaseStudy.retrieveAllPurchaseOrders(pOrdersList);
		String testOutput = "";
		assertEquals("Test that pOrdersList is empty", testOutput, allPOrders);

		C206_CaseStudy.addPurchaseOrders(pOrdersList, PO1);
		C206_CaseStudy.addPurchaseOrders(pOrdersList, PO2);
		assertEquals("Test if that purchase orders arraylist size is 2 after adding", 2, pOrdersList.size());

		allPOrders = C206_CaseStudy.retrieveAllPurchaseOrders(pOrdersList);

		testOutput += String.format("%-10s %-15s %-15s\n", 1, "Fishball", 3);
		testOutput += String.format("%-10s %-15s %-15s\n", 2, "Hotdog", 5);

		assertEquals("Test if the added purchase orders are matching with the purchase orders in pOrdersList ", testOutput, allPOrders);

	}

	@Test
	public void testDeletePurchaseOrders() {
		assertNotNull("Test if there is valid purchase orders arraylist to delete from", pOrdersList);

		String allPOrders = C206_CaseStudy.retrieveAllPurchaseOrders(pOrdersList);
		String testOutput = "";
		assertEquals("Check that pOrdersList is empty", testOutput, allPOrders);

		C206_CaseStudy.addPurchaseOrders(pOrdersList, PO1);
		C206_CaseStudy.addPurchaseOrders(pOrdersList, PO2);
		assertEquals("Test if that orders arraylist size is 2 after adding", 2, pOrdersList.size());

		allPOrders = C206_CaseStudy.retrieveAllPurchaseOrders(pOrdersList);

		testOutput = String.format("%-10s %-15s %-15s\n", 1, "Fishball", 3);
		testOutput = String.format("%-10s %-15s %-15s\n", 2, "Hotdog", 5);

		assertEquals("Check that pOrdersList is updated with purchase orders after adding", testOutput, allPOrders);

		pOrdersList.remove(0);
		assertEquals("Test if that purchase orders arraylist size is 1 after deleting", 1, pOrdersList.size());

		allPOrders = C206_CaseStudy.retrieveAllPurchaseOrders(pOrdersList);

		String deleteTest = String.format("%-10s %-15s %-15s\n", 2, "Hotdog", 5);
		assertEquals("Test if PO1 is deleted and if only PO2 is left in pOrdersList", deleteTest, allPOrders);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}