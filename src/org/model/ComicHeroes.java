package org.model;

public class ComicHeroes
{
	private String name;
	private int heroLevel;
	private boolean isAlive;
	
	public ComicHeroes(String name2, int heroLevel2, boolean isAlive2)
	{
		// TODO Auto-generated constructor stub
	}

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
