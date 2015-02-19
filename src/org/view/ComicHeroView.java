package org.view;

import javax.swing.JOptionPane;

import org.controller.ComicHeroController;

public class ComicHeroView
{
	private ComicHeroController baseController; 
		
		public ComicHeroView(ComicHeroController baseController)
		{
			this.baseController = baseController; 
		}
		 
		//public String displayChatBotConversations(String input)
		{//
			//String output = "";
			
			//output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + " says hello, " + input + " do you wish to continue");
			
			//return output;
		}
		
		public void displayInformation(String input)
		{
			JOptionPane.showMessageDialog(null, input);
		}

		public String comicHeroes(String message)
		{
			// TODO Auto-generated method stub
			return null;
		}
		
}
