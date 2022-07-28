import java.util.Scanner;
class RPS 
{
  public static void main(final String[] args){
    //Scanner
    final Scanner input = new Scanner(System.in);
    //Variables
    final int max = 3;
    final int min = 1;
    int userchoice = 0;
    int pcchoice = 0;
    int plays = 0;
    int wins = 0, losses = 0, ties = 0;
    //User Choice
    System.out.println("Welcome to Josiah's Games of RPS (Rock, Paper, Scissors)!!" + "\nThe Program has already decided what it wants to throw..." + "\n\nHere are your options cooresponding to #'s:");
    System.out.println("1 = Scissors");
    System.out.println("2 = Paper");
    System.out.println("3 = Rock");
    System.out.println("\n*DISCLAIMER*\nAfter selecting a # of plays, type anthing other than numbers 1-3 to terminate the program");
    System.out.println("\nHow many times do you want to play?");
    plays = input.nextInt();
    for (int x = 0; x < plays; x++){
      pcchoice = (int)(Math.random()*((max - min) + 1)) + min;
      System.out.println("\n----------------------------\nWhat is your choice?");
      userchoice = input.nextInt();
      input.close();
      if (userchoice == 1){
        System.out.println("Your Choice: Scissors (1)");
      }
      else if (userchoice == 2){
        System.out.println("Your Choice: Paper (2)");
      }
      else if (userchoice == 3){
        System.out.println("Your Choice: Rock (3)");
      }
      else{
        System.out.println("Your Choice: " + userchoice + "\nYou have terminated the program");
        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
        return;
      }
    if (userchoice == 1 && pcchoice == 1){
      System.out.println("USER CHOICE:");
      choose1();
      System.out.println("PC CHOICE:");
      choose1();
      System.out.println("IT IS A TIE");
      ties++;
    }
    else if (userchoice == 1 && pcchoice == 2){
      System.out.println("USER CHOICE:");
      choose1();
      System.out.println("PC CHOICE:");
      choose2();
      System.out.println("YOU WIN");
      wins++;
    }
    else if (userchoice == 1 && pcchoice == 3){
      System.out.println("USER CHOICE:");
      choose1();
      System.out.println("PC CHOICE:");
      choose3();
      System.out.println("YOU LOSE");
      losses++;
    }
    else if (userchoice == 2 && pcchoice == 1){
      System.out.println("USER CHOICE:");
      choose2();
      System.out.println("PC CHOICE:");
      choose1();
      System.out.println("YOU LOSE");
      losses++;
    }
    else if (userchoice == 2 && pcchoice == 2){
      System.out.println("USER CHOICE:");
      choose2();
      System.out.println("PC CHOICE:");
      choose2();
      System.out.println("IT IS A TIE");
      ties++;
    }
    else if (userchoice == 2 && pcchoice == 3){
      System.out.println("USER CHOICE:");
      choose2();
      System.out.println("PC CHOICE:");
      choose3();
      System.out.println("YOU WIN");
      wins++;
    }
    else if (userchoice == 3 && pcchoice == 1){
      System.out.println("USER CHOICE:");
      choose3();
      System.out.println("PC CHOICE:");
      choose1();
      System.out.println("YOU WIN");
      wins++;
    }
    else if (userchoice == 3 && pcchoice == 2){
      System.out.println("USER CHOICE:");
      choose3();
      System.out.println("PC CHOICE:");
      choose2();
      System.out.println("YOU LOSE");
      losses++;
    }
    else if (userchoice == 3 && pcchoice == 3){
      System.out.println("USER CHOICE:");
      choose3();
      System.out.println("PC CHOICE:");
      choose3();
      System.out.println("IT IS A TIE");
      ties++;
    }
    }
    System.out.print("\n----------------------\nWins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);
  }
  public static void drawScissors(){
    System.out.println("         _                     ");
    System.out.println(" ___ ___|_|___ ___ ___ ___ ___ ");
    System.out.println("|_ -|  _| |_ -|_ -| . |  _|_ -|");
    System.out.println("|___|___|_|___|___|___|_| |___|");
  }
  public static void drawPaper(){
    System.out.println(" ___ ___ ___ ___ ___ ");
    System.out.println("| . | .'| . | -_|  _|");
    System.out.println("|  _|__,|  _|___|_|  ");
    System.out.println("|_|     |_|          ");
  }
  public static void drawRock(){
    System.out.println("             _   ");
    System.out.println(" ___ ___ ___| |_ ");
    System.out.println("|  _| . |  _| '_|");
    System.out.println("|_| |___|___|_,_|");
  }
  public static void choose1(){
    drawScissors();
  }
  public static void choose2(){
    drawPaper();
  }
  public static void choose3(){
    drawRock();
  }
}