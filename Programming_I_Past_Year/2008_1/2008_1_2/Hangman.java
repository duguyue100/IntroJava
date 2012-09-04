// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2008 I 2

import java.util.*;
public class Hangman {
	String secretWord;
	String disguisedW;
	String guessedWord;
	final int n=10;
	int madeGuess;
	int incorrectGuess;
	
	public Hangman(String secret)
	{
		secretWord=secret;
		madeGuess=0;
		incorrectGuess=0;
		guessedWord="";
	}
	
	public void createDisguisedW()
	{
		disguisedW="";
		for (int i=1;i<=secretWord.length();i++)
			disguisedW+='?';
		
		System.out.println(disguisedW);
	}
	
	public String getDisguisedW()
	{
		return disguisedW;
	}
	
	public void makeGuess(char ch)
	{
		guessedWord+=ch;
		madeGuess++;
		int index=secretWord.indexOf(ch);
		if (index==-1)
		{
			incorrectGuess++;
		}
		else
		{
			while (index!=-1)
			{
				char[] change1=disguisedW.toCharArray();
				change1[index]=ch;
				disguisedW="";
				for (int i=0;i<change1.length;i++)
					disguisedW+=change1[i];
				char[] change2=secretWord.toCharArray();
				change2[index]='?';
				secretWord="";
				for (int i=0;i<change2.length;i++)
					secretWord+=change2[i];
				index=secretWord.indexOf(ch);
			}
		}
		System.out.println("Total number of Guess     : "+madeGuess);
		System.out.println("Number of incorrect guess : "+incorrectGuess);
		System.out.println("Letters have been guessed : "+guessedWord);
	}
	
	public boolean isFound()
	{
		if (disguisedW.contains("?"))
			return false;
		else return true;
	}
	
	public boolean isLost()
	{
		if (madeGuess>n)
			return true;
		else return false;
	}
	
	public String getSecretW()
	{
		return disguisedW;
	}
}
