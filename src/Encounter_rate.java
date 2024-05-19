

import java.util.Random;
import pokemon.*;

public class Encounter_rate {

	private int grade;
	private int random_pokemon;
	private Pokemon pokemon = new Pokemon();
	
	public Encounter_rate() {
		selectRandomgrade();
		
		if (grade == 1) {
			setEncounter_Grade1();
		}
		else if (grade == 2) {
			setEncounter_Grade2();
		}
		else if (grade == 3) {
			setEncounter_Grade3();
		}
		else if (grade == 4) {
			setEncounter_Grade4();
		}
		else if (grade == 5) {
			setEncounter_Grade5();
		}
		else if (grade == 6) {
			setEncounter_Grade6();
		}
		
	}
	
	//randomly select a grade
	private int selectRandomgrade() {
		Random random = new Random();
		int grade_selecter = random.nextInt(31) + 1;
		
		if (grade_selecter <= 10) {
			grade = 1;
		}
		else if (grade_selecter <= 18) {
			grade = 2;
		}
		else if (grade_selecter <= 24) {
			grade = 3;
		}
		else if (grade_selecter <= 28) {
			grade = 4;
		}
		else if (grade_selecter <= 30) {
			grade = 5;
		}
		else if (grade_selecter <= 31) {
			grade = 6;
		}
		
		return grade;
	}
	
	public void setEncounter_Grade1() {
		Random random = new Random();
		random_pokemon = random.nextInt(8) + 1;
		
		switch (random_pokemon) {
		case 1:
			pokemon = new Pokemon("Caterpie");
			break;
			
		case 2:
			pokemon = new Pokemon("Magikarp");
			break;
			
		case 3:
			pokemon = new Pokemon("Metapod");
			break;
		
		case 4:
			pokemon = new Pokemon("Pidgey");
			break;
			
		case 5:
			pokemon = new Pokemon("Rattata");
			break;
			
		case 6:
			pokemon = new Pokemon("Shuckle");
			break;
			
		case 7: 
			pokemon = new Pokemon("Sunkern");
			break;
			
		case 8:
			pokemon = new Pokemon("Swinub");
			break;}
		}
	
	public void setEncounter_Grade2() {
		Random random = new Random();
		random_pokemon = random.nextInt(11) + 1;
		
		switch (random_pokemon) {
		case 1:
			pokemon = new Pokemon("Beldum");
			break;
			
		case 2:
			pokemon = new Pokemon("Butterfree");
			break;
			
		case 3:
			pokemon = new Pokemon("Chimchar");
			break;
			
		case 4:
			pokemon = new Pokemon("Froakie");
			break;
			
		case 5:
			pokemon = new Pokemon("Larvitar");
			break;
			
		case 6: 
			pokemon = new Pokemon("Pidgeotto");
			break;
			
		case 7:
			pokemon = new Pokemon("Piloswine");;
			
		case 8: 
			pokemon = new Pokemon("Raticate");
			break;
			
		case 9:
			pokemon = new Pokemon("Rowlet");
			break;
			
		case 10:
			pokemon = new Pokemon("Skrelp");
			break;
			
		case 11:
			pokemon = new Pokemon("Sunflora");
			break;
		}
	}
	
	public void setEncounter_Grade3() {
		Random random = new Random();
		random_pokemon = random.nextInt(11) + 1;
		
		switch (random_pokemon) {
		case 1:
			pokemon = new Pokemon("Dartrix");
			break;
			
		case 2:
			pokemon = new Pokemon("Dragalge");
			break;
			
		case 3:
			pokemon = new Pokemon("Frogadier");
			break;
			
		case 4:
			pokemon = new Pokemon("Mamoswine");
			break;
			
		case 5:
			pokemon = new Pokemon("Mawile");
			break;
			
		case 6:
			pokemon = new Pokemon("Metang");
			break;
			
		case 7:
			pokemon = new Pokemon("Monferno");
			break;
			
		case 8:
			pokemon = new Pokemon("Pidgeot");
			break;
			
		case 9:
			pokemon = new Pokemon("Pikachu");
			break;
			
		case 10:
			pokemon = new Pokemon("Pupitar");
			break;
			
		case 11:
			pokemon = new Pokemon("Raichu");
		}
	}
	
	public void setEncounter_Grade4() {
		Random random = new Random();
		random_pokemon = random.nextInt(7) + 1;
		
		switch (random_pokemon) {
		case 1:
			pokemon = new Pokemon("Decidueye");
			break;
			
		case 2:
			pokemon = new Pokemon("Greninja");
			break;
			
		case 3:
			pokemon = new Pokemon("Gyarados");
			break;
			
		case 4:
			pokemon = new Pokemon("Infernape");
			break;
			
		case 5:
			pokemon = new Pokemon("Lapras");
			break;
			
		case 6:
			pokemon = new Pokemon("Metagross");
			break;
			
		case 7:
			pokemon = new Pokemon("Tyranitar");
			break;
		}
	}
	
	public void setEncounter_Grade5() {
		Random random = new Random();
		random_pokemon = random.nextInt(2) + 1;
		
		switch (random_pokemon) {
		case 1:
			pokemon = new Pokemon("HoOh");
			break;
			
		case 2:
			pokemon = new Pokemon("Lugia");
			break;
		}
	}
	
	public void setEncounter_Grade6() {
		Random random = new Random();
		random_pokemon = random.nextInt(1) + 1;
		
		switch (random_pokemon) {
		case 1:
			pokemon = new Pokemon("Arceus");
			break;
		}
	}

	public String getName() {
		return pokemon.getName();
	}

	public double getHp() {
		return pokemon.getHp();
	}

	public int getAttack() {
		return pokemon.getAttack();
	}

	public int getDefense() {
		return pokemon.getDefense();
	}

	public int getSp_atk() {
		return pokemon.getSp_atk();
	}

	public int getSp_def() {
		return pokemon.getSp_def();
	}

	public int getSpeed() {
		return pokemon.getSpeed();
	}

	public String getType1() {
		return pokemon.getType1();
	}

	public String getType2() {
		return pokemon.getType2();
	}
	
	public String getMove1() {
		return pokemon.getMove1();
	}
	
	public String getMove2() {
		return pokemon.getMove2();
	}
	
	public int getMaxpe() {
		return pokemon.getMaxpe();
		}
	
	public int getMinpe() {
		return pokemon.getMinpe();
	}

	public int getGrade() {
		return grade;
	}

}
