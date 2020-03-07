package tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import view.TimePanel;

/**
 * tests TimePanel.java
 * @author Trevor Peters March 7th 2020
 * @version March 7th 2020
 */
public class TimePanelTest {
	
	//frame for the panel
	private JFrame testFrame = new JFrame();
	
	/**
	 * tests the constructor
	 */
	@Test
	void constructorTest() {
		assertNotNull(new TimePanel(testFrame));		
	}
}
