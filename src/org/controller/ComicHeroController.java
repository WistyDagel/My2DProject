package org.controller;

import javax.swing.JOptionPane;

import org.model.ComicHeroes;
import org.view.ComicHeroFrame;

public class ComicHeroController
{
	private ComicHeroes[][] myComicHeroes;
	private ComicHeroFrame appFrame;
	
	public ComicHeroController()
	{
		myComicHeroes = new ComicHeroes[3][2];
		fillMyComicHeroesArray();
		appFrame = new ComicHeroFrame();
	}
	
	private void fillMyComicHeroesArray()
	{
		for(int row = 0; row < myComicHeroes.length; row++)
		{
			for(int col = myComicHeroes[row].length-1; col >= 0; col--)
			{
				String name = row + col + "Hero Level";
				int heroLevel = (int) (Math.random() * 10);
				boolean isAlive = (heroLevel % 2 == 0);
				myComicHeroes[row][col] = new ComicHeroes(name, heroLevel, isAlive);
			}
		}
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to my world of HEROES!");
	}
}
