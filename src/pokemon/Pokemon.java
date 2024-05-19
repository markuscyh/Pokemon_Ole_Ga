package pokemon;

public class Pokemon {

	private String name;
	private double hp;
	private int attack;
	private int defense;
	private int sp_atk;
	private int sp_def;
	private int speed;
	private String type1;
	private String type2;
	private String move1;
	private String move2;
	private int maxpe;
	private int minpe;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String name) {
		this.name = name;
		this.hp = PokemonEncyclopedia.valueOf(name.toUpperCase()).getHP();
		this.attack = PokemonEncyclopedia.valueOf(name.toUpperCase()).getATTACK();
		this.defense = PokemonEncyclopedia.valueOf(name.toUpperCase()).getDEFENSE();
		this.sp_atk = PokemonEncyclopedia.valueOf(name.toUpperCase()).getSP_ATK();
		this.sp_def = PokemonEncyclopedia.valueOf(name.toUpperCase()).getSP_DEF();
		this.speed = PokemonEncyclopedia.valueOf(name.toUpperCase()).getSPEED();
		this.type1 = PokemonEncyclopedia.valueOf(name.toUpperCase()).getTYPE1();
		this.type2 = PokemonEncyclopedia.valueOf(name.toUpperCase()).getTYPE2();
		this.move1 = PokemonEncyclopedia.valueOf(name.toUpperCase()).getMOVE1();
		this.move2 = PokemonEncyclopedia.valueOf(name.toUpperCase()).getMOVE2();
		this.maxpe = PokemonEncyclopedia.valueOf(name.toUpperCase()).getMAXPE();
		this.minpe = PokemonEncyclopedia.valueOf(name.toUpperCase()).getMINPE();
	}

	public String getName() {
		return name;
	}

	public double getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getSp_atk() {
		return sp_atk;
	}

	public int getSp_def() {
		return sp_def;
	}

	public int getSpeed() {
		return speed;
	}

	public String getType1() {
		return type1;
	}

	public String getType2() {
		return type2;
	}
	
	public String getMove1() {
		return move1;
	}
	
	public String getMove2() {
		return move2;
	}
 
	public int getMaxpe() {
		return maxpe;
	}

	public int getMinpe() {
		return minpe;
	}
	
	public void setHp(double hp) {
		this.hp = hp;
	}
}
