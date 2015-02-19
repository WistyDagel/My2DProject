package org.view;

import java.awt.Container;

import javax.swing.JFrame;

import org.controller.ComicHeroController;

/**
 * IT takes the setup of the panel and initializes the Frame through the panel.
 * @author cdaz6661
 *
 */
public class ComicHeroFrame extends JFrame
{
	private ComicHeroPanel appPanel;
	
	public void ComicHeroPanel(ComicHeroController baseController)
	{
		appPanel = new ComicHeroPanel(baseController);
		setupFrame();
	}
	
	/**
	 * This sets the size for the Frame of the application and initiates when it will be visible or not
	 */
	private void setupFrame()
	{
		this.setSize(500,500);
		Container basePanel = null;
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
}
