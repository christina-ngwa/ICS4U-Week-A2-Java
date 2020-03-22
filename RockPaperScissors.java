import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random; 
/**
* This program is the rock-paper-scissors game.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-03-03
*/

public class RockPaperScissors {
  /**
  * This method asks user for an attack.
  */
  public static void main(String[] args) throws IOException {
  
    // variables
    String [] attacks = {"rock", "paper", "scissors"};
    String result;
    String userAttack;

    // generate random attack
    Random rand = new Random();
    String randAttack = attacks[rand.nextInt(2)];
 
    // reads user input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Let’s play rock-paper-scissors.");

    while (true) {
      System.out.print("\nEnter an attack: ");
      userAttack = br.readLine();
      if (userAttack.equals("rock") || userAttack.equals("paper") 
          || userAttack.equals("scissors")) {
        break;
      } else {
        System.out.println("Please choose a valid attack.");
      }
    }

    // call method
    result = battleField(userAttack, randAttack);
  
    // output
    System.out.print("\nI chose " + randAttack + ". " + result);
  }

  /**
  * This method returnz the result of the battle.
  */
  public static String battleField(String userAttack, String randAttack) {
    
    // variables
    String result;

    // process
    if ((userAttack.equals("rock") && randAttack.equals("rock")) 
        || (userAttack.equals("paper") && randAttack.equals("paper")) 
        || (userAttack.equals("scissors") && randAttack.equals("scissors"))) {
      result = "It was a tie.";
    } else if ((userAttack.equals("rock") && randAttack.equals("paper")) 
               || (userAttack.equals("scissors") && randAttack.equals("rock")) 
               || (userAttack.equals("paper") && randAttack.equals("scissors"))) {
      result = "You lose.";
    } else {
      result = "You won.";
    }

    return result;
  }
}