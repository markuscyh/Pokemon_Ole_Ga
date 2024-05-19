import java.util.Random;

public class Pokeball {

    private int random_pokeball;
    private static String pokeball_type;
    private static double pokeball_catchrate;
    
    Random random = new Random();

    public Pokeball() {
    	random_pokeball = random.nextInt(199) + 1;
    	
    	if (random_pokeball <= 80) {
    		pokeball_type = "Pokeball";
    		pokeball_catchrate = 1;
    	}
    	else if (random_pokeball <= 140) {
    		pokeball_type = "Greatball";
    		pokeball_catchrate = 1.5;
    	}
    	else if (random_pokeball <= 185) {
    		pokeball_type = "Ultraball";
    		pokeball_catchrate = 2;
    	}
    	else if (random_pokeball == 200) {
    		pokeball_type = "Masterball";
    		pokeball_catchrate = 100;
    	}
    }

    /*Getter for pokeball type*/
    public String getPokeballType(){
        return pokeball_type;
    }

    /*Getter for pokeball catchrate*/
    public double getPokeballCatchrate(){
        return pokeball_catchrate;
    }

    
}