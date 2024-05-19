package move;


public class Move {

    private String moveName;
    private String movePokemonType;
    private String moveCategory;
    private double movePower;
    private int accuracy;
    private int atkbuff;
    private int defbuff;
    private int atknerf;
    private int defnerf;
    
    public Move() {
    	
    }
    
    public Move(String moveName) {
        this.moveName = moveName;
        this.movePokemonType = MovesEncyclopedia.valueOf(moveName.toUpperCase()).getMOVETYPE();
        this.moveCategory = MovesEncyclopedia.valueOf(moveName.toUpperCase()).getMOVECATEGORY();
        this.movePower =  MovesEncyclopedia.valueOf(moveName.toUpperCase()).getPOWER();
        this.accuracy = MovesEncyclopedia.valueOf(moveName.toUpperCase()).getACCURACY();
        this.atkbuff = MovesEncyclopedia.valueOf(moveName.toUpperCase()).getATKBUFF();
        this.defbuff = MovesEncyclopedia.valueOf(moveName.toUpperCase()).getDEFBUFF();
        this.atknerf = MovesEncyclopedia.valueOf(moveName.toUpperCase()).getATKNERF();
        this.defnerf = MovesEncyclopedia.valueOf(moveName.toUpperCase()).getDEFNERF();
    }

    public String getMoveName() {
        return moveName;
    }

    public String getMoveType() {
        return movePokemonType;
    }

    public String getMoveCategory() {
        return moveCategory;
    }

    public double getMovePower() {
        return movePower;
    }
    
    public int getAccuracy() {
    	return accuracy;
    }
    
    public int getAtkbuff() {
    	return atkbuff;
    }
    
    public int getDefbuff() {
    	return defbuff;
    }
    
    public int getAtknerf() {
    	return atknerf;
    }
    
    public int getDefnerf() {
    	return defnerf;
    }
}
