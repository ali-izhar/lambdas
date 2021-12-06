package college;

import java.util.HashMap;
import java.util.function.Consumer;

public class Game {
	
	public static final int NUMBER_OF_CLUBS = 0;
	public static final int NUMBER_OF_FRIENDS = 1;
	public static final int MONEY = 225;
	public static final int HAPPINESS = 20;
	public static final double GPA = 3.0;
	public static final int LAST_SQUARE = 26;
	
	public static HashMap<Integer, String> squareText = new HashMap<Integer, String>();
	static {
		squareText.put(1, "Fall asleep in class.");
		squareText.put(2, "Roommate comforts you.");
		squareText.put(3, "Roommate needs a loan.");
		squareText.put(4, "Skip class to travel to New York.");
		squareText.put(5, "Pull an all nighter.");
		squareText.put(6, "Move ahead two spaces.");
		squareText.put(7, "Join a club.");
		squareText.put(8, "Help classmate study.");
		squareText.put(9, "Kick ass on midterms.");
		squareText.put(10, "Throw major party.");
		squareText.put(11, "Get caught buying paper from web.");
		squareText.put(12, "Roommate pays you back - with interest!");
		squareText.put(13, "Lose a friend.");
		squareText.put(14, "Join a club.");
		squareText.put(15, "Turn research entrepeneurial.");
		squareText.put(16, "Fail DSA");
		squareText.put(17, "Dean discovers your illegal party.");
		squareText.put(18, "Win eSports tournament.");
		squareText.put(19, "Join Honors Club.");
		squareText.put(20, "Gain 2 friends.");
		squareText.put(21, "Robbed!");
		squareText.put(22, "Study hard for Calculus III.");
		squareText.put(23, "Senioritis!");
		squareText.put(24, "Borry money from friend; forget to repay.");
		squareText.put(25, "Get graduation gift from Aunt June.");
		squareText.put(26, "GRADUATED!");
	}
	
	public static HashMap<Integer, Consumer<Player>> actions = new HashMap<Integer, Consumer<Player>>();
	static {
		actions.put(1, player -> player.setGpa(player.getGpa() - 0.1*player.getGpa()));
		actions.put(2, player -> player.setHappiness(player.getHappiness() + 5));
		actions.put(3, player -> player.setMoney(player.getMoney() - 200));	
		actions.put(4, player -> {player.setHappiness(player.getHappiness() + 10); player.setGpa(player.getGpa() - 0.2);});	
		actions.put(5, player -> {player.setHappiness(player.getHappiness() - 3); player.setGpa(player.getGpa() + 0.1);});
		actions.put(6, player -> player.setLocation(player.getLocation() + 2));
		actions.put(7, player -> player.setNumberOfClubs(player.getNumberOfClubs() + 1));
		actions.put(8, player -> player.setNumberOfFriends(player.getNumberOfFriends() + 1));
		actions.put(9, player -> player.setGpa(player.getGpa() + 0.2));		
		actions.put(10, player -> {player.setNumberOfFriends(player.getNumberOfFriends() + 2); player.setMoney(player.getMoney() - 100);});	
		actions.put(11, player -> {player.setMoney(player.getMoney() - 100); player.setGpa(player.getGpa() - 0.5);});	
		actions.put(12, player -> player.setMoney(player.getMoney() + 220));
		actions.put(13, player -> player.setNumberOfFriends(player.getNumberOfFriends() - 1));
		actions.put(14, player -> player.setNumberOfClubs(player.getNumberOfClubs() + 1));
		actions.put(15, player -> {player.setGpa(player.getGpa() + 0.8); player.setMoney(player.getMoney() + 2000);});		
		actions.put(16, player -> {player.setLocation(player.getLocation() - 3); player.setGpa(player.getGpa() - 0.5);});		
		actions.put(17, player -> player.setHappiness(player.getHappiness() - 12));
		actions.put(18, player -> {player.setHappiness(player.getHappiness() + 10); player.setMoney(player.getMoney() + 1000);});	
		actions.put(19, player -> player.setGpa(player.getGpa() + 1.0));
		actions.put(20, player -> player.setNumberOfFriends(player.getNumberOfFriends() + 2));
		actions.put(21, player -> player.setMoney(player.getMoney() - 300));	
		actions.put(22, player -> {player.setHappiness(player.getHappiness() - 7); player.setGpa(player.getGpa() + 0.3);});	
		actions.put(23, player -> {player.setGpa(player.getGpa() - 0.2*player.getGpa()); player.setMoney(player.getMoney() - 400);});	
		actions.put(24, player -> {player.setMoney(player.getMoney() + 150); player.setNumberOfFriends(player.getNumberOfFriends() - 1);});	
		actions.put(25, player -> {player.setMoney(player.getMoney() + 750); player.setHappiness(player.getHappiness() + 15);});		
		actions.put(26, player -> System.out.println("GRADUATED!"));
				
	}
	

	public static int roll() {
	   return (int)(Math.random()*6+1);
	}

}
