package battle;

import java.util.List;

public class Type_effectiveness_calculations {
	
	List<String> normal_ineffective = List.of("Rock", "Steel");
	List<String> normal_immune = List.of("Ghost");
	
	List<String> fire_effective = List.of("Grass","Ice","Bug","Steel");
	List<String> fire_ineffective = List.of("Fire","Water","Rock","Dragon");
	
	List<String> water_effective = List.of("Fire","Ground","Rock");
	List<String> water_ineffective = List.of("Water","Grass","Dragon");
	
	List<String> electric_effective = List.of("Water","Flying");
	List<String> electric_ineffective = List.of("Electric","Grass","Dragon");
	List<String> electric_immune = List.of("Ground");
	
	List<String> grass_effective = List.of("Water","Ground","Rock");
	List<String> grass_ineffective = List.of("Fire","Grass","Poison","Flying","Bug","Dragon","Steel");
	
	List<String> ice_effective = List.of("Grass","Ground","Flying","Dragon");
	List<String> ice_ineffective = List.of("Fire","Water","Ice","Steel");
	
	List<String> fighting_effective = List.of("Normal","Ice","Dark","Steel","Rock");
	List<String> fighting_ineffective = List.of("Poison","Flying","Psychic","Bug","Fairy");
	List<String> fighting_immune = List.of("Ghost");
	
	List<String> poison_effective = List.of("Grass","Fairy");
	List<String> poison_ineffective = List.of("Poison","Ground","Rock","Ghost");
	List<String> poison_immune = List.of("Steel");
	
	List<String> ground_effective = List.of("Fire","Electric","Poison","Rock","Steel");
	List<String> ground_ineffective = List.of("Grass","Bug");
	List<String> ground_immune = List.of("Flying");
	
	List<String> flying_effective = List.of("Grass","Fighting","Bug");
	List<String> flying_ineffective = List.of("Electric","Rock","Steel");
	
	List<String> psychic_effective = List.of("Fighting","Poison");
	List<String> psychic_ineffective = List.of("Psychic","Steel");
	List<String> psychic_immune = List.of("Dark");
	
	List<String> bug_effective = List.of("Grass","Psychic","Dark");
	List<String> bug_ineffective = List.of("Fire","Fighting","Poison","Flying","Ghost","Steel","Fairy");
	
	List<String> rock_effective = List.of("Fire","Flying","Ice","Bug");
	List<String> rock_ineffective = List.of("Fighting","Ground","Steel");
	
	List<String> ghost_effective = List.of("Psychic","Ghost");
	List<String> ghost_ineffective = List.of("Dark");
	List<String> ghost_immune = List.of("Normal");
	
	List<String> dragon_effective = List.of("Dragon");
	List<String> dragon_ineffective = List.of("Steel");
	List<String> dragon_immune = List.of("Fairy");
	
	List<String> dark_effective = List.of("Psychic","Ghost");
	List<String> dark_ineffective = List.of("Fighting","Dark","Fairy");
	
	List<String> steel_effective = List.of("Ice","Rock","Fairy");
	List<String> steel_ineffective = List.of("Fire","Water","Electric","Steel");
	
	List<String> fairy_effective = List.of("Fighting","Dragon","Dark");
	List<String> fairy_ineffective = List.of("Fire","Poison","Steel");
	
	public Type_effectiveness_calculations() {
		
	}
	
	public double type_checker(double damage, String attacking_type, String defending_type) {
		if (attacking_type.equals("Normal")) {
			damage = normal_check(damage, defending_type);}
		
		else if (attacking_type.equals("Fire")) {
			damage = fire_check(damage, defending_type);}
		
		else if (attacking_type.equals("Water")) {
			damage = water_check(damage, defending_type);}
		
		else if (attacking_type.equals("Electric")) {
			damage = electric_check(damage, defending_type);}
		
		else if (attacking_type.equals("Grass")) {
			damage = grass_check(damage, defending_type);}
		
		else if (attacking_type.equals("Ice")) {
			damage = ice_check(damage, defending_type);}
		
		else if (attacking_type.equals("Fighting")) {
			damage = fighting_check(damage, defending_type);}
		
		else if (attacking_type.equals("Poison")) {
			damage = poison_check(damage, defending_type);}
		
		else if (attacking_type.equals("Ground")) {
			damage = ground_check(damage, defending_type);}
		
		else if (attacking_type.equals("Flying")) {
			damage = flying_check(damage, defending_type);}
		
		else if (attacking_type.equals("Psychic")) {
			damage = psychic_check(damage, defending_type);}
		
		else if (attacking_type.equals("Bug")) {
			damage = bug_check(damage, defending_type);}
		
		else if (attacking_type.equals("Rock")) {
			damage = rock_check(damage, defending_type);}
		
		else if (attacking_type.equals("Ghost")) {
			damage = ghost_check(damage, defending_type);}
		
		else if (attacking_type.equals("Dragon")) {
			damage = dragon_check(damage, defending_type);}
		
		else if (attacking_type.equals("Dark")) {
			damage = dark_check(damage, defending_type);}
		
		else if (attacking_type.equals("Steel")) {
			damage = steel_check(damage, defending_type);}
		
		else if (attacking_type.equals("Fairy")) {
			damage = fairy_check(damage, defending_type);}
		
		return damage;
	}
	
	public double normal_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (normal_ineffective.contains(defending_type)) {
			damage /= 2;}

		return damage;
	}
	
	public double fire_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (fire_effective.contains(defending_type)) {
			damage *= 2;}
		else if (fire_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}

	public double water_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (water_effective.contains(defending_type)) {
			damage *= 2;}
		else if (water_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}

	public double electric_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (electric_effective.contains(defending_type)) {
			damage *= 2;}
		else if (electric_ineffective.contains(defending_type)) {
			damage /= 2;}

		return damage;
	}
	
	public double grass_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (grass_effective.contains(defending_type)) {
			damage *= 2;}
		else if (grass_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	public double ice_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (ice_effective.contains(defending_type)) {
			damage *= 2;}
		else if (ice_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	public double fighting_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (fighting_effective.contains(defending_type)) {
			damage *= 2;}
		else if (fighting_ineffective.contains(defending_type)) {
			damage /= 2;}

		return damage;
	}
	
	public double poison_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (poison_effective.contains(defending_type)) {
			damage *= 2;}
		else if (poison_ineffective.contains(defending_type)) {
			damage /= 2;}
		else if (poison_immune.contains(defending_type)) {
			damage = 0;}
		
		return damage;
	}
	
	public double ground_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (ground_effective.contains(defending_type)) {
			damage *= 2;}
		else if (ground_ineffective.contains(defending_type)) {
			damage /= 2;}

		return damage;
	}
	
	public double flying_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (flying_effective.contains(defending_type)) {
			damage *= 2;}
		else if (flying_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	public double psychic_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (psychic_effective.contains(defending_type)) {
			damage *= 2;}
		else if (psychic_ineffective.contains(defending_type)) {
			damage /= 2;}

		return damage;
	}
	
	public double bug_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (bug_effective.contains(defending_type)) {
			damage *= 2;}
		else if (bug_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	public double rock_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (rock_effective.contains(defending_type)) {
			damage *= 2;}
		else if (rock_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	public double ghost_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (ghost_effective.contains(defending_type)) {
			damage *= 2;}
		else if (ghost_ineffective.contains(defending_type)) {
			damage /= 2;}

		return damage;
	}
	
	public double dragon_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (dragon_effective.contains(defending_type)) {
			damage *= 2;}
		else if (dragon_ineffective.contains(defending_type)) {
			damage /= 2;}

		return damage;
	}
	
	public double dark_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (dark_effective.contains(defending_type)) {
			damage *= 2;}
		else if (dark_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	public double steel_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (steel_effective.contains(defending_type)) {
			damage *= 2;}
		else if (steel_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	public double fairy_check(double damage, String defending_type) {
		if (defending_type == null) {
			damage *= 1;}
		else if (fairy_effective.contains(defending_type)) {
			damage *= 2;}
		else if (fairy_ineffective.contains(defending_type)) {
			damage /= 2;}
		
		return damage;
	}
	
	// Checks if the damage goes below 1 and if the damage was nullified by types.
	public double finalDamagechecker(double damage, String attacking_type , String defending_type1, String defending_type2) {
		if (damage <= 0) {
			damage = 1;
		}
		
		if (attacking_type == "Normal") {
			if (defending_type1 != null) {
				if (normal_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (normal_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		else if (attacking_type == "Electric") {
			if (defending_type1 != null) {
				if (electric_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (electric_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		else if (attacking_type == "Fighting") {
			if (defending_type1 != null) {
				if (fighting_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (fighting_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		else if (attacking_type == "Poison") {
			if (defending_type1 != null) {
				if (poison_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (poison_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		else if (attacking_type == "Ground") {
			if (defending_type1 != null) {
				if (ground_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (ground_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		else if (attacking_type == "Psychic") {
			if (defending_type1 != null) {
				if (psychic_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (psychic_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		else if (attacking_type == "Ghost") {
			if (defending_type1 != null) {
				if (ghost_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (ghost_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		else if (attacking_type == "Dragon") {
			if (defending_type1 != null) {
				if (dragon_immune.contains(defending_type1)) {
					damage = 0;
				}
			}
			if (defending_type2 != null) {
				if (dragon_immune.contains(defending_type2)) {
					damage = 0;
				}
			}
		}
		return damage;
	}

}
