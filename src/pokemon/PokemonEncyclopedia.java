package pokemon;

public enum PokemonEncyclopedia {
	//Grade 1 pokemon
	CATERPIE("Caterpie", 105, 31, 36, 22, 22, 45, "Bug", null, "Tackle", "Bug_Bite", 1400, 700),
	MAGIKARP("Magikarp", 80, 13, 54, 18, 22, 76, "Water", null, "Splash", "Splash", 1400, 700),
	METAPOD("Metapod", 110, 22, 70, 27, 27, 31, "Bug", null, "Tackle", "Bug_Bite", 1400, 700),
	PIDGEY("Pidgey", 100, 45, 40, 36, 36, 54, "Normal", "Flying", "Tackle", "Gust", 1400, 700),
	RATTATA("Rattata", 90, 54, 36, 27, 36, 69, "Normal", null, "Tackle", "Bite", 1400, 700),
	SHUCKLE("Shuckle", 80, 13, 211, 13, 211, 9, "Bug", "Rock", "Bug_Bite", "Rock_Throw", 1400, 700),
	SUNKERN("Sunkern", 90, 31, 31, 31, 31, 31, "Grass", null, "Tackle", "Razor_Leaf", 1400, 700),
	SWINUB("Swinub", 110, 49, 40, 31, 31, 49, "Ice", "Ground", "Mud_Slap", "Powder_Snow", 1400, 700),
	
	//Grade 2 pokemon
	BELDUM("Beldum", 100, 54, 76, 36, 58, 31, "Steel", "Psychic", "Tackle", "Zen_Headbutt", 2000, 1300),
	BUTTERFREE("Butterfree", 120, 45, 49, 76, 76, 67, "Bug", "Flying", "Gust", "Bug_Buzz", 2000, 1300),
	CHIMCHAR("Chimchar", 120, 78, 65, 78, 65, 61, "Fire", null, "Scratch", "Ember", 2000, 1300),
	FROAKIE("Froakie", 101, 70, 65, 73, 67, 60, "Water", null, "Pound", "Water_Gun", 2000, 1300),
	LARVITAR("Larvitar", 110, 62, 50, 45, 49, 41, "Rock", "Ground", "Rock_Throw", "Bite", 2000, 1300),
	PIDGEOTTO("Pidgeotto", 123, 60, 58, 54, 54, 69, "Normal", "Flying", "Gust", "Wing_Attack", 2000, 1300),
	PILOSWINE("Piloswine", 160, 90, 75, 55, 55, 49, "Ice", "Ground", "Mud_Slap", "Ice_Fang", 2000 , 1300),
	RATICATE("Raticate", 115, 68, 67, 40, 76, 73, "Normal", null, "Tackle", "Crunch", 2000, 1300),
	ROWLET("Rowlet", 128, 69, 69, 64, 64, 58, "Grass", "Flying", "Tackle", "Razor_Leaf", 2000, 1300),
	SKRELP("Skrelp", 110, 60, 60, 60, 60, 31, "Poison", "Water", "Tackle", "Acid", 2000, 1300),
	SUNFLORA("Sunflora", 135, 72, 54, 99, 81, 31, "Grass", null, "Pound", "Razor_Leaf", 2000, 1300),
	
	//Grade 3 pokemon
	DARTRIX("Dartrix", 140, 75, 75, 70, 70, 61, "Grass", "Flying", "Leafage", "Pluck", 2600, 1900),
	DRAGALGE("Dragalge", 125, 80, 87, 92, 115, 44, "Poison", "Dragon", "Poison_Tail", "Dragon_Pulse", 2600,1900),
	FROGADIER("Frogadier", 137, 76, 69, 83, 71, 91, "Water", null, "Water_Gun", "Water_Pulse", 2600, 1900),
	MAMOSWINE("Mamoswine", 170, 120, 75, 65, 56, 74, "Ice", "Ground", "Ice_Fang", "Bulldoze", 2600, 1900),
	MAWILE("Mawile", 110, 90, 90, 53, 53, 49, "Steel", "Fairy", "Iron_Head", "Play_Rough", 2600, 1900),
	METANG("Metang", 120, 74, 94, 54, 76, 50, "Steel", "Psychic", "Zen_Headbutt", "Flash_Cannon", 2600, 1900),
	MONFERNO("Monferno", 145, 100, 78, 100, 78, 77, "Fire", "Fighting", "Flame_Wheel", "Low_Kick", 2600, 1900),
	PIDGEOT("Pidgeot", 143, 76, 72, 67, 67, 86, "Normal", "Flying", "Wing_Attack", "Aerial_Ace", 2600, 1900),
	PIKACHU("Pikachu", 100, 63, 50, 58, 55, 90, "Electric", null, "Tackle", "Thunderbolt", 2600, 1900),
	PUPITAR("Pupitar", 130, 83, 70, 63, 67, 50, "Rock", "Ground", "Bite", "Rock_Slide", 2600, 1900),
	RAICHU("Raichu", 120, 82, 54, 82, 73, 95, "Electric", null, "Thunderbolt", "Discharge", 2600, 1900),
	
	//Grade 4 pokemon
	DECIDUEYE("Decidueye", 161, 137, 105, 130, 130, 70, "Grass", "Ghost", "Leaf_Blade", "Spirit_Shackle", 0, 0),
	GRENINJA("Greninja", 155, 125, 97, 133, 101, 114, "Water", "Dark", "Water_Shuriken", "Night_Slash", 0, 0),
	GYARADOS("Gyarados", 178, 155, 109, 90, 130, 77, "Water", "Flying", "Hydro_Pump", "Dragon_Pulse", 0, 0),
	INFERNAPE("Infernape", 159, 134, 101, 134, 101, 101, "Fire", "Fighting", "Flare_Blitz", "Close_Combat", 0, 0),
	LAPRAS("Lapras", 222, 83, 77, 83, 91, 62, "Ice", "Water", "Ice_Beam", "Hydro_Pump", 0, 0),
	METAGROSS("Metagross", 140, 126, 121, 90, 82, 67, "Steel", "Psychic", "Psychic", "Meteor_Mash", 0, 0),
	TYRANITAR("Tyranitar", 160, 125, 103, 87, 87, 59, "Rock", "Dark", "Crunch", "Stone_Edge", 0, 0),
	
	//Grade 5 pokemon
	HOOH("Ho-Oh", 213, 200, 156, 178, 226, 156, "Fire", "Flying", "Sacred_Fire", "Sky_Attack", 0, 0),
	LUGIA("Lugia", 213, 156, 200, 156, 226, 178, "Psychic", "Flying", "Hydro_Pump", "Sky_Attack", 0, 0),
	
	//Grade 6 pokemon
	ARCEUS("Arceus", 444, 372, 372, 372, 372, 372, "Normal", null,"Hyper_Beam","Judgement", 0, 0);
	
	final String NAME;
	final double HP;
	final int ATTACK;
	final int DEFENSE;
	final int SP_ATK;
	final int SP_DEF;
	final int SPEED;
	final String TYPE1;
	final String TYPE2;
	final String MOVE1;
	final String MOVE2;
	final int MAXPE;
	final int MINPE;
	
	
	PokemonEncyclopedia(String name, double hp, int attack, int defense, int sp_atk, int sp_def, int speed, String type1, String type2, String move1, String move2, int maxpe, int minpe) {
		NAME = name;
		HP = hp;
		ATTACK = attack;
		DEFENSE = defense;
		SP_ATK = sp_atk;
		SP_DEF = sp_def;
		SPEED = speed;
		TYPE1 = type1;
		TYPE2 = type2;
		MOVE1 = move1;
		MOVE2 = move2;
		MAXPE = maxpe;
		MINPE = minpe;
	}

	public String getNAME() {
		return NAME;
	}

	public double getHP() {
		return HP;
	}

	public int getATTACK() {
		return ATTACK;
	}

	public int getDEFENSE() {
		return DEFENSE;
	}

	public int getSP_ATK() {
		return SP_ATK;
	}

	public int getSP_DEF() {
		return SP_DEF;
	}

	public int getSPEED() {
		return SPEED;
	}

	public String getTYPE1() {
		return TYPE1;
	}

	public String getTYPE2() {
		return TYPE2;
	}
	
	public String getMOVE1() {
		return MOVE1;
	}
	
	public String getMOVE2() {
		return MOVE2;
	}

	public int getMAXPE() {
		return MAXPE;
	}

	public int getMINPE() {
		return MINPE;
	}
	
	
}
