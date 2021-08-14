import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StallsTest {
	private Stalls stall1;
	private Stalls stall2;
	
	private ArrayList<Stalls> stallList;
	
	public StallsTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		stall1 = new Stalls(1,"Western","07-08-2021");
		stall2 = new Stalls(2,"Halal","08-08-2021");
		
		stallList = new ArrayList<Stalls>();
		
	}


	@Test
	public void testAddStalls() {
		assertNotNull("Test if there is valid Stalls added to the arraylist to add to" , stallList);
		
		C206_CaseStudy.addStalls(stallList, stall1);
		assertEquals("Test if that Stalls arraylist size is 1?", 1, stallList.size());
		
		assertSame("Test that Food Items is added same as 1st item of the list?", stall1, stallList.get(0));

		C206_CaseStudy.addStalls(stallList, stall1);
		assertEquals("Test that Stalls arraylist size is 2?", 2, stallList.size());
	}
	
	@Test
	public void testViewAllStalls() {
		assertNotNull("Test if there is valid Stalls arraylist to add to", stallList);

		String allStalls= C206_CaseStudy.retrieveAllStalls(stallList);;
		String testOutput = "";
		assertEquals("Check that stallList is empty", testOutput, allStalls);

		C206_CaseStudy.addStalls(stallList, stall1);
		C206_CaseStudy.addStalls(stallList, stall2);
		assertEquals("Test if that Stall arraylist size is 2?", 2, stallList.size());

		allStalls = C206_CaseStudy.retrieveAllStalls(stallList);

		testOutput = String.format("%-10d %-15s %-20s\n",1, "Western", "07-08-2021");
		testOutput += String.format("%-10d %-15s %-20s\n",2, "Halal","08-08-2021");

		assertEquals("Check that stalls in StallList matches with added Stalls", testOutput, allStalls);
	}
	
	@Test
	public void testDeleteStalls() {

				assertNotNull("Test if there is valid Stall arraylist to add to", stallList);
				
				C206_CaseStudy.addStalls(stallList, stall1);
				C206_CaseStudy.addStalls(stallList, stall2);
				assertEquals("Test if that Stalls arraylist size is 2?", 2, stallList.size());
				
				stallList.remove(0);
				assertEquals("Test if the Stall arraylist size is 1?", 1, stallList.size());
				
				stallList.remove(0);
				assertEquals("Test if that Stall arraylist size is 0?", 0, stallList.size());
	}
	
	@After
	public void tearDown() throws Exception {
		stall1 = null;
		stall2 = null;
		stallList = null;
	}

}
