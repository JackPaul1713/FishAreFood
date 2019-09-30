package game;

public class SetGameScreen
{

	public static String[][] setGameScreen(String[][] defaultScreen, String[][] gameScreen, int[][] plantLocation, int[][] itemLocation, int[][] sharkLocation, String dp, String pp, String gp, String fp, String tp, String mp, String sp)
	{
		
		//variables
		
		int rows = 12;
		int cols = 24;
		int plantCols = 24;
		int groundCols = 24;
		int itemCols = 24;
		int sharkCols = 8;
		
		//resetScreen
		
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
			
				gameScreen [r][c] = defaultScreen [r][c];
				
			}
		}
		
		//addGround
		
		for(int gc = 0; gc < groundCols; gc++)
		{
					
			gameScreen [11][gc] = gp;
					
		}
		
		//addPlants
		
		for (int pc = 0; pc < plantCols; pc ++)
		{
			
			
			if (plantLocation[2][pc] == 1)
			{
				
				gameScreen [plantLocation[0][pc]][plantLocation[1][pc]] = pp;
				
				if (plantLocation[3][pc] == 1)
				{
					
					gameScreen [plantLocation[0][pc] - 1][plantLocation[1][pc]] = pp;
					
				}
			
			}
			
		}
		
		//addItems
		
		for (int ic = 0; ic < itemCols; ic ++)
		{
			
		
			if (itemLocation[2][ic] == 1) //F
			{
			
				gameScreen [itemLocation[0][ic]][itemLocation[1][ic]] = fp;
				
			}
			else if (itemLocation[2][ic] == 2) //T
			{
			
				gameScreen [itemLocation[0][ic]][itemLocation[1][ic]] = tp;
				
			}
			else if (itemLocation[2][ic] == 3) //X
			{
			
				gameScreen [itemLocation[0][ic]][itemLocation[1][ic]] = mp;
				
			}
			
		}
		
		//addShark
		
		for (int sc = 0; sc < sharkCols; sc ++)
		{
			
			gameScreen [sharkLocation[0][sc]][sharkLocation[1][sc]] = sp;
			
		}
		
		return(gameScreen);
		
	}
	
}
