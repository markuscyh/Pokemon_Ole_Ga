package battle;

import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import pokemon.*;

public class Battle {
	
	private UserPokemon userpokemon1 = new UserPokemon();
	private UserPokemon userpokemon2 = new UserPokemon();
	private EnemyPokemon enemypokemon1 = new EnemyPokemon();
	private EnemyPokemon enemypokemon2 = new EnemyPokemon();
	private String battlestatus = "Yes";
	private int targetselector;
	private int moveselector;
	
	private Type_effectiveness_calculations type_calculations = new Type_effectiveness_calculations();
		
	Random random = new Random();
	Scanner keyboard = new Scanner(System.in);
	
	private int userspeed1;
	private int userspeed2;
	private int enemyspeed1;
	private int enemyspeed2;
	
	private int userturncounter1;
	private int userturncounter2;
	private int enemyturncounter1;
	private int enemyturncounter2;
	
	public Battle(UserPokemon user1, UserPokemon user2, EnemyPokemon enemy1, EnemyPokemon enemy2) { 
		userpokemon1 = new UserPokemon(user1);
		userpokemon2 = new UserPokemon(user2);
		enemypokemon1 = new EnemyPokemon(enemy1);
		enemypokemon2 = new EnemyPokemon(enemy2);
		userspeed1 = 400 - userpokemon1.getSpeed();
		userspeed2 = 400 - userpokemon2.getSpeed();
		enemyspeed1 = 400 - enemypokemon1.getSpeed();
		enemyspeed2 = 400 - enemypokemon2.getSpeed();
		userturncounter1 = userspeed1;
		userturncounter2 = userspeed2;
		enemyturncounter1 = enemyspeed1;
		enemyturncounter2 = enemyspeed2;
	}

	public int turnCounter() {
		randomTargetselector();
		int outcome = 0;
		
		hpInfo();
		
		while (battlestatus.equals("Yes")) {
			userturncounter1 -= 1;
			userturncounter2 -= 1;
			enemyturncounter1 -= 1;
			enemyturncounter2 -= 1;
			
			if (userturncounter1 == 0) {
				userturncounter1 = userspeed1;
				
				if (userpokemon1.getHp() == 0) {
					System.out.println(userpokemon1.getName() + " has fainted");
				}
				else {
				String selectedmove = moveSelector(userpokemon1.getName(), userpokemon1.getMovecode1(), userpokemon1.getMovecode2());
				String selectedtarget = targetSelector();
				
				attackSimulation1(selectedmove, selectedtarget);
				}
			}
			else if (userturncounter2 == 0) {
				userturncounter2 = userspeed2;
				
				if (userpokemon2.getHp() == 0) {
					System.out.println(userpokemon2.getName() + " has fainted");
				}
				else {
				String selectedmove = moveSelector(userpokemon2.getName(), userpokemon2.getMovecode1(), userpokemon2.getMovecode2());
				String selectedtarget = targetSelector();
				
				attackSimulation2(selectedmove, selectedtarget);	
				}
			}
			else if (enemyturncounter1 == 0) {
				enemyturncounter1 = enemyspeed1;	
				if (enemypokemon1.getHp() >= 0) {
					System.out.println("It is the enemy " + enemypokemon1.getName() + "'s turn.");
					randomTargetselector();
					
					if (targetselector == 1) {										
						if (moveselector == 1) {
							System.out.println(enemypokemon1.getName() + " attacks " + userpokemon1.getName() + " using " + enemypokemon1.getMovename1());
							double damage = enemypokemon1.getAttack() * (enemypokemon1.getMovepower1()/100);
							if (enemypokemon1.getMovecategory1().equals("Physical")) {
								double finaldamage = damage - userpokemon1.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype1(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
							
							else if (enemypokemon1.getMovecategory1().equals("Special")) {
								double finaldamage = damage - userpokemon1.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype1(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
						}
						else if (moveselector == 2) {
							System.out.println(enemypokemon1.getName() + " attacks " + userpokemon1.getName() + " using " + enemypokemon1.getMovename2());
							double damage = enemypokemon1.getAttack() * (enemypokemon1.getMovepower2()/100);
							if (enemypokemon1.getMovecategory2().equals("Physical")) {
								double finaldamage = damage - userpokemon1.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype2(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
							
							else if (enemypokemon1.getMovecategory2().equals("Special")) {
								double finaldamage = damage - userpokemon1.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype2(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
						}
					}
					else if (targetselector == 2) {															
						if (moveselector == 1) {
							System.out.println(enemypokemon1.getName() + " attacks " + userpokemon2.getName() + " using " + enemypokemon1.getMovename1());
							double damage = enemypokemon1.getAttack() * (enemypokemon1.getMovepower1()/100);
							if (enemypokemon1.getMovecategory1().equals("Physical")) {
								double finaldamage = damage - userpokemon2.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype1(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
							
							else if (enemypokemon1.getMovecategory1().equals("Special")) {
								double finaldamage = damage - userpokemon2.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype1(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
						}
						else if (moveselector == 2) {
							System.out.println(enemypokemon1.getName() + " attacks " + userpokemon2.getName() + " using " + enemypokemon1.getMovename2());
							double damage = enemypokemon1.getAttack() * (enemypokemon1.getMovepower2()/100);
							if (enemypokemon1.getMovecategory2().equals("Physical")) {
								double finaldamage = damage - userpokemon2.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype2(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
							else if (enemypokemon1.getMovecategory2().equals("Special")) {
								double finaldamage = damage - userpokemon2.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon1.getMovetype2(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
						}
					}
					hpInfo();
					try {
			            Thread.sleep(2000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				}
				
			}
			else if (enemyturncounter2 == 0) {
				enemyturncounter2 = enemyspeed2;
				if (enemypokemon2.getHp() >= 0) {				
					System.out.println("It is the enemy " + enemypokemon2.getName() + "'s turn.");
					randomTargetselector();
					
					if (targetselector == 1) {										
						if (moveselector == 1) {
							System.out.println(enemypokemon2.getName() + " attacks " + userpokemon1.getName() + " using " + enemypokemon2.getMovename1());
							double damage = enemypokemon2.getAttack() * (enemypokemon2.getMovepower1()/100);
							if (enemypokemon2.getMovecategory1().equals("Physical")) {
								double finaldamage = damage - userpokemon1.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype1(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
							
							else if (enemypokemon2.getMovecategory1().equals("Special")) {
								double finaldamage = damage - userpokemon1.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype1(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
						}
						else if (moveselector == 2) {
							System.out.println(enemypokemon2.getName() + " attacks " + userpokemon1.getName() + " using " + enemypokemon2.getMovename2());
							double damage = enemypokemon2.getAttack() * (enemypokemon2.getMovepower2()/100);
							if (enemypokemon2.getMovecategory2().equals("Physical")) {
								double finaldamage = damage - userpokemon2.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype2(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
							
							else if (enemypokemon2.getMovecategory2().equals("Special")) {
								double finaldamage = damage - userpokemon2.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype2(), userpokemon1.getType1(), userpokemon1.getType2());
								
								userpokemon1.setHp(userpokemon1.getHp() - finaldamage);
							}
						}
						
					}
					else if (targetselector == 2) {										
						System.out.println(enemypokemon2.getName() + " attacks " + userpokemon2.getName());
						
						if (moveselector == 1) {
							System.out.println(enemypokemon2.getName() + " attacks " + userpokemon2.getName() + " using " + enemypokemon2.getMovename1());
							double damage = enemypokemon2.getAttack() * (enemypokemon2.getMovepower1()/100);
							if (enemypokemon2.getMovecategory1().equals("Physical")) {
								double finaldamage = damage - userpokemon2.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype1(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
							
							else if (enemypokemon2.getMovecategory1().equals("Special")) {
								double finaldamage = damage - userpokemon2.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype1(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
						}
						else if (moveselector == 2) {
							System.out.println(enemypokemon2.getName() + " attacks " + userpokemon2.getName() + " using " + enemypokemon2.getMovename2());
							double damage = enemypokemon2.getAttack() * (enemypokemon2.getMovepower2()/100);
							if (enemypokemon2.getMovecategory2().equals("Physical")) {
								double finaldamage = damage - userpokemon2.getDefense();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype2(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
							else if (enemypokemon2.getMovecategory2().equals("Special")) {
								double finaldamage = damage - userpokemon2.getSp_def();
								finaldamage = finaldamageCalculations(finaldamage, enemypokemon2.getMovetype2(), userpokemon2.getType1(), userpokemon2.getType2());
								
								userpokemon2.setHp(userpokemon2.getHp() - finaldamage);
							}
						}
					}
					hpInfo();
					try {
			            Thread.sleep(2000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				}
				
			}
			
			if (enemypokemon1.getHp() <= 0 && enemypokemon2.getHp() <= 0) {
				battlestatus = "No";
				outcome = 1;
			}
			else if (userpokemon1.getHp() <= 0 && userpokemon2.getHp() <= 0) {
				battlestatus = "No";
				outcome = 2;
			}
		}
		return outcome;
	}
	
	
	private String moveSelector(String name, String move1, String move2) {
		String move = "";
		System.out.println("It is " + name + "'s turn.");
		
		System.out.println("Please select a move");
		
		System.out.println("1) " + move1);
		System.out.println("2) " + move2);
		
		int loop_tracker = 1;
		while (loop_tracker == 1) {
			System.out.print(">>> ");
			String chosen_move = keyboard.next();
			
			if (chosen_move.equals("1")) {
				loop_tracker++;
				move = move1;
				}
			else if (chosen_move.equals("2")) {
				loop_tracker++;
				move = move2;
			}
			else {
				System.out.println("Please select a move");
				
				System.out.println("1) " + move1);
				System.out.println("2) " + move2);
			}
		}
		return move;
	}
	
	
	private String targetSelector() {
		String name = "";
		System.out.println("Please select a target");

		System.out.println("1) " + enemypokemon1.getName());
		System.out.println("2) " + enemypokemon2.getName());
		
		int loop_tracker = 1;
		while (loop_tracker == 1) {
			System.out.print(">>> ");
			String chosen_enemy = keyboard.next();
			
			if (chosen_enemy.equals("1")) {
				loop_tracker++;
				name = enemypokemon1.getName();
				
				}
			else if (chosen_enemy.equals("2")) {
				loop_tracker++;
				name = enemypokemon2.getName();
				
			}
			else {
				System.out.println("Please select a target");
				
				System.out.println("1) " + enemypokemon1.getName());
				System.out.println("2) " + enemypokemon2.getName());
			}
		}
		return name;
	}

	private void attackSimulation1(String move, String target) {
		if (move.equals(userpokemon1.getMovecode1())) {
			double damage = userpokemon1.getAttack() * (userpokemon1.getMovepower1()/100);
			if (target.equals(enemypokemon1.getName())) {				
				if (userpokemon1.getMovecategory1().equals("Physical")) {
					double finaldamage = damage - enemypokemon1.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype1(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
				
				else if (userpokemon1.getMovecategory1().equals("Special")) {
					double finaldamage = damage - enemypokemon1.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype1(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
			}
			
			else if (target.equals(enemypokemon2.getName())) {				
				if (userpokemon1.getMovecategory1().equals("Physical")) {					
					double finaldamage = damage - enemypokemon2.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype1(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
				
				else if (userpokemon1.getMovecategory1().equals("Special")) {
					double finaldamage = damage - enemypokemon2.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype1(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
			}
		}
		else if (move.equals(userpokemon1.getMovecode2())) {			
			double damage = userpokemon1.getAttack() * (userpokemon1.getMovepower2()/100);
			System.out.println("damage = " + userpokemon1.getAttack() + " * (" + userpokemon1.getMovepower2() + "/100) = " + damage);
			if (target.equals(enemypokemon1.getName())) {
				if (userpokemon1.getMovecategory2().equals("Physical")) {
					double finaldamage = damage - enemypokemon1.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype2(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
				
				else if (userpokemon1.getMovecategory2().equals("Special")) {
					double finaldamage = damage - enemypokemon1.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype2(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
			}
			
			else if (target.equals(enemypokemon2.getName())) {
				if (userpokemon1.getMovecategory2().equals("Physical")) {
					double finaldamage = damage - enemypokemon2.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype2(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
				
				else if (userpokemon1.getMovecategory2().equals("Special")) {
					double finaldamage = damage - enemypokemon2.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon1.getMovetype2(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
			}	
		}
		hpInfo();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	private void attackSimulation2(String move, String target) {
		if (move.equals(userpokemon2.getMovecode1())) {			
			double damage = userpokemon2.getAttack() * (userpokemon2.getMovepower1()/100);
			if (target.equals(enemypokemon1.getName())) {				
				if (userpokemon2.getMovecategory1().equals("Physical")) {
					double finaldamage = damage - enemypokemon1.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype1(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
				
				else if (userpokemon2.getMovecategory1().equals("Special")) {
					double finaldamage = damage - enemypokemon1.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype1(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
			}
			
			else if (target.equals(enemypokemon2.getName())) {				
				if (userpokemon2.getMovecategory1().equals("Physical")) {
					double finaldamage = damage - enemypokemon2.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype1(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
				
				else if (userpokemon2.getMovecategory1().equals("Special")) {
					double finaldamage = damage - enemypokemon2.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype1(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
			}
		}
		else if (move.equals(userpokemon2.getMovecode2())) {
			double damage = userpokemon2.getAttack() * (userpokemon2.getMovepower2()/100);
			if (target.equals(enemypokemon1.getName())) {		
				if (userpokemon2.getMovecategory2().equals("Physical")) {
					double finaldamage = damage - enemypokemon1.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype2(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
				
				else if (userpokemon2.getMovecategory2().equals("Special")) {
					double finaldamage = damage - enemypokemon1.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype2(), enemypokemon1.getType1(), enemypokemon1.getType2());
					
					enemypokemon1.setHp(enemypokemon1.getHp() - finaldamage);
				}
			}
			
			else if (target.equals(enemypokemon2.getName())) {			
				if (userpokemon2.getMovecategory2().equals("Physical")) {
					double finaldamage = damage - enemypokemon2.getDefense();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype2(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
				
				else if (userpokemon2.getMovecategory2().equals("Special")) {
					double finaldamage = damage - enemypokemon2.getSp_def();
					finaldamage = finaldamageCalculations(finaldamage, userpokemon2.getMovetype2(), enemypokemon2.getType1(), enemypokemon2.getType2());
					
					enemypokemon2.setHp(enemypokemon2.getHp() - finaldamage);
				}
			}
		}
		hpInfo();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	// Allows the ai to select their targets and their moves
	private void randomTargetselector() {
		targetselector = random.nextInt(2) + 1;
		moveselector = random.nextInt(2) + 1;
	}
	
	// Calculations to obtain the damage dealt after factoring in type modifiers
	private double finaldamageCalculations(double finaldamage, String attackingtype, String defendingtype1, String defendingtype2) {
		finaldamage = Math.ceil(finaldamage);
		finaldamage = type_calculations.type_checker(finaldamage, attackingtype, defendingtype1);
		finaldamage = type_calculations.type_checker(finaldamage, attackingtype, defendingtype2);
		finaldamage = Math.ceil(finaldamage);
		finaldamage = type_calculations.finalDamagechecker(finaldamage, attackingtype, defendingtype1, defendingtype2);
		
		return finaldamage;
	}
	
	// Showcases the HP of the users's pokemon and the ai pokemon
	private void hpInfo() {
		System.out.println("\nUser Pokemon");
		System.out.println(userpokemon1.getName() + ": " + userpokemon1.getHp() + "hp");
		System.out.println(userpokemon2.getName() + ": " + userpokemon2.getHp() + "hp \n");
		
		System.out.println("Enemy Pokemon");
		System.out.println(enemypokemon1.getName() + ": " + enemypokemon1.getHp() + "hp");
		System.out.println(enemypokemon2.getName() + ": " + enemypokemon2.getHp() + "hp \n");
	}
}
