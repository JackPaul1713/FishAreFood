package fishAreFood;

import game.*;

public class Game
{

	public static int game(int speed, String defaultPixel, String groundPixel, String plantPixel, String fishPixel, String trashPixel, String minePixel, String sharkPixel) throws InterruptedException
	{
		
		//variables
		
		int score = 0;
		boolean loose = false;
		String sharkShift;
		int [][] plantLocation;
		int [][] itemLocation;
		int [][] sharkLocation;
		String [][] defaultScreen;
		String [][] gameScreen;
		
		//action
		
		defaultScreen = MakeScreens.makeDefaultScreen(defaultPixel);
		gameScreen = MakeScreens.makeGameScreen();
		plantLocation = MakeLocations.makePlantLocation();
		itemLocation = MakeLocations.makeItemLocation();
		sharkLocation = MakeLocations.makeSharkLocation();
		
		while (loose == false)
		{

			gameScreen = SetGameScreen.setGameScreen(defaultScreen, gameScreen, plantLocation, itemLocation, sharkLocation, defaultPixel, plantPixel, groundPixel, fishPixel, trashPixel, minePixel, sharkPixel);
			sharkShift = PrintGameScreen.printGameScreen(gameScreen, score);

			Thread.sleep(speed); //add with keyScanner
			
			plantLocation = ShiftLocations.plantShift(plantLocation);
			itemLocation = ShiftLocations.itemShift(itemLocation);
			sharkLocation = ShiftLocations.sharkShift(sharkLocation, sharkShift); //takes keyScanner Input
			
			score = CheckLocations.checkSharkLocationScore(itemLocation, sharkLocation, score);
			loose = CheckLocations.checkSharkLocationLoose(gameScreen, itemLocation, sharkLocation, minePixel, score, loose);

		}
		
		return(score);
		
	}
	
}
