package fishAreFood;

public class Game
{

	public static int game()
	{
		
		//variables
		
		int score;
		
		//action
		
		screenIntro();
		score = screenShift();
	
		return(score);
		
	}
	
	public static void screenIntro() throws InterruptedException
	{
		
		//variables
		
		String defaultPixel = "";
		String dp = defaultPixel;
		String sharkPixel = "";
		String sp = sharkPixel;
		
		//action
		
		System.out.println("\nO O O O O O O O O O O O O O O O O O O O O O O O");
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		System.out.println("O O O O O O O O O O O S O O O O O O O O O O O O");
		System.out.println("O O O O O O O O O O O S S O O O O O O O O O O O");
		System.out.println("O O O O O O O S O S S S S S S S O O O O O O O O");
		System.out.println("O O O O O O O O S S S S S S S O O O O O O O O O");
		System.out.println("O O O O O O O S O O S S S O O O O O O O O O O O");
		System.out.println("O O O O O O O O O O O S O S O O O O O O O O O O");
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		System.out.println("O O O O O O O O O O O O O O O O O O O O O O O O");
		System.out.print("O O O O O O O O O O O O O O O O O O O O O O O O");
		
		Thread.sleep(1 * 1000 / 4);
		
	}
	
	public static int screenShift()
	{
		
		screenSharkShift();
		screenFishNMinesShift();
		
	}
	
}

//KeyListener