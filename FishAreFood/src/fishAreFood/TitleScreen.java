package fishAreFood;

public class TitleScreen
{
	
	public static boolean titleScreen(boolean firstTime)
	{
		
		//variables
		
		boolean want2Play;
		
		//action
		dispName();
		Scoreboard.scorboard();
		
		if (firstTime == true)
		{
			
			System.out.println("Press enter to play.");
			System.out.print("Press esc to exit.");
			
		}
		else if (firstTime == false)
		{

			System.out.println("Press enter to play again.");
			System.out.print("Press esc to exit.");
			
		}
		
		//if "enter"
		want2Play = true;
		
		//if "esc"
		want2Play = false;		
		
		return(want2Play);
		
	}
	
	public static void dispName()
	{
		
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		System.out.println("O O O O O O O O  Fish R Food  O O O O O O O O O");
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		
	}
	
	
	
}

