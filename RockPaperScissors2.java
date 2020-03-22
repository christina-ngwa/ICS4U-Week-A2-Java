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

public class RockPaperScissors2 {
  /**
  * This method asks user for an attack.
  */
  public static void main(String[] args) throws IOException {

    // variables
    String [] attacks = {"rock", "paper", "scissors"};
    String result;
    String userAttackString;
    int userAttack;

    // generate random attack
    Random rand = new Random();
    int randAttack = rand.nextInt(2);
    String myAttack = attacks[randAttack];

    // reads user input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Let’s play rock-paper-scissors.");

    while (true) {
      System.out.print("\nEnter an attack: ");
      userAttackString = br.readLine();
      if (userAttackString.equals("rock")) {
        userAttack = 0;
        break;
      } else if (userAttackString.equals("paper"))  {
        userAttack = 1;
        break;
      } else if (userAttackString.equals("scissors")) {
        userAttack = 2;
        break;
      } else {
        System.out.println("Please choose a valid attack.");
      }
    }

    // call method
    result = battleField(userAttack, randAttack);

    // output
    System.out.print("\nI chose " + myAttack + ". " + result);
  }

  /**
  * This method returnz the result of the battle.
  */
  public static String battleField(int userAttack, int randAttack) {

    // variables
    String result;
    int sum;

    sum = userAttack + randAttack;

    // process
    if (userAttack == randAttack) {
      result = "It was a tie.";
    } else if (sum == 2) {
      result = "Rock wins.";
    } else if (sum == 3) {
      result = "Scissors wins.";
    } else {
      result = "Paper wins.";
    }
    return result;
  }
}