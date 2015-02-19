package org.controller;

import javax.swing.JOptionPane;

import org.model.ComicHeroes;
import org.view.ComicHeroFrame;

/**
 * The Controller takes the code for both the Frame and Panel and runs its through here 
 * @author cdaz6661
 *
 */
public class ComicHeroController
{
	private static final ComicHeroFrame ComicHeroFrame = null;
	private ComicHeroes[][] myComicHeroes;
	private ComicHeroFrame appFrame;
	
	/**
	 * ComicHeroes is set as a given position in the ComicHeroFrame
	 */
	public ComicHeroController()
	{
		myComicHeroes = new ComicHeroes[3][2];
		fillMyComicHeroesArray();
		appFrame = new ComicHeroFrame();
	}
	/**
	 * To retrieve the class ComicHeroes and return it through the controller
	 * @return It returns as myComicHeroes
	 */
	public ComicHeroes[][] getMyComicHeroes1()
	{
		return myComicHeroes;
	}
	/**
	 * To retrieve the class ComicHeroFrame and returns it through the controller
	 * @return It returns as ComicHeroFrame
	 */
	public ComicHeroFrame myComicHeroFrame()
	{
		return ComicHeroFrame;
	}
	/**
	 * Creates the fillMyComicHeroesArray and uses it for a loop to return each text
	 */
	private void fillMyComicHeroesArray()
	{
		for(int row = 0; row < myComicHeroes.length; row++)
		{
			/**
			 * Takes the String name, the row count, the col count and the hero level 
			 * and passes it all through a loop. 
			 * The hero level is given a set value and returns it
			 * The boolean isAlive is set to either True or False
			 */
			for(int col = myComicHeroes[row].length-1; col >= 0; col--)
			{
				String name = row + col + "Hero Level";
				int heroLevel = (int) (Math.random() * 10);
				boolean isAlive = (heroLevel % 2 == 0);
				myComicHeroes[row][col] = new ComicHeroes(name, heroLevel, isAlive);
			}
		}
	}
	
	/**
	 * Takes the JOPtionPane and displays this welcome text
	 */		
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to my world of HEROES!");
	}
	/**
	 * This is a 2D Array that checks the value of the method MyComicHeroes
	 * @return it will return as null
	 */
	public Object[][] getMyComicHeroes()
	{
		return null;
	}
	/**
	 * It Takes the Comic HeroFrame and returns it as a given value in the appFrame
	 * @return is will return into the appFrame
	 */
	public ComicHeroFrame getAppFrame()
	{
		return appFrame;
	}
	/**
	 * This sets the appFrame as the method ComicHeroFrame and passes it through the app frame
	 * @param appFrame is where the method will be checked
	 */
	public void setAppFrame(ComicHeroFrame appFrame)
	{
		this.appFrame = appFrame;
	}
	/**
	 * This passes the 2D Array MyComicHeroes through the controller 
	 * @param myComicHeroes is set as myComicHeroes
	 */
	public void setMyComicHeroes(ComicHeroes[][] myComicHeroes)
	{
		this.myComicHeroes = myComicHeroes;
	}
}
