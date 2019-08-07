// Program creates a guessing game and gives stats back to the user
// based on how many guesses are used per game


import java.util.*;
public class Guess {
   public static final int MAX=100 ;
   public static void main (String [] args) {
      Scanner user=new Scanner (System.in);
      intro();
      int totalGuess = playGame(user);
      int bestGame = totalGuess;
      int totalGames = 1;
      System.out.print("Do you want to play again? ");
      while (user.next().toLowerCase().substring(0,1).equals("y")){
         int numGuess = playGame(user);
         if (numGuess < bestGame){
            bestGame = numGuess;
         }
         totalGuess += numGuess;
         totalGames++;
         System.out.print("Do you want to play again? ");
      }
      stats(bestGame, totalGames, totalGuess);
   }
   
   // Prints out the intro to the game
   public static void intro (){
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and ");
      System.out.println("100 and will allow you to guess until");
      System.out.println("you get it.  For each guess, I will tell you");
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess.");
   }
   
   //This method runs the main game portion where you guess the number
   //it tells you if your guess is too high or too low
   public static int playGame (Scanner user){
      Random random = new Random ();
      System.out.println();
      System.out.println("I'm thinking of a number between 1 and "+ MAX +"...");
      int num = random.nextInt(MAX)+1;
      int guess = 0;
      int numGuess = 0;
      while (guess != num){
         numGuess++;
         System.out.print("Your guess? ");
         guess = user.nextInt();
         if (guess < num){
            System.out.println("It's higher.");
         } else if (guess > num) {
            System.out.println("It's lower.");  
         }
      }
      // this tells the user how many guesses it took to get it right and returns the data
      // from the game
      System.out.println("You got it right in "+numGuess+" guesses");
      return numGuess;
    }
   
   
   //this method gives the user their game stats once they want to stop playing
   //using their best game and total games and their guesses
   public static void stats(int bestGame, int totalGames, int totalGuess){
      System.out.println();
      System.out.println("Overall results:");
      System.out.println("    Total games   = " +totalGames);
      System.out.println("    Total guesses = " +totalGuess);
      System.out.printf("    Guesses/game  = %.1f\n", ((double)totalGuess)/totalGames);
      System.out.println("    Best game     = "+bestGame);
   }
}

  
