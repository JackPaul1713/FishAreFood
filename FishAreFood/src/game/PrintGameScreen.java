package game;

import java.util.Scanner;

public class PrintGameScreen
{

	public static String printGameScreen(String[][] gameScreen, int score)
	{
		
		//variables
		
		int gameScreenRows = 12;
		int gameScreenCols = 24;
		int rows = gameScreenRows;
		int cols = gameScreenCols;
		String sharkShift = "";
		Scanner strInput = new Scanner(System.in);
		
		//printScore
		
		System.out.println("\nFishRFood                           Score = " + score);
		
		//printScreen
		
		for (int r = 0; r < rows; r++)
		{
			
			for (int c = 0; c < cols; c++)
			{
			
				System.out.print(gameScreen [r][c]);
				
			}
			
			if (r < rows - 1)
			{
				
				System.out.print("\n");
			
			}
			
		}
		
		//getSharkShift
	
		//-> sharkShift = strInput.nextLine();
		
		//returnSharkShift
		
		return(sharkShift);
		
	}
	
}
