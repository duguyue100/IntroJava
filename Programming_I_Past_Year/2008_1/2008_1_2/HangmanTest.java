// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2008 I 2

import java.util.Scanner;
public class HangmanTest {
	public static void main(String[] args)
	{
		Hangman game=new Hangman("programming");
		Scanner input=new Scanner(System.in);
		
		System.out.println("Let's play a round of Hangman!\n");
		game.createDisguisedW();
		
		boolean gameCont=true;
		while (gameCont)
		{
			System.out.println("> "+game.getDisguisedW());
			System.out.print("Make a guess : ");
			game.makeGuess(input.next().toLowerCase().charAt(0));
			
			if (game.isFound())
			{
				System.out.println("Congratulation! You've won");
				gameCont=false;
			}
			
			if (game.isLost())
			{
				System.out.println("Sorry, you're not lucky today");
				gameCont=false;
			}
		}
		System.out.println("The answer is "+game.getSecretW());
	}
}
