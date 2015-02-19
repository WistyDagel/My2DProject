package org.model;

/**
 * THe method class for the 2D Array project, it calls the direct methods to other objects
 * @author cdaz6661
 *
 */
public class ComicHeroes
{
	private String name;
	private int heroLevel;
	private boolean isAlive;
	
	/**
	 * This is what checks the parameters of of the ComicHeroes class
	 * @param name2
	 * @param heroLevel2
	 * @param isAlive2
	 */
	public ComicHeroes(String name2, int heroLevel2, boolean isAlive2)
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the basic text that will initiate when you open up the app itself.
	 */
	@Override
	public String toString()
	{
		String comicHeroesString = "";
		comicHeroesString += "Hi, I am your new Hero Object. My name is " + name + ".";
		comicHeroesString += "My heroic level is " + heroLevel  + "and";
		if(isAlive)
		{
			comicHeroesString += "I am Alive!! :D";
		}
		else 
		{
			comicHeroesString += "I am Dead... D:";
		}
		return comicHeroesString;
	}
}
