package fishAreFood;

import java.util.Scanner;

public class TitleScreen
{
	
	public static boolean titleScreen(int score)
	{
		//action
		
		boolean play;
		String username;
		
		//variables
		
		username = scoreCheck(score);
		
		dispName();
		Scoreboard.scoreboard(score, username);
		play = askToPlay();
		
		return(play);
		
	}
	
	public static void dispName()
	{
		
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		System.out.println("O O O O O O O O  Fish R Food  O O O O O O O O O");
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		
	}
	
	public static boolean askToPlay()
	{
		
		//variables
		
				boolean play = false;
				String responce;
				Scanner strInput = new Scanner(System.in);
				
				//action
				
				System.out.println("Press enter to play. ('Enter')");
				System.out.print("Press esc to exit. (2)");
				responce = strInput.nextLine();		
				
				if (responce.equals(""))
				{
					
					play = true;
					
				}
				else if (responce.equals("2"))		
				{
				
					play = false;
				
				}
				
				return(play);
		
	}
	
	
}

