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
		
		// last stopped here as of 6.23pm 11/8/2021 - DON YEO
	}
	
	public void testViewAllStalls() {
		
	}
	
	public void testDeleteStalls() {
		
	}
	
	@After
	public void tearDown() throws Exception {
		stall1 = null;
		stall2 = null;
		stallList = null;
	}

}