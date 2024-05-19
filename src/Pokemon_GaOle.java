import java.util.Scanner;
import pokemon.EnemyPokemon;
import pokemon.UserPokemon;
import battle.*;


public class Pokemon_GaOle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Pokemon Ole'Ga!\n");
		
		Encounter_rate encounterone = new Encounter_rate();
		Encounter_rate encountertwo = new Encounter_rate();
		Encounter_rate encounterthree = new Encounter_rate();

		System.out.println("You have encountered: ");
		//This section selects the first pokemon encountered
		System.out.println("1) A grade " + encounterone.getGrade() + " " + encounterone.getName() + ",");
		
		//This selects the second pokemon encountered
		System.out.println("2) A grade " + encountertwo.getGrade() + " " + encountertwo.getName() + ", ");
		
		//This selects the third pokemon encountered
		System.out.println("3) A grade " + encounterthree.getGrade() + " " + encounterthree.getName() + "\n");
		
		
		UserPokemon userpokemon1 = new UserPokemon();
		UserPokemon userpokemon2 = new UserPokemon();	
		EnemyPokemon enemypokemon1 = new EnemyPokemon();
		EnemyPokemon enemypokemon2 = new EnemyPokemon();
		
		System.out.println("Which of these Pokemon would you like to catch? (1-3)");
		
		int loop_tracker = 1;
		while (loop_tracker == 1) {
			System.out.print(">>> ");
			String chosen_pokemon = keyboard.next();
			
			if (chosen_pokemon.equals("1")) {
				loop_tracker++;
				userpokemon1 = new UserPokemon(encounterone.getName(), encounterone.getHp(), encounterone.getAttack(), encounterone.getDefense(), encounterone.getSp_atk(), encounterone.getSp_def(), encounterone.getSpeed(), encounterone.getType1(), encounterone.getType2(), encounterone.getMove1(), encounterone.getMove2(), encounterone.getMaxpe(), encounterone.getMinpe());
				enemypokemon1 = new EnemyPokemon(encountertwo.getName(), encountertwo.getHp(), encountertwo.getAttack(), encountertwo.getDefense(), encountertwo.getSp_atk(), encountertwo.getSp_def(), encountertwo.getSpeed(), encountertwo.getType1(), encountertwo.getType2(), encountertwo.getMove1(), encountertwo.getMove2(), encountertwo.getMaxpe(), encountertwo.getMinpe());
				enemypokemon2 = new EnemyPokemon(encounterthree.getName(), encounterthree.getHp(), encounterthree.getAttack(), encounterthree.getDefense(), encounterthree.getSp_atk(), encounterthree.getSp_def(), encounterthree.getSpeed(), encounterthree.getType1(), encounterthree.getType2(), encounterthree.getMove1(), encounterthree.getMove2(), encounterthree.getMaxpe(), encounterthree.getMinpe());				
				enemypokemon1.setGrade(encountertwo.getGrade());
				enemypokemon2.setGrade(encounterthree.getGrade());
			
			}
			else if (chosen_pokemon.equals("2")) {
				loop_tracker++;
				userpokemon1 = new UserPokemon(encountertwo.getName(), encountertwo.getHp(), encountertwo.getAttack(), encountertwo.getDefense(), encountertwo.getSp_atk(), encountertwo.getSp_def(), encountertwo.getSpeed(), encountertwo.getType1(), encountertwo.getType2(), encountertwo.getMove1(), encountertwo.getMove2(), encountertwo.getMaxpe(), encountertwo.getMinpe());
				enemypokemon1 = new EnemyPokemon(encounterone.getName(), encounterone.getHp(), encounterone.getAttack(), encounterone.getDefense(), encounterone.getSp_atk(), encounterone.getSp_def(), encounterone.getSpeed(), encounterone.getType1(), encounterone.getType2(), encounterone.getMove1(), encounterone.getMove2(), encounterone.getMaxpe(), encounterone.getMinpe());
				enemypokemon2 = new EnemyPokemon(encounterthree.getName(), encounterthree.getHp(), encounterthree.getAttack(), encounterthree.getDefense(), encounterthree.getSp_atk(), encounterthree.getSp_def(), encounterthree.getSpeed(), encounterthree.getType1(), encounterthree.getType2(), encounterthree.getMove1(), encounterthree.getMove2(), encounterthree.getMaxpe(), encounterthree.getMinpe());		
				enemypokemon1.setGrade(encounterone.getGrade());
				enemypokemon2.setGrade(encounterthree.getGrade());
			}
			else if (chosen_pokemon.equals("3")) {
				loop_tracker++;
				userpokemon1 = new UserPokemon(encounterthree.getName(), encounterthree.getHp(), encounterthree.getAttack(), encounterthree.getDefense(), encounterthree.getSp_atk(), encounterthree.getSp_def(), encounterthree.getSpeed(), encounterthree.getType1(), encounterthree.getType2(), encounterthree.getMove1(), encounterthree.getMove2(), encounterthree.getMaxpe(), encounterthree.getMinpe());		
				enemypokemon1 = new EnemyPokemon(encounterone.getName(), encounterone.getHp(), encounterone.getAttack(), encounterone.getDefense(), encounterone.getSp_atk(), encounterone.getSp_def(), encounterone.getSpeed(), encounterone.getType1(), encounterone.getType2(), encounterone.getMove1(), encounterone.getMove2(), encounterone.getMaxpe(), encounterone.getMinpe());
				enemypokemon2 = new EnemyPokemon(encountertwo.getName(), encountertwo.getHp(), encountertwo.getAttack(), encountertwo.getDefense(), encountertwo.getSp_atk(), encountertwo.getSp_def(), encountertwo.getSpeed(), encountertwo.getType1(), encountertwo.getType2(), encountertwo.getMove1(), encountertwo.getMove2(), encountertwo.getMaxpe(), encountertwo.getMinpe());

			}
			else {
				System.out.println("\nPlease enter a number from 1 to 3 to select your desired Pokemon. \n");
				
				System.out.println("You have encountered: ");
				System.out.println("1) A grade " + encounterone.getGrade() + " " + encounterone.getName() + ",");
				System.out.println("2) A grade " + encountertwo.getGrade() + " " + encountertwo.getName() + ", ");
				System.out.println("3) A grade " + encounterthree.getGrade() + " " + encounterthree.getName() + "\n");
			}
		}
		
		Encounter_rate rentalpokemon1 = new Encounter_rate();
		Encounter_rate rentalpokemon2 = new Encounter_rate();
		
		System.out.println("\nYou can select one of two pokemon to join you in the upcoming battle: ");
		System.out.println("1) A grade " + rentalpokemon1.getGrade() + " " + rentalpokemon1.getName() + ", ");
		System.out.println("2) A grade " + rentalpokemon2.getGrade() + " " + rentalpokemon2.getName() + "\n");
		
		System.out.println("Which of these Pokemon would you like to join you? (1-2)");

		loop_tracker = 1;
		while (loop_tracker == 1) {
			System.out.print(">>> ");
			String chosen_pokemon = keyboard.next();
			
			if (chosen_pokemon.equals("1")) {
				loop_tracker++;
				userpokemon2 = new UserPokemon(rentalpokemon1.getName(), rentalpokemon1.getHp(), rentalpokemon1.getAttack(), rentalpokemon1.getDefense(), rentalpokemon1.getSp_atk(), rentalpokemon1.getSp_def(), rentalpokemon1.getSpeed(), rentalpokemon1.getType1(), rentalpokemon1.getType2(), rentalpokemon1.getMove1(), rentalpokemon1.getMove2(), rentalpokemon1.getMaxpe(), rentalpokemon1.getMinpe());
				}
			else if (chosen_pokemon.equals("2")) {
				loop_tracker++;
				userpokemon2 = new UserPokemon(rentalpokemon2.getName(), rentalpokemon2.getHp(), rentalpokemon2.getAttack(), rentalpokemon2.getDefense(), rentalpokemon2.getSp_atk(), rentalpokemon2.getSp_def(), rentalpokemon2.getSpeed(), rentalpokemon2.getType1(), rentalpokemon2.getType2(), rentalpokemon2.getMove1(), rentalpokemon2.getMove2(), rentalpokemon1.getMaxpe(), rentalpokemon1.getMinpe());
				}
			else {
				System.out.println("\nPlease enter a number from 1 to 2 to select your desired Pokemon. \n");
				
				System.out.println("1) A grade " + rentalpokemon1.getGrade() + " " + rentalpokemon1.getName() + ", ");
				System.out.println("2) A grade " + rentalpokemon2.getGrade() + " " + rentalpokemon2.getName() + "\n");
			}
		}
		
		System.out.println("\nIt's A Battle!!! \n");
		System.out.println("*Que funky battle entrance animation and music* \n");
		
		int pokemon_battle;
		
		Battle battle = new Battle(userpokemon1, userpokemon2, enemypokemon1, enemypokemon2);
		
		pokemon_battle = battle.turnCounter();
		
		if (pokemon_battle == 0) {
			System.out.println("An error has occured");
		}
		
		if (pokemon_battle == 1) {
			System.out.println("You won the battle! \n");
			System.out.println("It's time to throw a Pokeball!");
			System.out.println("Enter a key to select a random Pokeball! ");
			System.out.print(">>> ");
			String input = keyboard.next();
			
			Pokeball pokeball = new Pokeball();
			
			System.out.println("\n" + pokeball.getPokeballType() + ", I choose you!!! \n");
			
			Catchrate catchpokemon1 = new Catchrate();
			Catchrate catchpokemon2 = new Catchrate();
			
			int success1 = catchpokemon1.catchResult(enemypokemon1.getGrade(), pokeball.getPokeballCatchrate());
			int success2 = catchpokemon2.catchResult(enemypokemon2.getGrade(), pokeball.getPokeballCatchrate());
			
			if (success1 == 1) {
				System.out.println("You have caught a " + enemypokemon1.getName() + "!");
			}
			else if (success1 == 0 ) {
				System.out.println("You did not catch " + enemypokemon1.getName() + ",");
			}
			
			if (success2 == 1) {
				System.out.println("You have caught a " + enemypokemon2.getName() + "!");
			}
			else if (success2 == 0 ) {
				System.out.println("You have caught a " + enemypokemon2.getName() + ".");
			}
			
			System.out.println("Thank you for playing!");
		}
		
		else {
			System.out.println("You lost the battle! \n");
			System.out.println("You have blacked out by the sheer shock of your loss.");
			System.out.println("Game Over!");
		}
		
		keyboard.close();
	}
}
