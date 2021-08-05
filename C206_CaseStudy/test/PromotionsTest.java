import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PromotionsTest {

	private Promotions p1;
	private Promotions p2;

	private ArrayList<Promotions> promoList;

	public PromotionsTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		p1 = new Promotions(1, 6, "Laksa", 20, "Monday");
		p2 = new Promotions(2, 4, "Nasi Lemak", 10, "Tuesday");

		promoList = new ArrayList<Promotions>();
	}

	@Test
	public void testAddPromotions() {
		assertNotNull("Test if there is valid promotion arraylist to add to", promoList);

		C206_CaseStudy.addPromotionItems(promoList, p1);
		assertEquals("Test if that promotions arraylist size is 1 after adding", 1, promoList.size());

		assertSame("Test that promotions added is same as 1st item of promolist?", promoList.get(0), p1);

		C206_CaseStudy.addPromotionItems(promoList, p2);
		assertEquals("Test that promotions arraylist size is 2 after adding", 2, promoList.size());
	}

	@Test
	public void testViewAllPromotions() {
		assertNotNull("Test if there is valid promotion arraylist to add to", promoList);

		String allPromotions = C206_CaseStudy.retrieveAllPromoItems(promoList);
		String testOutput = "";
		assertEquals("Check that promoList is empty", testOutput, allPromotions);

		C206_CaseStudy.addPromotionItems(promoList, p1);
		C206_CaseStudy.addPromotionItems(promoList, p2);
		assertEquals("Test if that Promotion arraylist size is 2 after adding", 2, promoList.size());

		allPromotions = C206_CaseStudy.retrieveAllPromoItems(promoList);

		testOutput = String.format("%-15d %-15d %-15s %-10d %s\n", 1, 6, "Laksa", 20, "Monday");
		testOutput += String.format("%-15d %-15d %-15s %-10d %s\n", 2, 4, "Nasi Lemak", 10, "Tuesday");

		assertEquals("Test if the added promotions are matching with the promotions in promoList ", testOutput, allPromotions);

	}

	@Test
	public void testDeletePromotions() {
		assertNotNull("Test if there is valid Promotions arraylist to delete from", promoList);

		String allPromotions = C206_CaseStudy.retrieveAllPromoItems(promoList);
		String testOutput = "";
		assertEquals("Check that promoList is empty", testOutput, allPromotions);

		C206_CaseStudy.addPromotionItems(promoList, p1);
		C206_CaseStudy.addPromotionItems(promoList, p2);
		assertEquals("Test if that Promotions arraylist size is 2 after adding", 2, promoList.size());

		allPromotions = C206_CaseStudy.retrieveAllPromoItems(promoList);

		testOutput = String.format("%-15d %-15d %-15s %-10d %s\n", 1, 6, "Laksa", 20, "Monday");
		testOutput += String.format("%-15d %-15d %-15s %-10d %s\n", 2, 4, "Nasi Lemak", 10, "Tuesday");

		assertEquals("Check that promoList is updated with promotions after adding", testOutput, allPromotions);

		C206_CaseStudy.deleteFromPromotions(promoList, p1);
		;
		assertEquals("Test if that Promotions arraylist size is 1 after deleting?", 1, promoList.size());

		allPromotions = C206_CaseStudy.retrieveAllPromoItems(promoList);

		String deleteTest = String.format("%-15d %-15d %-15s %-10d %s\n", 2, 4, "Nasi Lemak", 10, "Tuesday");
		assertEquals("Test if pr1 is deleted and if only pr2 is left in promoList", deleteTest, allPromotions);
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		promoList = null;
	}

}