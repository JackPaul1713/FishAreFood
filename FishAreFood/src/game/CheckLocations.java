package game;

public class CheckLocations
{

	public static int checkSharkLocationScore(int[][] itemLocation, int[][] sharkLocation, int score)
	{
		
		//variables
		
		int itemCols = 24;
		int sharkCols = 8;
		
		//checkSharkLocationVsItemLocation
		
		for (int ic = 0; ic < itemCols; ic++)
		{

			for (int sc = 0; sc < sharkCols; sc++)
			{

				if ((sharkLocation[0][sc] == itemLocation[0][ic] && sharkLocation[1][sc] == itemLocation[1][ic]) && itemLocation[2][ic] == 1)
				{

					itemLocation[2][ic] = 0;
					score = score + 100;
					
				}
				
				if ((sharkLocation[0][sc] == itemLocation[0][ic] && sharkLocation[1][sc] == itemLocation[1][ic]) && itemLocation[2][ic] == 2)
				{

					itemLocation[2][ic] = 0;
					score = score - 50;
					
				}

			}				
		
		}
		
		return(score);
		
	}
	
	public static boolean checkSharkLocationLoose(String[][] gameScreen, int[][] itemLocation, int[][] sharkLocation, String mp, int score, boolean loose)
	{
		
		//variables
		
		int rows = 11;
		int cols = 24;
		int itemCols = 24;
		int sharkCols = 8;
				
		//checkSharkLocationVsItemLocation
		
		for (int ic = 0; ic < itemCols; ic++)
		{

			for (int sc = 0; sc < sharkCols; sc++)
			{

				gameScreen [sharkLocation[0][sc]][sharkLocation[1][sc]] = mp;
				
				if ((sharkLocation[0][sc] == itemLocation[0][ic] && sharkLocation[1][sc] == itemLocation[1][ic]) && itemLocation[2][ic] == 3)
				{
					
					itemLocation[2][ic] = 0;
					
					System.out.print("\nYou hit a mine. Game Over.    Final Score = " + score);
					
					for (int r = 0; r < rows; r++)
					{
						
						if (r == 0)
						{
							
							System.out.print("\n");
							
						}
						
						for (int c = 0; c < cols; c++)
						{
						
							System.out.print(gameScreen [r][c]);
							
						}
						
						if (r < rows - 1)
						{
							
							System.out.print("\n");
						
						}
						
					}
					
					System.out.print("\nM M M M M M M M M M BOOOOM! M M M M M M M M M M");
					
					loose = true;
					
				}

			}				
		
		}
		
		return(loose);
		
	}
	
}
