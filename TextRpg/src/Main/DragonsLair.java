package Main;
import java.util.Scanner;
public class DragonsLair
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int dagonHP = 100; 
		int dagonDMG;
		int playerChoice = 0;
		System.out.println("You've entered the Dragon's Lair");
		System.out.println("Are you sure you want to continue? 1 for yes: 2 for no: 0 to return to crossroads");
		playerChoice = input.nextInt();
		
		if(playerChoice == 1)
		{
			System.out.println("You begin to hear a loud groaning. There will be no going back.");
			System.out.println("Are you sure you want to continue? 1 for yes: 2 for no");
			playerChoice = input.nextInt();
			
			if(playerChoice == 1)
			{
				System.out.println("You've encountered the Dagon!");
			}
			else if(playerChoice == 2)
			{
				main(null);
			}
			else
				Crossroads.main(null);
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

}
