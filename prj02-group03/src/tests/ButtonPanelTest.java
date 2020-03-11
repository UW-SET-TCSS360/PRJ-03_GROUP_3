package tests;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import view.ButtonPanel;

class ButtonPanelTest
{
	private ButtonPanel buttonPanel;
	
	@BeforeEach
	public void setUp()
	{
		buttonPanel = new ButtonPanel(new JFrame());
	}
	
	@Test
	public void testConstructor()
	{
		assertNotNull(new ButtonPanel(new JFrame()));
	}
	
	@Test
	public void testGetter()
	{
		assertNotNull(buttonPanel.getButtons());
	}

}
