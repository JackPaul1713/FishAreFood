package fishAreFood;

public class Game
{

	public static int game()
	{
		
		//variables
		
		int score = 0;
		boolean loose = false;
		String defaultPixel = "0 ";
		String groundPixel = "M ";
		String plantPixel = "| ";
		String fishPixel = "F ";
		String trashPixel = "T ";
		String minePixel = "X ";
		String sharkPixel = "S ";
		int [][] plantLocation;
		int [][] itemLocation;
		int [][] sharkLocation;
		String [][] defaultScreen;
		String [][] gameScreen;
		
		//action
		
		defaultScreen = makeDefaultScreen(defaultPixel, groundPixel);
		gameScreen = makeGameScreen();
		plantLocation = makePlantLocation();
		itemLocation = makeItemLocation();
		sharkLocation = makeSharkLocation();
		
		while (loose == false)
		{

			gameScreen = setGameScreen(defaultScreen, gameScreen, plantLocation, itemLocation, sharkLocation, plantPixel, fishPixel, trashPixel, minePixel, sharkPixel);
			printGameScreen(gameScreen);

			/*score = checkSharkLocationScore();
			loose = checkSharkLocationLoose();

			plantLocation = plantShift(plantLocation);
			itemLocation = itemShift(itemLocation);
			sharkLocation = sharkShift(sharkLoaction);*/ // get input here too

		}
		
		return(score);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static String[][] makeDefaultScreen(String dp, String gp)
	{
		
		//variables
		
		int rows = 12;
		int cols = 24;
		String [][] defaultScreen = new String [rows][cols];
		
		//action
		
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
			
				defaultScreen [r][c] = dp;
				
			}
		}
		
		return(defaultScreen);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static String[][] makeGameScreen()
	{
		
		//variables
		
		int rows = 12;
		int cols = 24;
		String[][] gameScreen = new String [rows][cols];
		
		//action
		
		return(gameScreen);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int[][] makePlantLocation()
	{
		
		//variables
		
		int rows = 2;
		int cols = 24;
		int[][] plantLocation = new int [rows][cols];
		
		//action
		
		return(plantLocation);
		
		//format - row[1] = row, row[2] = col, row[3] = var
		
	}
	
///////////////////////////////////////////////////////////////////////////////////	
	
	public static int[][] makeItemLocation()
	{
		
		//variables
		
		int rows = 3;
		int cols = 24;
		int[][] itemLocation = new int [rows][cols];
		
		//action
		
		return(itemLocation);
		
		//format - row[1]=row, row[2]=col, row[3]=var(1=F, 2=T, 3=X)
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int[][] makeSharkLocation()
	{
		
		//variables
		
		int rows = 2;
		int cols = 8;
		int[][] sharkLocation = new int [rows][cols];
		
		//action
		
		return(sharkLocation);
		
		//format - row[1] = row, row[2] = col
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static String[][] setGameScreen(String[][] defaultScreen, String[][] gameScreen, int[][] plantLocation, int[][] itemLocation, int[][] sharkLocation, String pp, String fp, String tp, String mp, String sp)
	{
		
		//variables
		
		int plantCols = 24;
		int itemCols = 24;
		int sharkCols = 8;
		
		//action
		
		gameScreen = defaultScreen;
		
		for (int pc = 0; pc > plantCols; pc ++)
		{
			
			gameScreen [sharkLocation[0][pc]][sharkLocation[1][pc]] = pp;
			
		}
		
		//set gorund
		
		for (int ic = 0; ic > itemCols; ic ++)
		{
			
			if (sharkLocation[2][ic] == 0) //F
			{
			
				gameScreen [sharkLocation[0][ic]][sharkLocation[1][ic]] = fp;
				
			}
			
			if (sharkLocation[2][ic] == 1) //T
			{
			
				gameScreen [sharkLocation[0][ic]][sharkLocation[1][ic]] = tp;
				
			}
			
			if (sharkLocation[2][ic] == 2) //X
			{
			
				gameScreen [sharkLocation[0][ic]][sharkLocation[1][ic]] = mp;
				
			}
			
		}
		
		for (int sc = 0; sc > sharkCols; sc ++)
		{
			
			gameScreen [sharkLocation[0][sc]][sharkLocation[1][sc]] = sp;
			
		}
		
		return(gameScreen);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static void printGameScreen(String[][] gameScreen)
	{
		
		//variables
		
		int gameScreenRows = 12;
		int gameScreenCols = 24;
		int rows = gameScreenRows;
		int cols = gameScreenCols;
		
		//action
		
		for (int r = 0; r < rows; r++)
		{
			
			if (r == 0)
			{
				
				System.out.println("\n");
				
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
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
}
