/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 * This class encapsulates all the methods for the fight simulations Three
 * fields for the 3 combatants, appropriately named Another three fields to hold
 * the number of wins for each combatant
 *
 * 
 */

public class Fights {

  // create deadPool object and set his accuracy to 1/3
  Combatant deadpool = new Combatant("Deadpool", 1.0 / 3.0);

  // create kingKong object and set his accuracy to 50%
  Combatant kingkong = new Combatant("Kingkong", 1.0 / 2.0);

  // create spiderman object and set his accuracy to 100%
  Combatant spiderman = new Combatant("Spiderman", 1.0);

  // fields to store the number of wins for each combatant, initialized to zeroes
  int deadpoolWins = 0;
  int kingkongWins = 0;
  int spidermanWins = 0;

  // total fights = the total number of fights to simulate
  int totalFights = 10000;

  /**
   * Resets the number of wins of each combatant object
   */
  public void resetStats() {
    this.deadpoolWins = 0;
    this.kingkongWins = 0;
    this.spidermanWins = 0;
  }

  /**
   * Displays the number of wins of each combatant and equivalent percentage
   */
  public void displayStats() {
      //prints the winner and the percentages of their wins in each strategy
      System.out.println("Deadpool won wins-> " +deadpoolWins+ "/" + totalFights + " or " +(double)(deadpoolWins * 100)/10000 + "%");
      System.out.println("Kingkong won wins-> " +kingkongWins+ "/" + totalFights + " or " +(double)(kingkongWins * 100)/10000 + "%");
      System.out.println("Spiderman won wins-> " +spidermanWins+ "/" + totalFights + " or " +(double)(spidermanWins * 100)/10000 + "%");
  }
  public void singleFight(int strategy) {
    // start with all combatants alive
    deadpool.setIsAlive(true);
    kingkong.setIsAlive(true);
    spiderman.setIsAlive(true);
	
    // this will bet set to true if only one combatant is alive
    boolean oneManLeft = false;
    int roundNumber = 0; // this will be set to 1 to totalFights

    do {
      roundNumber++;
      /* Deadpool first to shoot */
      // Deadpool will do nothing on 1st round if 2nd strategy is used
      // that is, intentionally miss
      
      // in the first strategy deadpool will standstill on the fight thus his strategy is null 
      if (deadpool.isAlive()){
          if (roundNumber == 1 && strategy == 2){
              //null
          }
          else{
              deadpool.shootAtTarget(kingkong);
          }
      }
      /* Kingkong 2nd to shoot */
      //kingkong is next then will shoot spiderman
      if (kingkong.isAlive()){
         kingkong.shootAtTarget(spiderman);
     }
      /* Spiderman last to shoot */
      //spiderman is next then will shoot spiderman
      if (spiderman.isAlive()){
          spiderman.shootAtTarget(deadpool);
      }
	  
      // check if only one combatant is left
      oneManLeft = ((deadpool.isAlive() ^ kingkong.isAlive() ^ spiderman.isAlive())
              ^ (deadpool.isAlive() && kingkong.isAlive() && spiderman.isAlive()));
    } while (!oneManLeft); // loop will terminate if only one combatant is left

    if (deadpool.isAlive()) { // Deadpool wins
      deadpoolWins++;
      System.out.println(deadpool.getFighterName() + " wins."); // for visual check; commented in the final version
    } else if (kingkong.isAlive()) {  // Kingkong wins
      kingkongWins++;
      System.out.println(kingkong.getFighterName() + " wins."); // for visual check; commented in the final version
    } else { // Spiderman wins
      spidermanWins++;
      System.out.println(spiderman.getFighterName() + " wins."); // for visual check; commented in the final version
    }
  }

  /**
   * fights() method simulates the number of fights determined by the field
   * totalFights it keeps track of the number of wins for each combatant and
   * displays the results by calling the displayStats() method
   *
   * @param strategy = 1 for 1st strategy and 2 for 2nd strategy
   *
   */
  public void fights(int strategy) {
    resetStats();
    for (int i = 1; i <= totalFights; i++) {
      singleFight(strategy);
    }
    displayStats();
  }

}
