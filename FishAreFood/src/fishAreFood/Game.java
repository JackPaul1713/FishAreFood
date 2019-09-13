package fishAreFood;

public class Game
{

	public static int game()
	{
		
		//variables
		
		int score = 0;
		boolean loose;
		int [][] plantLocation;
		int [][] itemLocation;
		int [][] sharkLocation;
		String [][] defaultScreen;
		String [][] gameScreen;
		
		//action
		
		defaultScreen = makeDefaultScreen();
		gameScreen = makeGameScreen();
		plantLocation = makePlantLocation();
		itemLocation = makeItemLocation();
		sharkLocation = makeSharkLocation();
		
		while (loose = false)
		{

			gameScreen = setGameScreen(defaultScreen, plantLocation, itemLocation, sharkLocation);
			printGameScreen();

			score = checkSharkLocationScore();
			loose = checkSharkLocationLoose();

			plantLocation = plantShift(plantLocation);
			itemLocation = itemShift(itemLocation);
			sharkLocation = sharkShift(sharkLoaction); // get input here too

		}
		
		return(score);
		
	}
	
}
