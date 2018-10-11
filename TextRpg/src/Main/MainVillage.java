package Main;
import java.util.Scanner;
public class MainVillage 
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the village. Check up on the king for quests and the shops for better gear");
		System.out.println("1 to speak to the king, 2 for BlackSmith, 3 for Armorer, 4 for Healer, 0 to head back to crossroads");
		choice = input.nextInt();
		if(choice == 1)
		{
			royaltyKing();
		}
		else if(choice == 2)
		{
			villagerBlacksmith();
		}
		else if(choice == 3)
		{
			villagerArmorer();
		}
		else if(choice == 4)
		{
			villagerHealer();
		}
		else if(choice == 0)
		{
			Crossroads.main(null);
		}
		else 
			System.out.println("That is not an option");
	}
	public static void villagerBlacksmith()
	{
		System.out.println("Hello! I'm the blacksmith how can i help you?");
	}
	public static void villagerArmorer()
	{
		System.out.println("Greetings! I'm the armorer i'll be supplying your armor for you");
	}
	public static void villagerHealer()
	{
		
	}
	public static void royaltyKing()
	{
		
	}
}
