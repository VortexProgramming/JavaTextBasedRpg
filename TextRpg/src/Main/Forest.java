package Main;
import java.util.Scanner;
public class Forest 
{

	public static void main(String[] args) 
	{
		int playerChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("You've entered the forest");
		System.out.println("Continue through the forest? 1 for yes: 2 for no: 0 to return to crossroads");
		playerChoice = input.nextInt();
		
		
		if(playerChoice == 1)
		{
			System.out.println("You've continued down the path");
		}
		else if(playerChoice == 2)
		{
			main(null);
		}
		else if(playerChoice == 0)
		{
			Crossroads.main(null);
		}
		else
			System.out.println("That is not an option");
			main(null);
	}
	
	
	public static void enemyGobis()
	{
		int gobisHP;
		int gobisDMG;
	}
	public static void enemyGant()
	{
		int gantHP;
		int gantDMG;
	}
	public static void enemyIlfs()
	{
		int ilfHP;
		int ilfDMG;
	}
}

