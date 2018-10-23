package Main;
import java.util.Scanner;
public class Cave 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int playerChoice;
		
		System.out.println("You've entered the cave");
		System.out.println("Continue through the cave? 1 for yes: 2 for no: 0 to return to crossroads:");
		
		playerChoice = input.nextInt();
	
			if(playerChoice == 1)
			{
				System.out.println("You've continued through the cavern");
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
	
	public static void enemySpooder()
	{
		int spooderHP;
		int spooderDMG;
	}
	public static void enemyCaveSpooder()
	{
		int cavespooderHP;
		int cavespooderDMG;
	}
}
