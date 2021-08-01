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

	public void setUp() throws Exception {
		p1 = new Promotions(1, 6, "Laksa", 20, "Monday");
		p2 = new Promotions(2, 4, "Nasi Lemak", 10, "Tuesday");

		promoList = new ArrayList<Promotions>();
	}

	@Before
	public void testAddPromotions() {
		assertNotNull("Test if there is valid Food Items arraylist to add to", promoList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addPromotionItems(promoList, p1);
		assertEquals("Test if that Food Items arraylist size is 1?", 1, promoList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Food Items is added same as 1st item of the list?", p1, promoList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addPromotionItems(promoList, p2);
		assertEquals("Test that Food Items arraylist size is 2?", 2, promoList.size());
	}

	@Test
	public void c206_test() {

	}

	@After
	public void tearDown() throws Exception {
	}

}