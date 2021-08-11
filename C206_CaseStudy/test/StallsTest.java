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
		
	}


	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}