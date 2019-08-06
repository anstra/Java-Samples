// Andy Straavaldson
// 1371913
// Section AM
// Program compares two students using SAT/ACT scores and says which one
// is the better student

import java.util.*;
public class Scores {
   public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      
      intro();
      double student1 = test(sc,1);
      double student2 = test(sc,2);
      total(student1, student2);
   }
   
   // displays the intro message to the user
   public static void intro () {
      System.out.println("This program compares two applicants to");
      System.out.println("determine which one seems like the stronger");
      System.out.println("applicant.  For each candidate I will need");
      System.out.println("either SAT or ACT scores plus a weighted GPA.");
      System.out.println();
   }
   
   // calculates the score based on given SAT scores
   public static double SAT (Scanner sc){
      System.out.print("SAT Math? ");
      int Math=sc.nextInt();
      System.out.print("SAT Critical Reading? ");
      int Reading=sc.nextInt();
      System.out.print("SAT Writing? ");
      int Writing=sc.nextInt();
      double score = ((Math * 2) + Reading + Writing ) / 32;
      System.out.println("exam score = " + score) ;
      return score;
   }
   
   // calculates the score based on given ACT scores
   public static double ACT (Scanner sc){
      System.out.print("ACT English? ");
      int English = sc.nextInt();
      System.out.print("ACT Math? ");
      int Math = sc.nextInt();
      System.out.print("ACT Reading? ");
      int Reading = sc.nextInt();
      System.out.print("ACT Science? ");
      int Science = sc.nextInt();
      double score = English + ((2 * Math) + Reading + Science) / 1.8;
      System.out.println("exam score = " + score );
      return score;
   }
   
   // brings in total scores of both student and compares them and says which is better
   public static void total (double student1, double student2){
      System.out.println("First applicant overall score  = " + student1);
      System.out.println("Second applicant overall score  = " + student2);
      if (student1 > student2){
         System.out.println("The first applicant seems to be better");
      } else if (student2 > student1) {
         System.out.println("The second applicant seems to be better");
      } else {
         System.out.println("The two applicants seem to be equal");
      }
      
      
   }
   
   // calculate the score of-0 Remember to state all parameters being passed in. In addition you should also remember to say what is being returned :) the GPA of the student
   public static double GPA (Scanner sc) {
      System.out.print("overall GPA? ");
      double overall = sc.nextDouble();
      System.out.print("Max GPA? ");
      double max = sc.nextDouble();
      System.out.print("Transcript Multiplier? ");
      double multiplier = sc.nextDouble();
      
      double Gscore = (overall / max) * 100 * multiplier;
      System.out.println("GPA score = " + Gscore);
      System.out.println();
      return Gscore;
      
   }
   
   // prompts the user on which test they took and adds the scores from each to the GPA score
   public static double test(Scanner sc, int student){
      
      System.out.println("Information for applicant #" +student+ ":");
      System.out.print ("do you have 1) SAT scores or 2) ACT scores? ");
      double testScore=0;
      if (sc.nextInt() == 1){
         testScore = SAT(sc);
      } else {
         testScore =  ACT(sc);
      }
      double gpaScore = GPA(sc);
      
      return (testScore + gpaScore);
   }
}
  
