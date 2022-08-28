import java.util.*;

public class EldyRingo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int level = 9;
		int runes = 20000;
		int startingVig = 10;
		int startingEnd = 10;
		int startingStr = 10;
		int startingInt = 10;
		int startingFth = 10;
		String userInput;
		int levelCost = 1000;

		//START OF DIALOGUE
		System.out.println("***You arrive at the site of grace***");
		System.out.println("Level: " + level);
		System.out.println("Runes : " + runes);
		System.out.println(" ");

		while(true) {

			System.out.println("-Pass Time ");
			System.out.println("-Level Up");

			System.out.println(" ");

			System.out.println("Select action: ");
			userInput = scanner.nextLine();

			//PASS TIME
			if (userInput.equalsIgnoreCase("pass time"))
			{
				System.out.println("it is morning!");
				System.out.println(" ");
				break;
			}

			//LEVEL UP
			else if (userInput.equalsIgnoreCase("level up"))
			{ 

				System.out.println(" ");
				System.out.println(" *----------------------* ");
				System.out.println(" ' Vigor - " +	startingVig + " 		' ");
				System.out.println(" ' Endurance - " + startingEnd + "	' ");
				System.out.println(" ' Strength - " + startingStr + "	' ");
				System.out.println(" ' Intelligence - " + startingInt + "	' ");
				System.out.println(" ' Faith - " + startingFth +	"		' ");
				System.out.println(" *----------------------* ");

				System.out.println("Choose attribute to upgrade: "); 
				userInput = scanner.nextLine();

				if (runes < levelCost) {    
					System.out.println("Not enough runes!!!");
					break;
				}

				if (userInput.equalsIgnoreCase("vigor") || userInput.equalsIgnoreCase("vig"))
				{
					System.out.println("Leveled up vigor!");
					level++;
					startingVig++;
					System.out.println("Level: " + level);
					System.out.println("Runes: " + (runes -= 1000));
				}
				if (userInput.equalsIgnoreCase("endurance") || userInput.equalsIgnoreCase("end"))
				{
					System.out.println("Leveled up endurance!");
					level++;
					startingEnd++;
					System.out.println("Level: " + level);
					System.out.println("Runes: " + (runes -= 1000));
				}
				if (userInput.equalsIgnoreCase("strength") || userInput.equalsIgnoreCase("str"))
				{
					System.out.println("Leveled up strength!");
					level++;
					startingStr++;
					System.out.println("Level: " + level);
					System.out.println("Runes: " + (runes -= 1000));
				}
				if (userInput.equalsIgnoreCase("intelligence") || userInput.equalsIgnoreCase("int"))
				{
					System.out.println("Leveled up intelligence!");
					level++;
					startingInt++;

					System.out.println("Level: " + level);
					System.out.println("Runes: " + (runes -= 1000));
				}
				if (userInput.equalsIgnoreCase("faith") || userInput.equalsIgnoreCase("fth"))
				{
					System.out.println("Leveled up faith!");
					level++;
					startingFth++;

					System.out.println("Level: " + (level + 1));
					System.out.println("Runes: " + (runes -= 1000));
				}

				System.out.println("Continue to level up? (y/n)");
				String playAgain = scanner.nextLine();

				if (!playAgain.equalsIgnoreCase("y")){
					System.out.println("***You leave the site of grace***");
					break;
				}

			}
		}
	}
}
