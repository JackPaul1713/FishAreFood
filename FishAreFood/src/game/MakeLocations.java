package game;

public class MakeLocations
{

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
	
}
