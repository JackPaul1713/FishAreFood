package fishAreFood;

public class Scoreboard
{

	public static void scoreboard(int score)
	{
		
		//variables
		
		String username;
		
		//action
		username = scoreCheck(score);
		
		System.out.println("");
		System.out.println("0 0 0 0  High Scores  0 0 0 0");
		System.out.println("(#1) Nemo - 1600");
		System.out.println("(#2) Jaws - 1500");
		System.out.println("(#3) Sharky - 1400");
		System.out.println("(#4) U-Boat - 1300");
		System.out.println("(#5) Surfr - 1200");
		System.out.println("");
		
	}
	
}
