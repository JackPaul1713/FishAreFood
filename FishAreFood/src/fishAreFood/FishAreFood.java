package fishAreFood;

public class FishAreFood
{

	public static void main(String[] args)
	{
		
	//variables
	
	boolean want2Play;
	boolean firstTime = true;
	
	//action
	
	SetScreen.setScreen();
	want2Play = TitleScreen.titleScreen(firstTime);
	firstTime = false;
	
	/*while (play == true);
	{
	game();
	titleScreen();
	}
	
	goodbye();*/
	
	}
	
}
