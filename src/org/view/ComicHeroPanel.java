package org.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;

import org.controller.ComicHeroController;

public class ComicHeroPanel extends JPanel
{
	private ComicHeroController baseController;
	private JTable comicHeroesTable;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	
	public void ComicHeroPanel(ComicHeroController baseController)
	{
		this.baseController = baseController;
		
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
			
	}
	
	private void setupTable()
	{
		
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(comicHeroesTable);
		this.add(titleLabel);
		this.setBackground(Color.CYAN);
	}
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}

