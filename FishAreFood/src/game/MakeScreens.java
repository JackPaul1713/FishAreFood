package game;

public class MakeScreens
{

	public static String[][] makeDefaultScreen(String dp)
	{
		
		//variables
		
		int rows = 12;
		int cols = 24;
		String [][] defaultScreen = new String [rows][cols];
		
		//fillDefaultScreen
		
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
			
				defaultScreen [r][c] = dp;
				
			}
		}
		
		//returnDefaultScreen
		
		return(defaultScreen);
		
	}
	
	public static String[][] makeGameScreen()
	{
		
		//variables
		
		int rows = 12;
		int cols = 24;
		String[][] gameScreen = new String [rows][cols];
		
		//returnGameScreen
		
		return(gameScreen);
		
	}
	
}
