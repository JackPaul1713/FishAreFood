package game;

public class ShiftLocations
{

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
	
}
