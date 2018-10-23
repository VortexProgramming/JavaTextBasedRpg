package Main;
import java.util.Scanner;
public class MainVillage 
{

	public static void main(String[] args) 
	{
		CharacterInfo.main(null);
		
		int choice;
		int beginQuest = 0;
		int buy = 0;
		int buyWeapon = 0;
		int buyPotion = 0;
		int buyArmor = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the village. Check up on the king for quests and the shops for better gear");
		System.out.println("1 to speak to the king, 2 for BlackSmith, 3 for Armorer, 4 for Healer, 0 to head back to crossroads");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			royaltyKing(beginQuest);
		}
		else if(choice == 2)
		{
			villagerBlacksmith(buy, buyWeapon);
		}
		else if(choice == 3)
		{
			villagerArmorer(buy, buyArmor);
		}
		else if(choice == 4)
		{
			villagerHealer(buy, buyPotion);
		}
		else if(choice == 0)
		{
			Crossroads.main(null);
		}
		else 
			System.out.println("That is not an option");
	}
	
	public static void villagerBlacksmith(int buy, int buyWeapon)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hello! I'm the blacksmith, how can I help you?");
		System.out.println("Buy something? 1 for yes 0 to return to village entrance");
		buy = input.nextInt();
		
		if(buy == 1)
		{
			System.out.println("What would you like to buy?");
			System.out.println("1-one handed weapons: 2-two handed weapons: 0 to return");
			buyWeapon = input.nextInt();
			if(buyWeapon == 1)
			{
				System.out.println("");
			}
			else if(buyWeapon == 2)
			{
				System.out.println("");
			}
			else if(buyWeapon == 0)
			{
				villagerBlacksmith(buy, buyWeapon);
			}
			else
				System.out.println("That is not an option");
				villagerBlacksmith(buy, buyWeapon);
		}
		else if(buy == 0)
		{
			main(null);
		}
		else
			System.out.println("That is not an option");
			villagerBlacksmith(buy, buyWeapon);
	}
	
	public static void villagerArmorer(int buy, int buyArmor)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hey!, I'm the Armorer. I'll be supplying your armors)");
		System.out.println("Buy something? 1 for yes 0 to return to village entrance");
		buy = input.nextInt();
		
		if(buy == 1)
		{
			System.out.println("What would you like to buy? 1-Light Armors: 2-Medium Armors: 3-Heavy Armors: 0-return");
			buyArmor = input.nextInt();
			
			if(buyArmor == 1)
			{
				System.out.println("Which LIGHT armor would you like to buy?");
			}
			else if(buyArmor == 2)
			{
				System.out.println("Which MEDIUM armor would you like to buy?");
			}
			else if(buyArmor == 3)
			{
				System.out.println("Which HEAVY armor would you like to buy?");
			}
			else if(buyArmor == 0)
			{
				villagerArmorer(buy, buyArmor);
			}
			else
				System.out.println("That is not an option");
				villagerArmorer(buy, buyArmor);
		}
		else if(buy == 0)
		{
			main(null);
		}
		else
			System.out.println("That is not an option");
			villagerArmorer(buy, buyArmor);
	}
	
	public static void villagerHealer(int buy, int buyPotion)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hi there, I am the healer. I will heal your wounds for a small price ;)");
		System.out.println("Buy something? 1 for yes 0 to return to village entrance");
		buy = input.nextInt();
		
		if(buy == 1)
		{
			System.out.println("What would you like to buy? 1-healed for 10g: 2-potion for 20g: 0 to return");
			buyPotion = input.nextInt();
			
			if(buyPotion == 1)
			{
				System.out.println("You have been healed");
				villagerHealer(buy, buyPotion);
			}
			else if(buyPotion == 2)
			{
				System.out.println("You have bought a potion");
				villagerHealer(buy, buyPotion);
			}
			else if(buyPotion == 0)
			{
				villagerHealer(buy, buyPotion);
			}
			else
				System.out.println("That is not an option");
				villagerHealer(buy, buyPotion);
		}
		else if(buy == 0)
		{
			main(null);
		}
		else
			System.out.println("That is not an option");
			villagerHealer(buy, buyPotion);
	}
	
	public static void royaltyKing(int beginQuest)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Greetings traveller, I have many quests for you if you are willing to take them!");
		System.out.println("Begin quest? 1 for yes 0 to return to the village entrance.");
		beginQuest = input.nextInt();
		if(beginQuest == 1)
		{
			System.out.println("You've started your first quest");
			
			main(null);
		}
		else if(beginQuest == 0)
		{
			main(null);
		}
		else
			System.out.println("That is not an option");
			royaltyKing(beginQuest);
	}
}
