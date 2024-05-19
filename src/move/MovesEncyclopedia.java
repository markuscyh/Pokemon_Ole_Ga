package move;

public enum MovesEncyclopedia {
	LEAFAGE("Leafage","Grass", "Physical", 60, 100, 0, 0, 0, 0),
	TACKLE("Tackle", "Normal", "Physical", 40, 100, 0, 0, 0, 0),
	BUG_BITE("Bug Bite", "Bug", "Physical", 60, 100, 0, 0, 0, 0),
	SPLASH("Splash", "Water", "Physical", 0, 100, 0, 0, 0, 0),
	HARDEN("Harden", "Normal", "Status", 0, 100, 0, 20, 0, 0),
	GUST("Gust", "Flying", "Special", 40, 100, 0, 0, 0, 0),
	BITE("Bite", "Dark", "Physical", 60, 100, 0, 0, 0, 0),
	ROCK_THROW("Rock Throw", "Rock", "Physical", 50, 90, 0, 0, 0, 0),
	RAZOR_LEAF("Razor Leaf", "Grass", "Physical", 55, 100, 0, 0, 0, 0),
	MUD_SLAP("Mud_Slap", "Ground", "Special", 20, 100, 0, 0, 0, 0),
	POWDER_SNOW("Powder Snow", "Ice", "Special", 40, 100, 0, 0, 0, 0),
	ZEN_HEADBUTT("Zen Headbutt", "Psychic", "Physical", 80, 90, 0, 0, 0, 0),
	BUG_BUZZ("Bug Buzz", "Bug", "Special", 90, 100, 0, 0, 0, 0),
	SCRATCH("Scratch", "Normal", "Physical", 40, 100, 0, 0, 0, 0),
	EMBER("Ember", "Fire", "Special", 40, 100, 0, 0, 0, 0),
	POUND("Pound", "Normal", "Physical", 40, 100, 0, 0, 0, 0),
	WATER_GUN("Water Gun", "Water", "Special", 40, 100, 0, 0, 0, 0),
	WING_ATTACK("Wing Attack", "Flying", "Physical", 60, 100, 0, 0, 0, 0),
	ICE_FANG("Ice Fang", "Ice", "Physical", 65, 95, 0, 0, 0, 0),
	CRUNCH("Crunch", "Dark", "Physical", 80, 100, 0, 0, 0, 0),
	ACID("Acid", "Poison", "Special", 40, 100, 0, 0, 0, 0),
	PLUCK("Pluck", "Flying", "Physical", 60, 100, 0, 0, 0, 0),
	POISON_TAIL("Poison Tail", "Poison", "Physical", 50, 100, 0, 0, 0, 0),
	DRAGON_PULSE("Dragon Pulse", "Dragon", "Special", 85, 100, 0, 0, 0, 0),
	WATER_PULSE("Water Pulse", "Water", "Special", 60, 100, 0, 0, 0, 0),
	BULLDOZE("Bulldoze", "Ground", "Physical", 60, 100, 0, 0, 0, 0),
	IRON_HEAD("Iron Head", "Steel", "Physical", 80, 100, 0, 0, 0, 0),
	PLAY_ROUGH("Play Rough", "Fairy", "Physical", 90, 90, 0, 0, 0, 0),
	FLASH_CANNON("Flash Cannon", "Steel", "Special", 80, 100, 0, 0, 0, 0),
	FLAME_WHEEL("Flame Wheel", "Fire", "Physical", 60, 100, 0, 0, 0, 0),
	LOW_KICK("Low Kick", "Fighting", "Physical", 65, 100, 0, 0, 0, 0),
	AERIAL_ACE("Aerial Ace", "Flying", "Physical", 60, 100, 0, 0, 0, 0),	
    THUNDERBOLT("Thunderbolt", "Electric", "Special", 90, 100, 0, 0, 0, 0),
	ROCK_SLIDE("Rock Slide", "Rock", "Physical", 75, 90, 0, 0, 0, 0),
	DISCHARGE("Discharge", "Electric", "Special", 80, 100, 0, 0, 0, 0),
	LEAF_BLADE("Leaf Blade", "Grass", "Physical", 90, 100, 0, 0, 0, 0),
	SPIRIT_SHACKLE("Spirit Shackle", "Ghost", "Physical", 80, 100, 0, 0, 0, 0),
	WATER_SHURIKEN("Water Shuriken", "Water", "Special", 75, 100, 0, 0, 0, 0),
	NIGHT_SLASH("Night Slash", "Dark", "Physical", 70, 100, 0, 0, 0, 0),
	HYDRO_PUMP("Hydro Pump", "Water", "Special", 110, 100, 0, 0, 0, 0),
	FLARE_BLITZ("Flare Blitz", "Fire", "Physical", 120, 100, 0, 0, 0, 0),
	CLOSE_COMBAT("Close Combat", "Fighting", "Physical", 120, 100, 0, 0, 0, -20),
	ICE_BEAM("Ice Beam", "Ice", "Special", 90, 100, 0, 0, 0, 0),
	PSYCHIC("Psychic", "Psychic", "Special", 90, 100, 0, 0, 0, 0),
	METEOR_MASH("Meteor Mash", "Steel", "Physical", 90, 100, 0, 0, 0, 0),
	STONE_EDGE("Stone Edge", "Rock", "Physical", 100, 80, 0, 0, 0, 0),
	SACRED_FIRE("Sacred Fire", "Fire", "Physical", 100, 95, 0, 0, 0, 0),
	SKY_ATTACK("Sky_Attack", "Flying", "Physical", 140, 90, 0, 0, 0, 0),
	HYPER_BEAM("Hyper Beam", "Normal", "Special", 150, 90, 0, 0, 0, 0),
	JUDGEMENT("Judgement", "Normal", "Special", 150, 100, 0, 0, 0, 0);

    final String NAME;
    final String MOVETYPE;
    final String MOVECATEGORY;
    final double POWER;
    final int ACCURACY;
    final int ATK_BUFF;
    final int DEF_BUFF;
    final int ATK_NERF;
    final int DEF_NERF;

    MovesEncyclopedia(String name, String moveType, String moveCategory, double power, int accuracy, int atk_buff, int def_buff, int atk_nerf, int def_nerf){
        NAME = name;
        MOVETYPE = moveType;
        MOVECATEGORY = moveCategory;
        POWER = power;
        ACCURACY = accuracy;
        ATK_BUFF = atk_buff;
        DEF_BUFF = def_buff;
        ATK_NERF = atk_nerf;
        DEF_NERF = def_nerf;
    }

    public String getNAME() {
        return NAME;
    }

    public String getMOVETYPE() {
        return MOVETYPE;
    }

    public String getMOVECATEGORY() {
        return MOVECATEGORY;
    }
    public double getPOWER() {
        return POWER;
    }

    public int getACCURACY() {
        return ACCURACY;
    }
    
    public int getATKBUFF() {
    	return ATK_BUFF;
    }
    
    public int getDEFBUFF() {
    	return DEF_BUFF;
    }
    
    public int getATKNERF() {
    	return ATK_NERF;
    }
    
    public int getDEFNERF() {
    	return DEF_NERF;
    }
  
}

