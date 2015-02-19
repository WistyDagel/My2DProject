package org.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import org.controller.ComicHeroController;

import javax.swing.JButton;

/**
 * This is the method call on the ComicHeroPAnel it will extend its parent class 
 * through the JPanel
 * @author cdaz6661
 *
 */
public class ComicHeroPanel extends JPanel
{
	private ComicHeroController baseController;
	private JTable comicHeroesTable;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	private JScrollPane tablePane;
	/**
	 * This is the setup for the PAnel to pass through the Controller and it checks 
	 * it through the baseController
	 * @param baseController2
	 */
	public ComicHeroPanel(ComicHeroController baseController2)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		titleLabel = new JLabel("Stan Lee's Super Hero Extravaganza!!");
		
		
		/**
		 * THis is the setupTable, setupPanel, setupLayout and setupListeners.
		 * This is the structure for all of the panel
		 */
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
			
	}
	
	/**
	 * The setupTable is the main GUI component for the panel and its what the user will see
	 */
	private void setupTable()
	{
		String [] colNames = {"ComicHeroes Col 1", "ComicHeroes COl 2"};
		DefaultTableModel comicHeroModel = new DefaultTableModel(baseController.getMyComicHeroes(), colNames);
		
		comicHeroesTable = new JTable(baseController.getMyComicHeroes(), colNames);
		comicHeroesTable = new JTable(comicHeroModel);
		
		tablePane = new JScrollPane(comicHeroesTable);
		
		
		
	}
	
	/**
	 * The setupPanel is what initializes all the GUI components within the panel 
	 * and runs them in the interface
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(comicHeroesTable);
		this.add(titleLabel);
		this.add(tablePane);
		this.setBackground(Color.CYAN);
		
		
	}
	/**
	 * This is the grid layout for the panel and it assigns every value set inside the panel 
	 */
	private void setupLayout()
	{
		JButton btnNewButton = new JButton("THE HEROIC BUTTON!");
		baseLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 104, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton, 114, SpringLayout.WEST, this);
		add(btnNewButton);
	}
	/**
	 * 
	 */
	private void setupListeners()
	{
		
	}
}

