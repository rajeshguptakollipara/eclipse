package flight;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFlight {

	@Test
	public void test() {
		flight te = new flight();
		int result=te.addnum(10, 20);
		assertTrue(result==30);
		//this is for junit testing
		
	}

}
