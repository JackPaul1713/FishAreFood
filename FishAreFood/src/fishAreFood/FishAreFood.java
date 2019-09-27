package fishAreFood;

public class FishAreFood
{

	public static void main(String[] args) throws InterruptedException
	{
		
		//variables
	
		int score = 0; 
		boolean play = true;
		boolean firstTime = true;
		
		int introSpeed = 1000 * 1;
		int gameSpeed = 1000 * 1 / 3;
		String defaultPixel = "- ";
		String groundPixel = "M ";
		String plantPixel = "| ";
		String fishPixel = "F ";
		String trashPixel = "T ";
		String minePixel = "X ";
		String sharkPixel = "S ";
		
		//action
	
		SetScreenSize.setScreen();
		play = TitleScreen.titleScreen(score); firstTime = false;
	
		while (play == true)
		{
		
			IntroScreen.introScreen(introSpeed, defaultPixel, sharkPixel);
			score = Game.game(gameSpeed, defaultPixel, groundPixel, plantPixel, fishPixel, trashPixel, minePixel, sharkPixel);
			EnterToContinue.enterToContinue();
			play = TitleScreen.titleScreen(score);
	
		}
	
		Goodbye.goodbye();
	
	}
	
}
