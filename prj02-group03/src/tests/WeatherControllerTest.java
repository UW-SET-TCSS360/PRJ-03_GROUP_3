package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import controller.WeatherController;

/**
 * A JUnit test for the WeatherController class.
 * 
 * @author Brandon Kennedy
 * @version March 9, 2020
 */
public class WeatherControllerTest {

	/**
	 * An instance of the WeatherController class that will be used for the test.
	 */
	WeatherController controller;
	
	/**
	 * Set up pre-conditions for the test.
	 */
	@Before
	public void setUp() {
		controller = new WeatherController();
	}
	
	/**
	 * Test if the class was not initialized as null.
	 */
	@Test
	public void testNotNull() {
		assertNotNull(controller);
	}
	
}
