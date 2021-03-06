package g53sqm.cw2;


import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WebPropertiesTest {
	
	WebProperties Properties=new WebProperties();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPropValues() throws IOException {
String Line = System.getProperty("line.separator");
		
		String str = ("Created by  Eric Chiong. "+
				Line+ "port = 8088"+
				Line+ "log_file = Log"+
				Line+ "console_logging_status =enable"); 

		String generated = Properties.getPropValues();
		org.junit.Assert.assertEquals(str, generated);
	}

}