package pokemon;

import move.*;

public class UserPokemon {
	private String name;
	private double hp;
	private int attack;
	private int defense;
	private int sp_atk;
	private int sp_def;
	private int speed;
	private String type1;
	private String type2;
	private String movecode1;
	private String movecode2;
	private Move move1 = new Move();
	private Move move2 = new Move();
	private int maxpe;
	private int minpe;
	
	
	public UserPokemon() {
	}

	public UserPokemon(String name, double hp, int attack, int defense, int sp_atk, int sp_def, int speed, String type1,
			String type2, String Move1, String Move2, int maxpe, int minpe) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.sp_atk = sp_atk;
		this.sp_def = sp_def;
		this.speed = speed;
		this.type1 = type1;
		this.type2 = type2;
		movecode1 = Move1;
		movecode2 = Move2;
		move1 = new Move(Move1);
		move2 = new Move(Move2);
		this.maxpe = maxpe;
		this.minpe = minpe;
	}
	
	public UserPokemon(UserPokemon user) {
		name = user.getName();
		hp = user.getHp();
		attack = user.getAttack();
		defense = user.getDefense();
		sp_atk = user.getSp_atk();
		sp_def = user.getSp_def();
		speed = user.getSpeed();
		type1 = user.getType1();
		type2 = user.getType2();
		movecode1 = user.getMovecode1();
		movecode2 = user.getMovecode2();
		move1 = new Move(movecode1);
		move2 = new Move(movecode2);
		maxpe = user.getMaxpe();
		minpe = user.getMinpe();
	}

	public String getName() {
		return name;
	}

	public double getHp() {
		return hp;
	}
	
	public void setHp(double hp) {
		this.hp = hp;
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

	public int getMaxpe() {
		return maxpe;
	}
	
	public int getMinpe() {
		return minpe;
	}
	
	public String getMovecode1() {
		return movecode1;
	}
	
	public String getMovecode2() {
		return movecode2;
	}
	
	public String getMovename1() {
		return move1.getMoveName();
	}
	
	public String getMovetype1() {
		return move1.getMoveType();
	}
	
	public String getMovecategory1() {
		return move1.getMoveCategory();
	}
	
	public double getMovepower1() {
		return move1.getMovePower();
	}
	
	public int getMoveaccuracy1() {
		return move1.getAccuracy();
	}
	
	public int getAtkbuff1() {
		return move1.getAtkbuff();
	}
	
	public int getDefbuff1() {
		return move1.getDefbuff();
	}
	
	public int getAtknerf1() {
		return move1.getAtknerf();
	}
	
	public int getDefnerf1() {
		return move1.getDefnerf();
	}
	
	public String getMovename2() {
		return move2.getMoveName();
	}
	
	public String getMovetype2() {
		return move2.getMoveType();
	}
	
	public String getMovecategory2() {
		return move2.getMoveCategory();
	}
	
	public double getMovepower2() {
		return move2.getMovePower();
	}
	
	public int getMoveaccuracy2() {
		return move2.getAccuracy();
	}
	
	public int getAtkbuff2() {
		return move1.getAtkbuff();
	}
	
	public int getDefbuff2() {
		return move1.getDefbuff();
	}
	
	public int getAtknerf2() {
		return move1.getAtknerf();
	}
	
	public int getDefnerf2() {
		return move1.getDefnerf();
	}
	
}	