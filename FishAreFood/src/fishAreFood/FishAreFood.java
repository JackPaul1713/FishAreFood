package fishAreFood;

public class FishAreFood
{

	public static void main(String[] args)
	{
		
		//variables
	
		int score = 0; 
		boolean play = false;
		boolean firstTime = true;
	
		//action
	
		SetScreenSize.setScreen();
		play = TitleScreen.titleScreen(score); firstTime = false;
	
		while (play = true);
		{
		
			score = Game.game();
			play = TitleScreen.titleScreen(score);
	
		}
	
		if (play = false)
		{
		
			Goodbye.goodbye();
		
		}
	
	}
	
}
