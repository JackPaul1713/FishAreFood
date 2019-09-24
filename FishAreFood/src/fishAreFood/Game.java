package fishAreFood;

import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game
//implements KeyListener
{

	public static int game() throws InterruptedException
	{
		
		//variables
		
		int score = 0;
		int speed = 1 * 1000 / 3;
		boolean loose = false;
		String sharkShift;
		String defaultPixel = "- ";
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
		
		defaultScreen = makeDefaultScreen(defaultPixel);
		gameScreen = makeGameScreen();
		plantLocation = makePlantLocation();
		itemLocation = makeItemLocation();
		sharkLocation = makeSharkLocation();
		
		while (loose == false)
		{

			gameScreen = setGameScreen(defaultScreen, gameScreen, plantLocation, itemLocation, sharkLocation, defaultPixel, plantPixel, groundPixel, fishPixel, trashPixel, minePixel, sharkPixel);
			sharkShift = printGameScreen(gameScreen, score);

			Thread.sleep(speed); //add with keyScanner
			
			plantLocation = plantShift(plantLocation);
			itemLocation = itemShift(itemLocation);
			sharkLocation = sharkShift(sharkLocation, sharkShift);
			
			score = checkSharkLocationScore(itemLocation, sharkLocation, score);
			loose = checkSharkLocationLoose(gameScreen, itemLocation, sharkLocation, minePixel, score, loose);

		}
		
		return(score);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
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
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static String[][] makeGameScreen()
	{
		
		//variables
		
		int rows = 12;
		int cols = 24;
		String[][] gameScreen = new String [rows][cols];
		
		//returnGameScreen
		
		return(gameScreen);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int[][] makePlantLocation()
	{
		
		//variables
		
		int rows = 4;
		int cols = 24;
		int[][] plantLocation = new int [rows][cols];
		
		//fillPlantLocation (format - row[1]=row, row[2]=col, row[3]=var(0=noPlant, 1=Plant))
		
		for (int c = 0; c < cols; c++)
		{
			
			plantLocation [0][c] = 10;
				
		}
		
		for (int c = 0; c < cols; c++)
		{
			
			plantLocation [1][c] = c;
				
		}
		
		for (int c = 0; c < cols; c++)
		{
			
			plantLocation [2][c] = 0;
				
		}
		
		for (int c = 0; c < cols; c++)
		{
			
			plantLocation [3][c] = 0;
				
		}
		
		//returnPlantLocation
		
		return(plantLocation);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////	
	
	public static int[][] makeItemLocation()
	{
		
		//variables
		
		int rows = 3;
		int cols = 24;
		int[][] itemLocation = new int [rows][cols];
		
		//fillItemLocation (format - row[1]=row, row[2]=col, row[3]=var(0=DefaultPixel, 1=F, 2=T, 3=X))
		
		for (int c = 0; c < cols; c++)
		{
					
			itemLocation [0][c] = 0;
						
		}
		
		for (int c = 0; c < cols; c++)
		{
					
			itemLocation [1][c] = c;
						
		}
		
		for (int c = 0; c < cols; c++)
		{
					
			itemLocation [2][c] = 0;
						
		}
		
		//returnItemLocation 
		
		return(itemLocation);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int[][] makeSharkLocation()
	{
		
		//variables
		
		int rows = 2;
		int cols = 8;
		int[][] sharkLocation = new int [rows][cols];
		
		//fillSharkLocation
		
		sharkLocation [0][0] = 4;
		sharkLocation [1][0] = 1;
		
		sharkLocation [0][1] = 4;
		sharkLocation [1][1] = 4;
		
		sharkLocation [0][2] = 5;
		sharkLocation [1][2] = 2;
		
		sharkLocation [0][3] = 5;
		sharkLocation [1][3] = 3;
		
		sharkLocation [0][4] = 5;
		sharkLocation [1][4] = 4;
		
		sharkLocation [0][5] = 5;
		sharkLocation [1][5] = 5;
		
		sharkLocation [0][6] = 6;
		sharkLocation [1][6] = 1;
		
		sharkLocation [0][7] = 6;
		sharkLocation [1][7] = 3;
	
		//returnSharkLocation
		
		return(sharkLocation);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
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
	
///////////////////////////////////////////////////////////////////////////////////
	
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
		
		System.out.println("\nFishRFood                            Score = " + score);
		
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
	
		//sharkShift = strInput.nextLine();
		
		//returnSharkShift
		
		return(sharkShift);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
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
					score = score + 1;
					
				}
				
				if ((sharkLocation[0][sc] == itemLocation[0][ic] && sharkLocation[1][sc] == itemLocation[1][ic]) && itemLocation[2][ic] == 2)
				{

					itemLocation[2][ic] = 0;
					score = score - 1;
					
				}

			}				
		
		}
		
		return(score);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
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

					System.out.print("BOOM! You hit a mine. Game Over."); //"\n" if key scanners r added 
					
					System.out.print("\nFishRFood                            Score = " + score);
					
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
					
					System.out.print("\nM M M  BOOM! You hit a mine!? GAME OVER.  M M M");
					
					loose = true;
					
				}

			}				
		
		}
		
		return(loose);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int[][] plantShift(int[][] plantLocation)
	{
		
		//variables
		
		double randomNumber3 = (int) (Math.random() * 3 + 1);
		int randomNumberHeight = (int) randomNumber3;
		
		double randomNumber4 = (int) (Math.random() * 4 + 1);
		int randomNumberPlant = (int) randomNumber4;

		//shiftLocation
		
		for(int pc = 0; pc < 23; pc++)
		{
			
			plantLocation[2][pc] = plantLocation[2][pc + 1];
			plantLocation[3][pc] = plantLocation[3][pc + 1];
			
		}
		
		//generateNewLocation
		
		if (randomNumberPlant == 4)
		{
			
			plantLocation[2][23] = 1;
			
			if (randomNumberHeight == 3)
			{
				
				plantLocation[3][23] = 1;
				
			}	
				
		}
		else
		{
			
			plantLocation[2][23] = 0;
			plantLocation[3][23] = 0;
			
		}
				
		//returnLocation
		
		return(plantLocation);
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int[][] itemShift(int[][] itemLocation)
	{
		
		// variables

		double randomNumber10 = (int) (Math.random() * 10);
		int randomNumberLocation = (int) randomNumber10;

		double randomNumber11 = (int) (Math.random() * 22);
		int randomNumberType = (int) randomNumber11;

		// shiftLocation

		for (int ic = 0; ic < 23; ic++)
		{

			itemLocation[0][ic] = itemLocation[0][ic + 1];
			itemLocation[2][ic] = itemLocation[2][ic + 1];

		}

		// generateNewLocation

		itemLocation[0][23] = randomNumberLocation;
		
		if (randomNumberType >= 0 && randomNumberType <= 14)
		{
		
			itemLocation[2][23] = 0;
			
		}
		else if (randomNumberType >= 15 && randomNumberType <= 18)
		{
			
			itemLocation[2][23] = 1;
			
		}
		else if (randomNumberType >= 19 && randomNumberType <= 20)
		{
			
			itemLocation[2][23] = 2;
			
		}
		else if (randomNumberType == 21)
		{
			
			itemLocation[2][23] = 3;
			
		}
			
		// returnLocation

		return (itemLocation);

	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public static int[][] sharkShift(int[][] sharkLocation, String sharkShift)
	{
		
		//shiftLocation
		
		if (sharkLocation[0][0] > 0)
		{

			if (sharkShift.equals("u"))
			{

				sharkLocation[0][0] = sharkLocation[0][0] - 1;
				sharkLocation[0][1] = sharkLocation[0][1] - 1;
				sharkLocation[0][2] = sharkLocation[0][2] - 1;
				sharkLocation[0][3] = sharkLocation[0][3] - 1;
				sharkLocation[0][4] = sharkLocation[0][4] - 1;
				sharkLocation[0][5] = sharkLocation[0][5] - 1;
				sharkLocation[0][6] = sharkLocation[0][6] - 1;
				sharkLocation[0][7] = sharkLocation[0][7] - 1;

			} 
			
		}
		
		if (sharkLocation[0][7] < 10)
		{

			if (sharkShift.equals("d"))
			{

				sharkLocation[0][0] = sharkLocation[0][0] + 1;
				sharkLocation[0][1] = sharkLocation[0][1] + 1;
				sharkLocation[0][2] = sharkLocation[0][2] + 1;
				sharkLocation[0][3] = sharkLocation[0][3] + 1;
				sharkLocation[0][4] = sharkLocation[0][4] + 1;
				sharkLocation[0][5] = sharkLocation[0][5] + 1;
				sharkLocation[0][6] = sharkLocation[0][6] + 1;
				sharkLocation[0][7] = sharkLocation[0][7] + 1;

			} 
			
		}
		
		//returnLocation
		
		return(sharkLocation);
		
	}

	/*@Override
	public void keyPressed(KeyEvent e)
	{
		
		String sharkShift = "";
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			
			sharkShift = "u";
			return(sharkShift);
			
		}
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			
			sharkShift = "d";
			return(sharkShift);
			
		}
		
		return(sharkShift);
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
		//Empty
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		
		//Empty
		// TODO Auto-generated method stub
		
	}*/
	
///////////////////////////////////////////////////////////////////////////////////
	
}
