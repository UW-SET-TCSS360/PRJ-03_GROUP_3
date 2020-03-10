package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertAll;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import model.Weather;
import view.RainPanel;
import view.TempPanel;
import view.WindPanel;

/**
 * The JUnit test of the Weather class.
 * 
 * @author Brandon Kennedy
 * @version March 9, 2020
 */
public class WeatherTest {

	/**
	 * An instance of the Weather class that will be used for the test.
	 */
	Weather weather;
	
	/**
	 * Set up pre-conditions for the tests.
	 */
	@Before
	public void setUp() {
		weather = new Weather();
	}
	
	/**
	 * Test if the class was not initialized as null.
	 */
	@Test
	public void testNotNull() {
		assertNotNull(weather);
	}
	
	/**
	 * Test the formatValue method of the class with a simple double value
	 */
	@Test
	public void testFormatValue() {
		String formattedValue = Weather.formatValue(30.8);
		assertEquals("Not represented in expected format", "30.8", formattedValue);
	}
	
	/**
	 * Test the formatValue method of the class with a more complex double value
	 */
	@Test
	public void testFormatValue2() {
		String formattedValue = Weather.formatValue(57.7324201946912);
		assertEquals("Not represented in expected format", "57.7", formattedValue);
	}
	
	/**
	 * Test the barTrend method of the class to see if it will not return a null value.
	 */
	@Test
	public void testNullBarTrend() {
		assertNotNull(Weather.barTrend());
	}
	
	/**
	 * Test the barTrend method of the class to see if 
	 * it will return one of 3 random symbols: /\\, \\/, or --.
	 */
	@Test
	public void testBarTrend() {
		String barTrend = Weather.barTrend();
		if (barTrend.equals("/\\") || barTrend.equals("\\/") || barTrend.equals("--")) {
			assertTrue(true);
		} else {
			fail("Symbol is " + barTrend + " and does not match either /\\, \\/, or --");
		}
	}
}
